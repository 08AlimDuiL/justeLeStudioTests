package practice.pineapple.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import practice.pineapple.model.HomePage;
import practice.pineapple.model.MainPage;
import practice.pineapple.runner.order.BaseTest;

public class FeedbackTests extends BaseTest {

    final String headerExpectedResult = "Отзывы";

    @Test
    public void testHederReviewsAfterNavigatingFromHomePage() throws InterruptedException {

        openBaseURL();
        String headerActualResult = new HomePage(getDriver())
                .clickLinkToReviews()
                .getTextHederReviews();

        Assert.assertEquals(headerActualResult, headerExpectedResult);
    }

    @Test

    public void testHederReviewsAfterNavigatingFromMenu() {

        openBaseURL();
        String headerActualResult = new MainPage(getDriver())
                .clickMenuReviews()
                .getTextHederReviews();

        Assert.assertEquals(headerActualResult, headerExpectedResult);
    }
}
