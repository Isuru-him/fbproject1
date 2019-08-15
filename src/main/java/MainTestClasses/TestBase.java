package MainTestClasses;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public WebDriver initializeChromeDriver(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIM\\Desktop\\FB element note\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver; 
	}
	
	public void maximizeWindow(){
		driver.manage().window().maximize();
	}

	public void goTo(String url){
		driver.get(url);
	}
	
	public void getWindowTitle(){
		driver.getTitle();
	}
	
	public void enterText(WebElement element, String text){
		try {
			
			if(element.isDisplayed()){
				
				element.sendKeys(text);
				String enteredValue=element.getText();
				
				if(enteredValue.equals("")){
				 System.out.println("Value has not been entered");
				}
			}
			
		} catch (Exception e) {
			e.getMessage();
		}

	}
	
	
	public void closeBrowser(){
		driver.close();
		driver.quit();
	}
}
