package OmnikPages;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import MainTestClasses.TestBase;

public class OmnikHomePage extends TestBase {

	public OmnikHomePage(){
		super();
	}
	
	public void verifyTableHeader(String col1,String col2,String col3,String col4,String col5){
		WebElement tHeader = driver.findElement(By.cssSelector("#table-wrapper>table>thead>tr"));
		List<WebElement> HeaderCols= tHeader.findElements(By.tagName("th"));
		String[]tHeaderExpectedNames = new String[5];
		
		for(int x=0;x<=4;x++){
			tHeaderExpectedNames[x]=HeaderCols.get(x).getText();
			if(x==0){
				org.junit.Assert.assertEquals("Table column mismatch",col1, tHeaderExpectedNames[x]);
			}else if (x==1) {
				org.junit.Assert.assertEquals("Table column mismatch",col2, tHeaderExpectedNames[x]);
			}else if (x==2) {
				org.junit.Assert.assertEquals("Table column mismatch",col3, tHeaderExpectedNames[x]);
			}else if (x==3) {
				org.junit.Assert.assertEquals("Table column mismatch",col4, tHeaderExpectedNames[x]);
			}else if (x==4) {
				org.junit.Assert.assertEquals("Table column mismatch",col5, tHeaderExpectedNames[x]);
			}
		}
		
		
	}

	public void verifyTableBody(String col1,String col2,String col3,String col4,String col5){
		WebElement tBody = driver.findElement(By.cssSelector("#table-wrapper>table>tbody>tr"));
		List<WebElement> HeaderCols= tBody.findElements(By.tagName("th"));
		String[]tBodyExpectedNames = new String[5];
		
		for(int x=0;x<=4;x++){
			tBodyExpectedNames[x]=HeaderCols.get(x).getText();
			if(x==0){
				org.junit.Assert.assertEquals("Table column mismatch",col1, tBodyExpectedNames[x]);
			}else if (x==1) {
				org.junit.Assert.assertEquals("Table column mismatch",col2, tBodyExpectedNames[x]);
			}else if (x==2) {
				org.junit.Assert.assertEquals("Table column mismatch",col3, tBodyExpectedNames[x]);
			}else if (x==3) {
				org.junit.Assert.assertEquals("Table column mismatch",col4, tBodyExpectedNames[x]);
			}else if (x==4) {
				org.junit.Assert.assertEquals("Table column mismatch",col5, tBodyExpectedNames[x]);
			}
		}
		
		
	}

	public void readDailyGeneration(){
		
		int size =driver.findElements(By.xpath("//iframe")).size();
		driver.switchTo().frame(size-1);
		WebElement tBody = driver.findElement(By.cssSelector("g>.highcharts-series.highcharts-series"));
		List<WebElement> HeaderCols= tBody.findElements(By.tagName("rect"));
		//String[]tBodyExpectedNames = new String[5];
		Actions actions = new Actions(driver);
		actions.moveToElement(HeaderCols.get(0)).perform();
		WebElement toolTip = driver.findElement(By.cssSelector(".highcharts-tooltip>text"));
		List<WebElement> tipContents= toolTip.findElements(By.tagName("tspan"));
		String tip1=tipContents.get(0).getText();
		String tip2=tipContents.get(1).getText();
	}

	
}
