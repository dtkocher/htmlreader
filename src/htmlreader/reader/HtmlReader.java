package htmlreader.reader;

import htmlreader.htmlelement.HtmlPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;

public class HtmlReader {
	
	private HtmlPage page = new HtmlPage();
	
	public static void main(String args[])
	{
		try
		{
			HtmlReader reader = new HtmlReader();
			reader.reader("C:\\t.html");
			System.out.println(reader.getHtmlPage());			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
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
			//URL u = new URL(pageUrl);
			//InputStream in = u.openStream();
		    FileInputStream in = new FileInputStream(new File(pageUrl));
			r = new InputStreamReader(in);
		    
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
