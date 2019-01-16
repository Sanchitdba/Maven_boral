package CustomLibraries;

import org.openqa.selenium.By;

public interface IObjectRepository {
	public By searchTextBox = By.xpath("//input[@id='twotabsearchtextbox']");
	public By searchIcon = By.xpath("//input[@type='submit' and @class='nav-input']");
	public By headingSection = By.xpath("//span[@class='a-color-state a-text-bold']");
}
