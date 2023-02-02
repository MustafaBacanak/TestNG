package techproed.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class OpenSourcePage {

//    Page Objelerini bu sinifda buluruz

//    1. constructor
    public OpenSourcePage(){
//        PageFactory seleniumdan gelen ve bu sayfa elementlerini intantiate etmek icin kullanilir
//        Bu sekilde Sayfa objeleri cagrildiginda null pointer exception alinmaz
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    Page Objelerini Olustur
//    Geleneksel : public WebElement username = Driver.getDriver().findElement(By.name("username"));

    @FindBy (name="username")
    public WebElement username;


    @FindBy (name="password")
    public WebElement password;

    @FindBy (css="button[type='submit']")
    public WebElement loginBtn;


//    By userNameLocate = By.cssSelector("input[name='username']");
//    By passwordLocate = By.cssSelector("input[name='password']");
//    By loginBtnLocate = By.cssSelector("button[type='submit']");


}


