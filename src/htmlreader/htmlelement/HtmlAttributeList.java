package htmlreader.htmlelement;

import java.util.ArrayList;

public class HtmlAttributeList extends ArrayList<HtmlAttribute> implements Cloneable {

	private static final long serialVersionUID = 6986024060722270413L;

	public HtmlAttributeList(){}
	
	/**
	 * returns if it has this class name
	 * 
	 * @param className
	 * @return HtmlAttribute
	 */
	public boolean getAttrByClass(String className)
	{
		return getAttrBy("class", className);
	}
	
	/**
	 * returns if it contains this class name
	 * 
	 * @param className
	 * @return HtmlAttribute
	 */
	public boolean getAttrContainsClass(String className)
	{
		return getAttrContains("class", className);
	}
	
	/**
	 * returns if it has this name
	 * 
	 * @param name
	 * @return HtmlAttribute
	 */
	public boolean getAttrByName(String name)
	{
		return getAttrBy("name", name);
	}
	
	/**
	 * returns if it contains this name
	 * 
	 * @param name
	 * @return HtmlAttribute
	 */
	public boolean getAttrContainsName(String name)
	{
		return getAttrContains("name", name);
	}

	/**
	 * returns if it has this id
	 * 
	 * @param id
	 * @return HtmlAttribute
	 */
	public boolean getAttrById(String id)
	{
		return getAttrBy("id", id);
	}
	
	/**
	 * returns if it contains this id
	 * 
	 * @param id
	 * @return HtmlAttribute
	 */
	public boolean getAttrContainsId(String id)
	{
		return getAttrContains("id", id);
	}

	/**
	 * returns if it is of type=attType and value=attValue
	 * 
	 * @param attType
	 * @param attValue
	 * @return HtmlAttribute
	 */
	public boolean getAttrBy(String attType, String attValue)
	{
		for(HtmlAttribute attr : this)
			if(attr.getType().equalsIgnoreCase(attType))
				if(attr.getValue().equalsIgnoreCase(attValue))
					return true;
		return false;
	}
	
	/**
	 * returns if it is of type=attType and contains value=attValue
	 * 
	 * @param attType
	 * @param attValue
	 * @return HtmlAttribute
	 */
	public boolean getAttrContains(String attType, String attValue)
	{
		for(HtmlAttribute attr : this)
			if(attr.getType().equalsIgnoreCase(attType))
				if(attr.getValue().toLowerCase().contains(attValue.toLowerCase()))
					return true;
		return false;
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
