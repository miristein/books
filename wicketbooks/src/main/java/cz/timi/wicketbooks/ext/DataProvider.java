package cz.timi.wicketbooks.ext;

import java.util.List;

import cz.timi.wicketbooks.data.Book;

public interface DataProvider {

	List<Book> loadBooks();
	
	void saveBooks();
	
}
