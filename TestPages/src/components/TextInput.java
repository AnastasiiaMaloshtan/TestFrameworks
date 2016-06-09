package components;

import org.openqa.selenium.By;

public class TextInput extends Element {
 
	public TextInput(By by){
        super(by);
    }

    public void type(String string){
        composeWebElement().clear();
        composeWebElement().sendKeys(string);
    }
}
