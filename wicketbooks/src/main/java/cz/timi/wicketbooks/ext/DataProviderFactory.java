package cz.timi.wicketbooks.ext;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataProviderFactory {

	@Autowired
	private List<DataProvider> dataProviders;
	
	public List<DataProvider> getDataProviders() {
		return dataProviders;
	}
	
}
