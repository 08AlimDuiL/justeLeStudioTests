package practice.pineapple.runner.order;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    private static final String BASE_URL = "http://127.0.0.1:5173";

    private WebDriver driver;

    @BeforeMethod
    protected void beforeMethod() {

        driver = BaseUtils.createDriver();
    }

    @AfterMethod
    protected void afterMethod() {

        driver.quit();
    }

    protected WebDriver getDriver() {

        return driver;
    }

    public void openBaseURL() {

        getDriver().get(BASE_URL);
    }


}
