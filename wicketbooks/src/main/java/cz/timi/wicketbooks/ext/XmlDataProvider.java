package cz.timi.wicketbooks.ext;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXB;

import org.springframework.stereotype.Service;

import cz.timi.wicketbooks.data.Book;
import cz.timi.wicketbooks.data.Data;

@Service
public class XmlDataProvider implements DataProvider {
	
	private String location;
	
	public XmlDataProvider() {
	}
	
	public XmlDataProvider(String location) {
		this.location = location;
	}

	public List<Book> loadBooks() {
		final Data data = JAXB.unmarshal(new File(location), Data.class);
		
		return data.getBooks();
	}

	public void saveBooks() {
		// TODO
	}
	
	public void setLocation(String location) {
		this.location = location;
	}

}
