package pages;

import org.openqa.selenium.By;

import components.Locators;
import components.TextInput;
import main.TestManager;

public class GoogleSearchPage extends TestManager {

	private By searchFieldInput = By.id(Locators.SEARCH_FIELD.getValue());
	
	public ResultPage search(String searchParameter){
        TextInput searchField = new TextInput(searchFieldInput);
        searchField.type(searchParameter);
        waitForPageToLoad();
        return new ResultPage();
    }
	
}
