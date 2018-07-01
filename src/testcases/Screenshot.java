package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomTestListener.class)
public class Screenshot extends Base {


	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

	@Test
	public void OnError() {
		Assert.assertEquals(false, true);
	}

}
