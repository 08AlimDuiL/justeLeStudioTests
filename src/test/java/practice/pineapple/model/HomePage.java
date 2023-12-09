package practice.pineapple.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import practice.pineapple.model.base.BasePage;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

    private final By HEDER_ABOUT_THE_STUDIO = By.xpath(
            "//section[@class='_about_ze3bk_1']/div/h1"
    );
    private final By ALL_HEDERS = By.xpath("//h1");
    private final By LINK_TO_REVIEWS = By.xpath("//section/a[@href='/reviews']");


    public HomePage(WebDriver driver) {
        // ни чего своего делать не нужно, так как драйвер,который нам передадут
        // нужно передать в конструктор BasePage
        super(driver);
    }

    public WebElement getHederAboutTheStudio() {

        return getDriver().findElement(HEDER_ABOUT_THE_STUDIO);
    }

    public List<WebElement> getAllHeaders() {

        return getDriver().findElements(ALL_HEDERS);
    }

    public WebElement getLinkToReviews() throws InterruptedException {

        WebElement link = getDriver().findElement(LINK_TO_REVIEWS);
        Thread.sleep(5000);

        return link;
    }

    public String getTextHederAboutTheStudio() {

        return getText(getHederAboutTheStudio());
    }

    public List<String> getTextAllHeaders() {

        List<String> allHeaders = new ArrayList<>();

        for (WebElement h1 : getAllHeaders()) {
            allHeaders.add(h1.getText());
        }

        return allHeaders;
    }

    public FeedbackPage clickLinkToReviews() {

        getDriver().findElement(By.xpath("//section/a[@href='/reviews']/div/h6")).click();

        return new FeedbackPage(getDriver());
    }
}