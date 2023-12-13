package practice.pineapple.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import practice.pineapple.model.base.BasePage;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//h1")
    private List<WebElement> allHeaders;

    @FindBy(xpath = "//section/a[@href='/reviews']/div/h6")
    private WebElement linkToReviews;

    private final By HEDER_ABOUT_THE_STUDIO = By.xpath(
            "//section[@class='_about_ze3bk_1']/div/h1"
    );

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public WebElement getHederAboutTheStudio() {

        return getDriver().findElement(HEDER_ABOUT_THE_STUDIO);
    }

    public String getTextHederAboutTheStudio() {

        return getText(getHederAboutTheStudio());
    }

    public List<String> getTextAllHeaders() {

        List<String> headers = new ArrayList<>();

        for (WebElement h1 : allHeaders) {
            headers.add(h1.getText());
        }

        return headers;
    }

    public FeedbackPage clickLinkToReviews() {
        linkToReviews.click();

        return new FeedbackPage(getDriver());
    }
}