package practice.pineapple.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import practice.pineapple.model.base.BasePage;

public class MainPage extends BasePage {

    private final By MENU_REVIEWS = By.xpath("//nav/ul/li/a[@href='/reviews']");

    public MainPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getMenuReviews() {

        return getDriver().findElement(MENU_REVIEWS);
    }

    public FeedbackPage clickMenuReviews() {

        getMenuReviews().click();

        return new FeedbackPage(getDriver());
    }
}
