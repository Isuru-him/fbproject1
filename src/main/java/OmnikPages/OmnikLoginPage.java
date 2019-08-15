package OmnikPages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.ClickAction;

import MainTestClasses.TestBase;

public class OmnikLoginPage extends TestBase{
	
	OmnikHomePage omnikHomePage;
	String uname;
	String pwd;
	
	public OmnikLoginPage(String username, String password){
		super();
		this.uname=username;
		this.pwd=password;
	}
	
	public OmnikHomePage login(){
		
		driver.findElement(By.cssSelector("#uNam")).sendKeys(uname);
		driver.findElement(By.cssSelector("#uPwd")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#Loginning")).click();
		return new OmnikHomePage();
	}
	
}
