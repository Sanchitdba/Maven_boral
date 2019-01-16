package Oracle.Ora;

import java.io.IOException;

import org.testng.annotations.Test;

import CustomLibraries.UserLibrary;
@Test
public class SearchProduct extends UserLibrary{
	
	public void LoginPage() throws IOException{
		startBrowser("https://www.amazon.in/");
		inputSearchKeyword("perfume");
		clickSearch(searchIcon);
		waitForElementPresent();
		verifyElementPresent();
		System.out.println("Successfully Completed");
		closeDriver();
	}
}
