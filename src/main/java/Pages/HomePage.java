package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import MainTestClasses.TestBase;

public class HomePage extends TestBase {

	public HomePage(){
		super();
	}
	
	public void statusUpdate(String yourIdea){
		
		driver.findElement(By.cssSelector("#pagelet_composer>div>div>div>div>div>div>form>div>div>div:nth-of-type(2)>textarea")).click();
		driver.findElement(By.cssSelector("#pagelet_composer>div>div>div>div>div>div>div>div:nth-of-type(2)>div>div>div>div>div>div:nth-of-type(2)>div>div>div>div>div>div>div>div>div>div>div>span>br")).click();
		driver.findElement(By.cssSelector("#pagelet_composer>div>div>div>div>div>div>div>div:nth-of-type(2)>div>div>div>div>div>div:nth-of-type(2)>div>div>div>div>div>div>div>div>div>div>div>span>br")).sendKeys(yourIdea);
		driver.findElement(By.cssSelector("#pagelet_composer>div>div>div>div>div>div>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div:nth-of-type(3)>div:nth-of-type(2)>button")).click();
	}
	
	public void searchPerson(String name){
		driver.findElement(By.cssSelector("._2t-e>._4kny:nth-of-type(2)>div>form>div>div>div>div>input:nth-of-type(2)")).click();
		driver.findElement(By.cssSelector("._2t-e>._4kny:nth-of-type(2)>div>form>div>div>div>div>input:nth-of-type(2)")).sendKeys(name);
		driver.findElement(By.cssSelector("._2t-e>._4kny:nth-of-type(2)>div>form>button")).click();
	}
	
	public int countNoOfStoriesInHomePage(){
		int size =driver.findElements(By.xpath("//iframe")).size();
		size=size-(size-1);
		driver.switchTo().frame(size-1);
		int count=0;
		//JavascriptExecutor js = (JavascriptExecutor) driver;  
		//js.executeScript("document.getElementById('stories_tray').id='isuruID'");
		
		WebElement storyTray = driver.findElement(By.cssSelector("#stories_tray"));
		List<WebElement> storyTrayList =storyTray.findElements(By.tagName("div"));
		storyTrayList.get(0).click();
		count = storyTrayList.size();
		
	
	
		return count;
	}
}
