package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownhandle {
	
	
	public static void main(String a[]){
		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Documents/chromedriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_dropdown-menu&stacked=h");
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//button[contains(text(),'Dropdown Example')]")).click();
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//button[contains(text(),'Dropdown Example')]//following-sibling::ul//li//a"));
		System.out.println(dropdown.size());
		
		for(int i=0;i<dropdown.size();i++){
			System.out.println(dropdown.get(i).getText());
			if(dropdown.get(i).getText().equals("CSS")){
				dropdown.get(i).click();
				break;
			}
		}
		
	}
	
	
	

}
