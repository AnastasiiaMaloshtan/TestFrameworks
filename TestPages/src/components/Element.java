package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static main.TestManager.getDriver;

public class Element {
 
	protected By by;

    protected Element(By by){
        this.by = by;
    }

    protected WebElement composeWebElement(){
        return getDriver().findElement(by);
    }
}
