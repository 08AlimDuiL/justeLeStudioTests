package practice.pineapple.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import practice.pineapple.model.base.BasePage;

public class FeedbackPage extends BasePage {

    @FindBy(xpath = "//h1")
    private WebElement heder1;

    public FeedbackPage(WebDriver driver) {

        super(driver);
    }

    public String getTextHederReviews() {

        return getText(heder1);
    }
}
