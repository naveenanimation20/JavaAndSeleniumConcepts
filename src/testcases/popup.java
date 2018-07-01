package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Documents/chromedriver/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.fullbeauty.com/");
		
		driver.findElement(By.xpath("//a[@href='#close'][1]")).click();
	}

}
