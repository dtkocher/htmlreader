package htmlreader.htmlelement;

public class HtmlPage {
	
	private String url = "";
	private HtmlTagList tags = new HtmlTagList();
	
	public HtmlPage(){}

	/**
	 * gets url of page
	 * 
	 * @return String
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * sets url of page
	 * 
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * returns list of HtmlTags
	 * 
	 * @return HtmlTagList
	 */
	public HtmlTagList getTags() {
		return tags;
	}

	/**
	 * sets list of HtmlTags
	 * 
	 * @param tags
	 */
	public void setTags(HtmlTagList tags) {
		this.tags = tags;
	}	
	
	@Override
	public String toString() {
		return tags.toString();
	}
}
