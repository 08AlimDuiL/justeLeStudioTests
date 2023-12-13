package practice.pineapple.model.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage extends BaseModel {

    public BasePage(WebDriver driver) {

        super(driver);
    }

    public String getText(WebElement element) {

        return element.getText();
    }
}