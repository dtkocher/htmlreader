package htmlreader.htmlelement;

import java.util.ArrayList;

public class HtmlAttributeList extends ArrayList<HtmlAttribute> implements Cloneable {

	private static final long serialVersionUID = 6986024060722270413L;

	public HtmlAttributeList(){}
	
	/**
	 * returns the attribute that has this class name
	 * 
	 * @param className
	 * @return HtmlAttribute
	 */
	public HtmlAttribute getAttrByClass(String className)
	{
		return getAttrBy("class", className);
	}
	
	/**
	 * returns the attribute that contains this class name
	 * 
	 * @param className
	 * @return HtmlAttribute
	 */
	public HtmlAttribute getAttrContainsClass(String className)
	{
		return getAttrContains("class", className);
	}
	
	/**
	 * returns the attribute that has this name
	 * 
	 * @param name
	 * @return HtmlAttribute
	 */
	public HtmlAttribute getAttrByName(String name)
	{
		return getAttrBy("name", name);
	}
	
	/**
	 * returns the attribute that contains this name
	 * 
	 * @param name
	 * @return HtmlAttribute
	 */
	public HtmlAttribute getAttrContainsName(String name)
	{
		return getAttrContains("name", name);
	}

	/**
	 * returns the attribute that has this id
	 * 
	 * @param id
	 * @return HtmlAttribute
	 */
	public HtmlAttribute getAttrById(String id)
	{
		return getAttrBy("id", id);
	}
	
	/**
	 * returns the attribute that contains this id
	 * 
	 * @param id
	 * @return HtmlAttribute
	 */
	public HtmlAttribute getAttrContainsId(String id)
	{
		return getAttrContains("id", id);
	}

	/**
	 * returns the attribute that is of type=attType and value=attValue
	 * 
	 * @param attType
	 * @param attValue
	 * @return HtmlAttribute
	 */
	public HtmlAttribute getAttrBy(String attType, String attValue)
	{
		for(HtmlAttribute attr : this)
			if(attr.getType().equalsIgnoreCase(attType))
				if(attr.getValue().equalsIgnoreCase(attValue))
					return attr;
		return null;
	}
	
	/**
	 * returns the attribute that is of type=attType and contains value=attValue
	 * 
	 * @param attType
	 * @param attValue
	 * @return HtmlAttribute
	 */
	public HtmlAttribute getAttrContains(String attType, String attValue)
	{
		for(HtmlAttribute attr : this)
			if(attr.getType().equalsIgnoreCase(attType))
				if(attr.getValue().toLowerCase().contains(attValue.toLowerCase()))
					return attr;
		return null;
	}
	
	@Override
	/**
	 * does a none-shallow clone of HtmlAttributeList 
	 * 
	 * @return HtmlAttributeList
	 */
	public HtmlAttributeList clone() {
		HtmlAttributeList tmp = new HtmlAttributeList();
		
		for(HtmlAttribute att : this)
		{
			tmp.add(att.clone());
		}
		
		return tmp;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof HtmlAttribute))
			return false;
		
		HtmlAttributeList list1 = this;
		HtmlAttributeList list2 = (HtmlAttributeList) o;
		
		if(list1.size()!=list2.size())
			return false;
		for(int i=0; i<list1.size(); i++)
			if(!list1.get(i).equals(list2.get(i)))
				return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder tmp = new StringBuilder();
		for(HtmlAttribute att : this)
		{
			tmp.append(att);
			tmp.append(" ");
		}
		
		return tmp.toString();
	}
}
