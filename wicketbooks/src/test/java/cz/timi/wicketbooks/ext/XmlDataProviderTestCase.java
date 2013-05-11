package cz.timi.wicketbooks.ext;

import junit.framework.TestCase;

public class XmlDataProviderTestCase extends TestCase {

	public void testLoadBooks() throws Exception {
		XmlDataProvider dataProvider = new XmlDataProvider("src/main/resources/data.xml");

		System.out.println(dataProvider.loadBooks());
	}
	
}
