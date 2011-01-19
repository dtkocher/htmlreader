package htmlreader.htmlelement;

public class HtmlTag implements Cloneable{
	
	private String tag = "";
	private String text = "";
	private boolean startTag = false;
	private boolean simpleTag = false;
	private HtmlAttributeList attrs = new HtmlAttributeList();
	
	public HtmlTag() {}

	/**
	 * gets the type of Tag
	 * example: body, script, a, style
	 * 
	 * @return String
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * sets the type of Tag
	 * example: body, script, a, style
	 * 
	 * @param tag
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	/**
	 * gets Text associated with this Tag
	 * 
	 * @return String
	 */
	public String getText() {
		return text;
	}

	/**
	 * sets Text associated with this Tag
	 * 
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * gets whether this is a start tag or end tag
	 * 
	 * @return boolean
	 */
	public boolean isStartTag() {
		return startTag;
	}

	/**
	 * sets whether this is a start tag or end tag
	 *  
	 * @param startTag
	 */
	public void setStartTag(boolean startTag) {
		this.startTag = startTag;
	}

	/**
	 * gets whether this is a simple tag such as <br>
	 * 
	 * @return boolean
	 */
	public boolean isSimpleTag() {
		return simpleTag;
	}

	/**
	 * sets whether this is a simple tag such as <br>
	 *  
	 * @param simpleTag
	 */
	public void setSimpleTag(boolean simpleTag) {
		this.simpleTag = simpleTag;
	}

	/**
	 * gets list of Attributes associated with this Tag
	 * 
	 * @return HtmlAttributeList
	 */
	public HtmlAttributeList getAttrs() {
		return attrs;
	}

	/**
	 * sets list of Attributes associated with this Tag
	 * 
	 * @param attrs
	 */
	public void setAttrs(HtmlAttributeList attrs) {
		this.attrs = attrs;
	}
	
	@Override
	/**
	 * does a deep clone of HtmlTag 
	 * 
	 * @return HtmlTag
	 */
	protected HtmlTag clone() {
		try{
			HtmlTag tag = (HtmlTag) super.clone();
			tag.setAttrs(attrs.clone());
			return tag;
		}
		catch(CloneNotSupportedException e)
		{
			return null;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof HtmlTag))
			return false;
			
		HtmlTag tag1 = this;
		HtmlTag tag2 = (HtmlTag) obj;
		
		if(tag1.getTag().equals(tag2.getTag()) &&
				tag1.getText().equals(tag2.getText()) &&
				tag1.isStartTag()==tag2.isStartTag() &&
				tag1.isSimpleTag()==tag2.isSimpleTag() &&
				tag1.getAttrs().equals(tag2.getAttrs()))
			return true;
		
		return false;
	}
	
	@Override
	public String toString() {
		if(simpleTag)
			return "<"+tag+" "+attrs+" />"+text+" ";
		else if(startTag)
			return "<"+tag+" "+attrs+">"+text+" ";
		else
			return "</"+tag+" "+attrs+">"+text+" ";
	}
}
