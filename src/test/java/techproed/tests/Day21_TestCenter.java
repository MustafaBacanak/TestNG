package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.TestCenterLoginPage;
import techproed.pages.TestCenterSecurePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_TestCenter {

    TestCenterLoginPage testCenterLoginPage = new TestCenterLoginPage();
    TestCenterSecurePage testCenterSecurePage = new TestCenterSecurePage();


    @Test
    public void setTestCenterTest() {
        Driver.getDriver().get(ConfigReader.getProperty("techpro_test_url"));

        testCenterLoginPage.username.sendKeys(ConfigReader.getProperty("techpro_test_username"));
        testCenterLoginPage.password.sendKeys(ConfigReader.getProperty("techpro_test_password"));
        testCenterLoginPage.loginBtn.click();

        Assert.assertTrue(testCenterSecurePage.logOutBtn.isDisplayed());

        testCenterSecurePage.logOutBtn.click();

        Assert.assertTrue(testCenterLoginPage.loginBtn.isDisplayed());

        Driver.closeDriver();
    }
}
