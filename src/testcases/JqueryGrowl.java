package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JqueryGrowl {

	WebDriver driver;
	JavascriptExecutor js;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
	}

	@AfterMethod
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void growlTest() throws InterruptedException {
		driver.get("http://freecrm.com/");

		// Check for jQuery on the page, add it if need be
		js.executeScript("if (!window.jQuery) {"
				+ "var jquery = document.createElement('script'); jquery.type = 'text/javascript';"
				+ "jquery.src = 'https://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js';"
				+ "document.getElementsByTagName('head')[0].appendChild(jquery);" + "}");
		Thread.sleep(5000);

		// Use jQuery to add jquery-growl to the page
		js.executeScript("$.getScript('https://the-internet.herokuapp.com/js/vendor/jquery.growl.js')");

		//js.executeScript("$.getScript('/Users/NaveenKhunteta/Documents/workspace/Test/src/testcases/jquery.growl.js')");

		// Use jQuery to add jquery-growl styles to the page
		js.executeScript("$('head').append('<link rel=\"stylesheet\" "
				+ "href=\"https://the-internet.herokuapp.com/css/jquery.growl.css\" " + "type=\"text/css\" />');");
		Thread.sleep(5000);

		// jquery-growl w/ no frills
		js.executeScript("$.growl({ title: 'GET', message: '/' });");

		// jquery-growl w/ colorized output
		js.executeScript("$.growl.error({ title: 'ERROR', message: 'Some exception is coming' });");
		js.executeScript("$.growl.notice({ title: 'Notice', message: 'your notice message goes here' });");
		js.executeScript("$.growl.warning({ title: 'Warning!', message: 'your warning message goes here' });");
	}

}
