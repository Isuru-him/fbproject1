package SanaStagingPages;

import org.openqa.selenium.By;

import MainTestClasses.TestBase;

public class StagingLoginPage extends TestBase{
	
	StagingHomePage stagingHomePage;
	String uname;
	String pwd;
	
	public StagingLoginPage(String userName, String password){
		super();
		this.uname=userName;
		this.pwd=password;
	}

	public StagingHomePage login(){
		
		driver.findElement(By.cssSelector("#Email")).sendKeys(uname);
		driver.findElement(By.cssSelector("#Password")).sendKeys(pwd);
		driver.findElement(By.cssSelector(".btn-login>div>input")).click();
		return new StagingHomePage();
	}
	
}
