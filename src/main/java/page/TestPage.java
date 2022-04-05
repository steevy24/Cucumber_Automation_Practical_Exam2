package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class TestPage {

	WebDriver driver;

	public TestPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement WHITE_ELEMENT;


	@FindBy(how = How.XPATH, using = "//*[@id=\"label-first\"]/b")
	WebElement DASHBOARD_HEADER_ELEMENT;
	
	
	

	public void clickOnWhitebox() {
		WHITE_ELEMENT.click();
	}
	public void verifyDashboardHeader() {

		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), "NSS-TODO List v 1.1", "Wrong Page");

	}
	
	
		
	
}
