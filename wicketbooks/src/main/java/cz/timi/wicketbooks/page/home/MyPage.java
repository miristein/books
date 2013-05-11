package cz.timi.wicketbooks.page.home;

import org.apache.wicket.markup.html.basic.Label;

public class MyPage extends BasePage {

	private static final long serialVersionUID = 1L;
	
	public MyPage() {
		super();
		
		add(new Label("myLabel", "mylbl"));
	}

}
