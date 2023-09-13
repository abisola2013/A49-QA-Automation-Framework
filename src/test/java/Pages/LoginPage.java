package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
    }

    @FindBy (css ="input[type='email']")
    WebElement emailAddress;
    @FindBy(css = "input[type='password']")
    WebElement  passwordField;
    @FindBy(css = "button[type='submit']")
    WebElement submitBtn;



    public void loginWithCorrectCredentials() {
       navigateToLoginPage(url);
        provideEmail();
        providePassword( );
        clickSubmit();


    }

    public  LoginPage provideEmail(){
         wait.until(ExpectedConditions.visibilityOf(emailAddress));
        emailAddress.clear();
        emailAddress.sendKeys("abisola.omotoso@testpro.io");
        return this;
    }

    public LoginPage providePassword() {
         wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.clear();
        passwordField.sendKeys("te$t$tudent");
        return this;
    }
    public  LoginPage clickSubmit() {
        wait.until(ExpectedConditions.visibilityOf(submitBtn));
        submitBtn.click();
        return this;
    }
}