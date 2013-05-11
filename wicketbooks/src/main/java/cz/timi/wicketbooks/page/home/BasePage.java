package cz.timi.wicketbooks.page.home;

import org.apache.wicket.Component;
import org.apache.wicket.MarkupContainer;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import cz.timi.wicketbooks.app.LibraryApplication;

public class BasePage extends WebPage {
	
	private static final long serialVersionUID = 1L;
	
	private MarkupContainer layout;

	public BasePage() {
		super();
		
		layout = new MarkupContainer("layout") {

			private static final long serialVersionUID = 1L; 
		
		};
		
		((LibraryApplication) getApplication()).getAllPages();
		
		super.add(layout);
		super.add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
    }
	
	@Override
	public Component add(Behavior... behaviors) {
		return layout.add(behaviors);
	}
	
	@Override
	public MarkupContainer add(Component... childs) {
		return layout.add(childs);
	}
	
	@Override
	public MarkupContainer addOrReplace(Component... childs) {
		return layout.addOrReplace(childs);
	}
	
	@Override
	public Component remove(Behavior... behaviors) {
		return layout.remove(behaviors);
	}
	
	@Override
	public MarkupContainer remove(Component component) {
		return layout.remove(component);
	}
	
	@Override
	public MarkupContainer remove(String id) {
		return layout.remove(id);
	}
	
	@Override
	public MarkupContainer removeAll() {
		return layout.removeAll();
	}
	
}
