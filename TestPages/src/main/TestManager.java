package main;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchPage;


public class TestManager {
	
	public static WebDriver driver; 
    public String baseUrl = "https://www.google.com.ua/";
    protected GoogleSearchPage googleSearchPage;
		
	@Before
	public void initialize() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		googleSearchPage = new GoogleSearchPage();
	}
	
	@After
    public void tearDown(){
        driver.close();
    }
	
    public static WebDriver getDriver(){
        return driver;
    }

    public static void waitForPageToLoad() {
        getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }
	
	
	
	
	
	
}