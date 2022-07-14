package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.*;

public class MyFirstTest {
	
	public static void main(String args[])
	{

	//WebDriverManager.chromedriver().setup();//base
	
	
	//WebDriver driver=new ChromeDriver();//base
	
	//driver.get("https://www.facebook.com/");//properties
	driver.findElement(By.id("email")).sendKeys("mohdziaul@ymail.com");
	//driver.findElement(By.id("email)).sendKeys("mohdziaul@ymail.com");
	driver.findElement(By.id("pass")).sendKeys("9336907982");
	driver.findElement(By.name("login")).click();
			

}}
