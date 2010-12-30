package htmlreader.reader;

import java.util.Enumeration;
import htmlreader.htmlelement.HtmlAttribute;
import htmlreader.htmlelement.HtmlAttributeList;
import htmlreader.htmlelement.HtmlPage;
import htmlreader.htmlelement.HtmlTag;
import javax.swing.text.AttributeSet;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.html.HTML.Tag;
import javax.swing.text.html.HTMLEditorKit.ParserCallback;

public class HtmlParser extends ParserCallback {
	
	private HtmlPage page;
	
	protected HtmlParser(HtmlPage page)
	{
		this.page = page;
	}	
	
	public void handleStartTag(Tag tag, MutableAttributeSet attributes, int position) {
		HtmlTag htmlTag = new HtmlTag();
		htmlTag.setStartTag(true);
		htmlTag.setSimpleTag(false);
		htmlTag.setTag(tag.toString());
		htmlTag.setAttrs(getAttributes(attributes));
		page.getTags().add(htmlTag);		
	}

	public void handleEndTag(Tag tag, int position) {
		HtmlTag htmlTag = new HtmlTag();
		htmlTag.setStartTag(false);
		htmlTag.setSimpleTag(false);
		htmlTag.setTag(tag.toString());
		page.getTags().add(htmlTag);	
	}

	public void handleText(char[] text, int position) {
		for(int i=page.getTags().size()-1; i>=0; i--)
			if(page.getTags().get(i).isStartTag() &&
					!page.getTags().get(i).isSimpleTag())
			{
				String oldText = page.getTags().get(i).getText();
				StringBuilder newText = new StringBuilder();
				for(char c:text)
					newText.append(c);
				page.getTags().get(i).setText(oldText==null?"":oldText+" "+newText);
				break;
			}
	}

	public void handleSimpleTag(Tag tag, MutableAttributeSet attributes, int position) {
		HtmlTag htmlTag = new HtmlTag();
		htmlTag.setStartTag(true);
		htmlTag.setSimpleTag(true);
		htmlTag.setTag(tag.toString());
		htmlTag.setAttrs(getAttributes(attributes));
		page.getTags().add(htmlTag);		
	}
	
	private HtmlAttributeList getAttributes(AttributeSet attributes)
	{
		HtmlAttributeList attrList = new HtmlAttributeList();
		
		Enumeration<?> e = attributes.getAttributeNames();
		while (e.hasMoreElements()) 
	    {
	    	HtmlAttribute attr = new HtmlAttribute();
	    	
	    	Object name = e.nextElement();
	    	attr.setType(name.toString());
			attr.setValue(attributes.getAttribute(name).toString());
			
			attrList.add(attr);			
	    } 
		
		return attrList;
	}
}
