package practice.pineapple.model.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {

    private final WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver = driver;
    }

    //чтобы этот метод был доступен  только  наследникам
    protected WebDriver getDriver() {
        //будем использовать
        return driver;
    }

    public String getText(WebElement element) {

        return element.getText();
    }
}