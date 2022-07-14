package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirstTestFW extends BaseTest{
	@Test(dataProvider="testdata")
	public void LoginTest(String username,String password)
	{
	
	//driver.get("https://www.facebook.com/");//properties
		driver.findElement(By.id(loc.getProperty("nameID"))).sendKeys("username");
		//driver.findElement(By.id("email)).sendKeys("mohdziaul@ymail.com");
		driver.findElement(By.id(loc.getProperty("namePass"))).sendKeys("password");
		driver.findElement(By.id(loc.getProperty("Button"))).click();
	}
		
		@DataProvider(name="testdata")
		public Object tdata()
		{
			return new Object[][]
					
					{"mohdziaularfeen@gmail.com","7210957929"}
		};
		
				

}
}