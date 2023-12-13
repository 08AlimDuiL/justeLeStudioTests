package practice.pineapple.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import practice.pineapple.model.base.BasePage;

public class MainPage extends BasePage {

    @FindBy(xpath = "//nav/ul/li/a[@href='/reviews']")
    private WebElement menuReviews;

    public MainPage(WebDriver driver) {

        super(driver);
    }

    public FeedbackPage clickMenuReviews() {
        menuReviews.click();

        return new FeedbackPage(getDriver());
    }
}
