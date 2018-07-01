package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleAds {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.discountonshopping.com/");
		
		driver.switchTo().frame("aswift_0");
		//driver.switchTo().frame("google_esf");
		driver.switchTo().frame("google_ads_frame1");

		
		Actions action = new Actions(driver);
		//action.click(driver.findElement(By.xpath("//div[@id='cbb']")));

		while(driver.findElement(By.xpath("//div[@id='cbb']")).isDisplayed()){
			action.click(driver.findElement(By.xpath("//div[@id='cbb']//svg")));
		}
		
		
	}

}
