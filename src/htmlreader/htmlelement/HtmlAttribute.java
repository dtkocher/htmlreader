package htmlreader.htmlelement;

public class HtmlAttribute implements Cloneable {
	
	private String type = "";
	private String value = "";
	
	public HtmlAttribute(){}

	/**
	 * returns the type of attribute 
	 * example: id, class, name, style
	 * 
	 * @return String
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * sets the type of attribute
	 * example: id, class, name, style
	 * 
	 * @param String type
	 * @return void
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * returns the value of the attribute 
	 * 
	 * @return String
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * sets the value of the attribute
	 * 
	 * @param String value
	 * @return void
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	protected HtmlAttribute clone() {
		try{
			return (HtmlAttribute) super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			return new HtmlAttribute();
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!obj.getClass().isAssignableFrom(HtmlAttribute.class))
			return false;
		
		HtmlAttribute attr1 = this;
		HtmlAttribute attr2 = (HtmlAttribute) obj;
		
		if(attr1.getType().equals(attr2.getType()) &&
				attr1.getValue().equals(attr2.getValue()))
			return true;
		
		return false;
	}
	
	@Override
	public String toString() {
		return type+"=\""+value+"\"";
	}
}