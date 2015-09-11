//importing necessary libraries
import java.io.IOException;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class importHTML {
	
	public importHTML(String url) throws IOException
	{
		//Description of the current status
		System.out.println("Looking into for the files in " + url);
		Document doc = Jsoup.connect(url).get();
		Element body = doc.body();
		
		//retrieve the a tag within the table
		Elements links = body.select("td a");
		for(Element link : links)
		{
			//print out the department and the link
			System.out.println(link.text());
			System.out.println(link.attr("abs:href"));
		}
		
	}
}
