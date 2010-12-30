package htmlreader.reader;

import htmlreader.htmlelement.HtmlPage;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

public class HtmlReader {
	
	private HtmlPage page = new HtmlPage();
	
	public HtmlReader(){}
	
	/**
	 * reads the web page located at pageUrl
	 * 
	 * @param pageUrl
	 * @throws Exception
	 */
	public void reader(String pageUrl) throws Exception
	{
		InputStreamReader r = null;
		
		try
		{
			ParserDelegator parser = new ParserDelegator();
			URL u = new URL(pageUrl);
		    r = new InputStreamReader(u.openStream());
		    
		    HTMLEditorKit.ParserCallback callback = new HtmlParser(page);
		    parser.parse(r, callback, true);
		}
		catch(Exception e)
		{
			throw e;
		}
		finally
		{
			r.close();
		}
	}
	
	/**
	 * gets the HtmlPage that was produced
	 * 
	 * @return HtmlPage
	 */
	public HtmlPage getHtmlPage()
	{
		return page;
	}
}
