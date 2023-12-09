package practice.pineapple.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice.pineapple.model.HomePage;
import practice.pineapple.runner.order.BaseTest;

import java.util.Arrays;
import java.util.List;

public class HomeTests extends BaseTest {

    @Test
    public void testHeaderAbout() {

        final String expectedResult = "О студии";

        openBaseURL();
        String actualResult = new HomePage(getDriver())
                .getTextHederAboutTheStudio();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testAllHeadersOnThePage() {

        List<String> headersExpectedResult = Arrays.asList(
                "О студии",
                "Услуги и цены",
                "Отзывы",
                "Контакты"
        );

        openBaseURL();
        List<String> headersActualResult = new HomePage(getDriver())
                .getTextAllHeaders();

        Assert.assertEquals(headersActualResult, headersExpectedResult);

    }
}
