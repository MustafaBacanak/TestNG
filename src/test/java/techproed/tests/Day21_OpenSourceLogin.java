package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourceDashboardPage;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_OpenSourceLogin {

    @Test
    public void openSourceLogin() {

        // Sayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("open_source_url"));

        // Gerekli page'den obje olustur.
        OpenSourcePage openSourcePage = new OpenSourcePage();

        // Objeyi kullanarak configuration.properties'den gerekli bilgileri çek
        openSourcePage.username.sendKeys(ConfigReader.getProperty("open_source_username"));
        openSourcePage.password.sendKeys(ConfigReader.getProperty("open_source_password"));

        // Objeyi kullanarak login butonuna tıkla
        openSourcePage.loginBtn.click();


        // Assert
        OpenSourceDashboardPage openSourceDashboardPage = new OpenSourceDashboardPage();
        Assert.assertTrue(openSourceDashboardPage.dashboardHeader.isDisplayed());

    }
}
