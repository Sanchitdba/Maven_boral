package CustomLibraries;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UserLibrary implements IObjectRepository{
	WebDriver driver;
	
	//starting browser
	public void startBrowser(String url) throws IOException{
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTestingTutorials\\chromedriver.exe");
		driver = new ChromeDriver();
//		String url = propertiesFunction("testurl");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void inputSearchKeyword(String text) throws IOException{
		WebElement element =driver.findElement(searchTextBox);
		element.sendKeys(text);
//		captureScreenshot();
	}
	public void clickSearch(By text){
		WebElement element =driver.findElement(text);
		element.click();
	}
	public void waitForElementPresent(){
		 WebDriverWait wait = new WebDriverWait (driver, 5);
		 wait.until(ExpectedConditions.presenceOfElementLocated(headingSection));
	}
	public void verifyElementPresent() throws IOException{
		driver.findElement(headingSection)
        .isDisplayed();
//		captureScreenshot();
	}
//	public void captureScreenshot() throws IOException{
//		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshot, new File("D:\\screenshots\\screenshot"+System.currentTimeMillis()+".png"));
//	}
	//closing Browser
	public void closeDriver(){
		driver.close();
	}
}
