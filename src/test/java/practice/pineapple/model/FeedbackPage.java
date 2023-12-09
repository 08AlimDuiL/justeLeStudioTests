package practice.pineapple.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import practice.pineapple.model.base.BasePage;

public class FeedbackPage extends BasePage {

    private final By HEDER_REVIEWS = By.xpath("//h1");

    public FeedbackPage(WebDriver driver) {

        super(driver);
    }

    public WebElement getHederReviews() {

        return getDriver().findElement(HEDER_REVIEWS);
    }

    public String getTextHederReviews() {

        return getText(getHederReviews());
    }
}
