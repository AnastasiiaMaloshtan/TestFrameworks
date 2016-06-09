package tests;

import main.TestManager;

import org.junit.Assert;
import org.junit.Test;

import pages.ResultPage;

public class GoogleSearchTest extends TestManager {

	 @Test
	    public void search(){
	        ResultPage result = googleSearchPage.search("��������� � java");
	        Assert.assertTrue("Result Page isn't shown", result.isPresent("��������� � java"));
	    }

}
