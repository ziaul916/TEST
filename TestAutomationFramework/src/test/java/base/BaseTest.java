package base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static Properties loc=new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	
	@BeforeMethod//@BeforeTest
	public void setup() throws IOException
	{
		if(driver==null)
		{
		System.out.println("the path is"+System.getProperty("user.dir"));
			 fr=new FileReader(System.getProperty("user.dir")+"\\\\src\\\\test\\\\resources\\\\configfiles\\\\config.properties");
			 fr1=new FileReader(System.getProperty("user.dir")+"\\\\src\\\\test\\\\resources\\\\configfiles\\\\locators.properties");
					 prop.load(fr);
					 loc.load(fr1);
			 	}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"));
		 fr=new FileReader("C:\\\\Workspace\\\\TestAutomationFramework\\\\src\\\\test\\\\resources\\\\configfiles\\\\config.properties");
		{WebDriverManager.chromedriver().setup();//base
		WebDriver driver=new ChromeDriver();//base
		prop.load(fr);
		driver.get(prop.getProperty("testurl"));
		}
		
		
		
		
	}
	@AfterMethod
	public void tearDown()
	{driver.close();}

}
