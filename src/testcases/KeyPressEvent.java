package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressEvent {

	@Test
	public void keyEventTest(){
		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/key_presses");
		
		//option1:
		//driver.findElement(By.id("content")).sendKeys(Keys.SPACE);
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "You entered: ENTER");
		
		
		
		
		
	}

}
