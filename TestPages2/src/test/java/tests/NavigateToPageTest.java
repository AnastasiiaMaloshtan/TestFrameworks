package tests;

import main.TestManager;

import org.junit.Test;
import org.testng.Assert;

public class NavigateToPageTest extends TestManager {
	
	@Test
	public void runTest(){
		javaCollectionPage.navigateToJavaCategoryPage();
		Assert.assertTrue(javaCategoryPage.firstParagraphHeader.isDisplayed(), "Element is not displayed while it is expected!");
		System.out.println(javaCategoryPage.firstParagraphHeader.getText());
	}
}
