package cz.timi.wicketbooks.page.home;

import java.util.List;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.Model;
import org.apache.wicket.spring.injection.annot.SpringBean;

import cz.timi.wicketbooks.data.Book;
import cz.timi.wicketbooks.ext.DataProvider;
import cz.timi.wicketbooks.ext.DataProviderFactory;
import cz.timi.wicketbooks.ext.XmlDataProvider;

public class BooksOverview extends BasePage {

	private static final long serialVersionUID = 1L;
	
	private DataProvider dataProvider = new XmlDataProvider("src/main/resources/data.xml");
	
	@SpringBean
	private DataProviderFactory factory;
	
	public BooksOverview() {
		super();
		
		final List<Book> books = dataProvider.loadBooks();
		
		final ListView<Book> lvBooks = new ListView<Book>("listView", books) {
			
			private static final long serialVersionUID = 1L;
			
			@Override
			protected void populateItem(ListItem<Book> item) {
				item.add(new Label("item", Model.of(item.getModelObject().getTitle() + " (" + item.getModelObject().getAuthor() + ")")));
			}
		};
		
		add(lvBooks);
		
		System.out.println(factory.getDataProviders());
	}

}
