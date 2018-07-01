package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PolymerTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://shop.polymer-project.org");

		// driver.findElement(By.xpath("//a[contains(text(),'Ladies
		// Outerwear')]")).click();

		WebElement root1 = driver.findElement(By.tagName("shop-tabs"));

		// Get shadow root element
		WebElement shadowRoot1 = expandRootElement(root1);

		WebElement root2 = driver.findElement(By.cssSelector("#tabContainer > shop-tabs > shop-tab:nth-child(2)"));
		WebElement shadowRoot2 = expandRootElement(root2);

//		WebElement root3 = shadowRoot2.findElement(By.cssSelector("cr-toolbar"));
//		WebElement shadowRoot3 = expandRootElement(root3);
		Thread.sleep(5000);

		shadowRoot2.findElement(By.xpath("//a[contains(text(),'Ladies Outerwear')]")).click();
	}

	public static WebElement expandRootElement(WebElement element) {
		WebElement ele = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot",
				element);
		return ele;
	}

}
