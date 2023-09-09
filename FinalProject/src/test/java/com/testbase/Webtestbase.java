package com.testbase;

import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;

public class Webtestbase {

	public static WebDriver driver;
	public static Properties prop;
	
	public Webtestbase()
	{
		try
		{
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"//properties//config.properties");
			prop = new Properties();
			prop.load(fileInputStream);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void initialization() {
        String browserName = prop.getProperty("browser");
        
        
        if (browserName.equals("chrome")){
if (browserName.equals("chrome")){
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nishath Tanveer\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
        	driver = new ChromeDriver();
    	    driver.navigate().to(prop.getProperty("url"));
           driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           driver.manage().deleteAllCookies();
        }
}
}
	
}
