package htmlreader.htmlelement;

import java.util.ArrayList;

public class HtmlTagList extends ArrayList<HtmlTag> implements Cloneable {

	private static final long serialVersionUID = 559193007226025643L;
	
	public HtmlTagList(){}
	
	/**
	 * gets list of Tags that have Attribute where class Attribute value=className
	 * 
	 * @param className
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagByClass(String className)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(HtmlTag tag : this)
			if(tag.getAttrs().getAttrByClass(className))
				tags.add(tag.clone());
		
		return tags;
	}
	
	/**
	 * gets list of Tags away <from> the Tag that has Attribute where class Attribute value=className
	 * 
	 * @param className
	 * @param from
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagFromClass(String className, int from)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(int i=0; i<this.size(); i++)
		{
			HtmlTag tag = this.get(i);
			if(tag.getAttrs().getAttrByClass(className)
					&& (i+from)<this.size())
				tags.add(this.get(i+from).clone());			
		}
		
		return tags;
	}
	
	/**
	 * gets list of Tags that have Attribute where class Attribute contains className
	 * 
	 * @param className
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagContainsClass(String className)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(HtmlTag tag : this)
			if(tag.getAttrs().getAttrContainsClass(className))
				tags.add(tag.clone());
		
		return tags;
	}
	
	/**
	 * gets list of Tags away <from> the Tag that has Attribute where class Attribute contains className
	 * 
	 * @param className
	 * @param from
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagFromContainsClass(String className, int from)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(int i=0; i<this.size(); i++)
		{
			HtmlTag tag = this.get(i);
			if(tag.getAttrs().getAttrContainsClass(className)
					&& (i+from)<this.size())
				tags.add(this.get(i+from).clone());			
		}
		
		return tags;
	}
	
	/**
	 * gets list of Tags that have Attribute where name Attribute value=name
	 * 
	 * @param name
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagByName(String name)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(HtmlTag tag : this)
			if(tag.getAttrs().getAttrByName(name))
				tags.add(tag.clone());
		
		return tags;
	}
	
	/**
	 * gets list of Tags away <from> the Tag that has Attribute where name Attribute value=name
	 * 
	 * @param name
	 * @param from
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagFromName(String name, int from)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(int i=0; i<this.size(); i++)
		{
			HtmlTag tag = this.get(i);
			if(tag.getAttrs().getAttrByName(name)
					&& (i+from)<this.size())
				tags.add(this.get(i+from).clone());			
		}
		
		return tags;
	}
	
	/**
	 * gets list of Tags that have Attribute where name Attribute contains name
	 * 
	 * @param name
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagContainsName(String name)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(HtmlTag tag : this)
			if(tag.getAttrs().getAttrContainsName(name))
				tags.add(tag.clone());
		
		return tags;
	}
	
	/**
	 * gets list of Tags away <from> the Tag that has Attribute where name Attribute contains name
	 * 
	 * @param name
	 * @param from
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagFromContainsName(String name, int from)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(int i=0; i<this.size(); i++)
		{
			HtmlTag tag = this.get(i);
			if(tag.getAttrs().getAttrContainsName(name)
					&& (i+from)<this.size())
				tags.add(this.get(i+from).clone());			
		}
		
		return tags;
	}	

	/**
	 * gets list of Tags that have Attribute where id Attribute value=id
	 * 
	 * @param id
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagById(String id)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(HtmlTag tag : this)
			if(tag.getAttrs().getAttrById(id))
				tags.add(tag.clone());
		
		return tags;
	}
	
	/**
	 * gets list of Tags away <from> the Tag that has Attribute where id Attribute value=id
	 * 
	 * @param id
	 * @param from
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagFromId(String id, int from)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(int i=0; i<this.size(); i++)
		{
			HtmlTag tag = this.get(i);
			if(tag.getAttrs().getAttrById(id)
					&& (i+from)<this.size())
				tags.add(this.get(i+from).clone());			
		}
		
		return tags;
	}
	
	/**
	 * gets list of Tags that have Attribute where id Attribute contains id
	 * 
	 * @param id
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagContainsId(String id)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(HtmlTag tag : this)
			if(tag.getAttrs().getAttrContainsId(id))
				tags.add(tag.clone());
		
		return tags;
	}
	
	/**
	 * gets list of Tags away <from> the Tag that has Attribute where id Attribute contains id
	 * 
	 * @param id
	 * @param from
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagFromContainsId(String id, int from)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(int i=0; i<this.size(); i++)
		{
			HtmlTag tag = this.get(i);
			if(tag.getAttrs().getAttrContainsId(id)
					&& (i+from)<this.size())
				tags.add(this.get(i+from).clone());			
		}
		
		return tags;
	}

	/**
	 * gets list of Tags that have Attribute of type=attType and value=attValue
	 * 
	 * @param attType
	 * @param attValue
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagBy(String attType, String attValue)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(HtmlTag tag : this)
			if(tag.getAttrs().getAttrBy(attType, attValue))
				tags.add(tag.clone());
		
		return tags;
	}
	
	/**
	 * gets list of Tags away <from> the Tag that has Attribute of type=attType and value=attValue
	 * 
	 * @param attType
	 * @param attValue
	 * @param from
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagFrom(String attType, String attValue, int from)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(int i=0; i<this.size(); i++)
		{
			HtmlTag tag = this.get(i);
			if(tag.getAttrs().getAttrBy(attType, attValue)
					&& (i+from)<this.size())
				tags.add(this.get(i+from).clone());			
		}
		
		return tags;
	}
	
	/**
	 * gets list of Tags that have Attribute of type=attType and contain attValue
	 * 
	 * @param attType
	 * @param attValue
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagContains(String attType, String attValue)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(HtmlTag tag : this)
			if(tag.getAttrs().getAttrContains(attType, attValue))
				tags.add(tag.clone());
		
		return tags;
	}
	
	/**
	 * gets list of Tags away <from> the Tag that has Attribute of type=attType and contain attValue
	 * 
	 * @param attType
	 * @param attValue
	 * @param from
	 * @return HtmlTagList
	 */
	public HtmlTagList getTagFromContains(String attType, String attValue, int from)
	{
		HtmlTagList tags = new HtmlTagList();
		
		for(int i=0; i<this.size(); i++)
		{
			HtmlTag tag = this.get(i);
			if(tag.getAttrs().getAttrContains(attType, attValue)
					&& (i+from)<this.size())
				tags.add(this.get(i+from).clone());			
		}
		
		return tags;
	}
	
	/**
	 * get the tag <from> the tag passed
	 * 
	 * @param tag
	 * @param from
	 * @return HtmlTag
	 */
	public HtmlTag getFrom(HtmlTag tag, int from)
	{
		for(int i=0; i<this.size(); i++)
		{
			HtmlTag tmpTag = this.get(i);
			if(tmpTag.equals(tag))
				if((i+from)<this.size())				
					return this.get(i+from).clone();
				else
					return null;
		}
		
		return null;
	}
	
	@Override
	/**
	 * does a deep clone of HtmlTagList 
	 * 
	 * @return HtmlTagList
	 */
	public HtmlTagList clone() {
		HtmlTagList tmp = new HtmlTagList();
		
		for(HtmlTag tag : this)
		{
			tmp.add(tag.clone());
		}
		
		return tmp;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o)
			return true;
		
		if(!(o instanceof HtmlTagList))
			return false;
		
		HtmlTagList tags1 = this;
		HtmlTagList tags2 = (HtmlTagList) o;
		
		if(tags1.size()!=tags2.size())
			return false;
		for(int i=0; i<tags1.size(); i++)
			if(!tags1.get(i).equals(tags2.get(i)))
				return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder tmp = new StringBuilder();
		for(HtmlTag tag : this)
		{
			tmp.append(tag);
			tmp.append("\n");
		}
		
		return tmp.toString();
	}
}
