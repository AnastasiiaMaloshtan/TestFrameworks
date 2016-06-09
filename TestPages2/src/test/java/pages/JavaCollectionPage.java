package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.TestManager;

public class JavaCollectionPage {
	
	public JavaCollectionPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/category/java']")
	public WebElement javaSectionLink;
	
	public String javaCollectionPageUrl = "http://www.quizful.net/post/Java-Collections";
	
	public void navigateToJavaCategoryPage () {
		TestManager.getDriver().get(javaCollectionPageUrl);
		javaSectionLink.click();
	}
	
}
