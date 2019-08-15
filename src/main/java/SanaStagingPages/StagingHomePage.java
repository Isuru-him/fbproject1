package SanaStagingPages;

import org.openqa.selenium.By;

import MainTestClasses.TestBase;

public class StagingHomePage extends TestBase {

	StagingInstallWebstore stagingInstallWebstore;
	
	public StagingHomePage(){
		super();
	}
	
	public StagingInstallWebstore clickOnInstallNewWebStore(){
		
		driver.findElement(By.cssSelector(".nav-pills>li:nth-of-type(1)")).click();
		
		return new StagingInstallWebstore();
	}
	
}
