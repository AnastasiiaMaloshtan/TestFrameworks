package main;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.JavaCategoryPage;
import pages.JavaCollectionPage;

public class TestManager {
	public static WebDriver driver = new FirefoxDriver();
    public String baseUrl = "https://www.google.com.ua/";
    		
	public JavaCollectionPage javaCollectionPage = new JavaCollectionPage(driver);
	public JavaCategoryPage javaCategoryPage = new JavaCategoryPage(driver);
	
	@Before
	public void initialize() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
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
	
