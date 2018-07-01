package testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {

	public static WebDriver driver;

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");
		driver = new ChromeDriver();

		driver.get("http://www.google.com");

	}
	
	public void failed() {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(
					"failshot_" + this.getClass().getName() + "_" + ".png"));
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

}
