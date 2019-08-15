package Pages;

import org.openqa.selenium.By;

import MainTestClasses.TestBase;

public class LoginPage extends TestBase{

	HomePage homePage;
	String uname;
	String pWord;
	
	public LoginPage(String userName, String password ){
		super();
		this.uname=userName;
		this.pWord=password;
	}

	public HomePage Login(){
		
		driver.findElement(By.cssSelector("#email")).sendKeys(uname);
		driver.findElement(By.cssSelector("#pass")).sendKeys(pWord);
		driver.findElement(By.cssSelector("#loginbutton")).click();
		return new HomePage();
	}
	
}
