package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TestCenterSecurePage {

    public TestCenterSecurePage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (css="a[class='btn btn-dark']")
    public WebElement logOutBtn;


}
