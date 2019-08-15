package PagesTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import MainTestClasses.TestBase;
import OmnikPages.OmnikHomePage;
import OmnikPages.OmnikLoginPage;
import Pages.HomePage;
import Pages.LoginPage;
import SanaStagingPages.StagingHomePage;
import SanaStagingPages.StagingInstallWebstore;
import SanaStagingPages.StagingLoginPage;

public class LoginPageTest extends TestBase {

	public LoginPageTest(){
		super();
	}
	
	LoginPage loginPage;
	HomePage homePage;
	OmnikLoginPage OmnikLoginPage;
	OmnikHomePage OmnikHomePage;
	StagingLoginPage stagingLoginPage;
	StagingHomePage stagingHomePage;
	StagingInstallWebstore stagingInstallWebstore;
	
	@Before
	public void setUp(){
		initializeChromeDriver();
	}
	/*
	@Test
	public void difTests(){
		goTo("https://www.omnikportal.com/LoginPage.aspx");
		maximizeWindow();
		OmnikLoginPage = new OmnikLoginPage("hims.rc@gmail.com","lswpom102");
		OmnikHomePage=OmnikLoginPage.login();
		OmnikHomePage.readDailyGeneration();
		
	}
	

	
	@Test
	public void loginTest(){
		goTo("https://www.facebook.com/");
		maximizeWindow();
		loginPage = new LoginPage("hims.rc@gmail.com","i@msHAI12#$");
		homePage=loginPage.Login();
		homePage.countNoOfStoriesInHomePage();
		
	}
	
	*/
	
	
	@Test
	public void loginTest(){
		goTo("https://staging-sanacommercecloud.azurewebsites.net/");
		maximizeWindow();
		stagingLoginPage = new StagingLoginPage("h.madanayaka@sana-commerce.com","i@msHAI12#$");
		stagingHomePage=stagingLoginPage.login();
		stagingInstallWebstore=stagingHomePage.clickOnInstallNewWebStore();
		
	}

	
	
	@After
	public void closure(){
		closeBrowser();
	}
}
