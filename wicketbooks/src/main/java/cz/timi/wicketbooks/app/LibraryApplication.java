package cz.timi.wicketbooks.app;

import java.util.HashMap;
import java.util.Map;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import cz.timi.wicketbooks.page.home.BasePage;
import cz.timi.wicketbooks.page.home.BooksOverview;
import cz.timi.wicketbooks.page.home.MyPage;

/**
 * Application object for your web application. If you want to run this
 * application without deploying, run the Start class.
 * 
 * @see cz.timi.wicketbooks.Start#main(String[])
 */
public class LibraryApplication extends WebApplication {

	private static final Map<String, Class<? extends WebPage>> pages = new HashMap<String, Class<? extends WebPage>>();

	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage() {
		return BooksOverview.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init() {
		super.init();
		
		getComponentInstantiationListeners().add(new SpringComponentInjector(this));
		
		mount("/BasePage", BasePage.class);
		mount("/MyPage", MyPage.class);
		mount("/BooksOverview", BooksOverview.class);
	}

	public void mount(String pageName, Class<? extends WebPage> pageType) {
		mountPage(pageName, pageType);

		pages.put(pageName, pageType);
	}

	public Map<String, Class<? extends WebPage>> getAllPages() {
		return pages;
	}

}
