package Pages;

import io.netty.channel.unix.IovArray;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {



    @FindBy (css ="input[type='email']")
    WebElement emailAddress;
    @FindBy(css = "input[type='password']")
    WebElement  passwordField;
    @FindBy(css = "button[type='submit']")
    WebElement submitBtn;
    @FindBy(css = "input[type='email']")
    WebElement wrongEmail;
    @FindBy(css = "input[type='password']")
     WebElement wrongPassword;
    @FindBy(css="input[type='email']")
    WebElement emptyEmail;
    public LoginPage(WebDriver driver) {
        super(driver);
        wait= new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public void loginWithCorrectCredentials() {
//       navigateToLoginPage();//lets add the navigation to koel in our @BeforeMethod
        provideEmail();
        providePassword( );
        clickSubmit();


    }

    public void loginWithInvalidCredentials() {
    wrongEmail();
    wrongPassword();
    clickSubmit();

    }

    public void loginWitheEmptyEmail(){
        emptyEmail();
        providePassword();
        clickSubmit();
    }

    public LoginPage provideEmail(){
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

    public  LoginPage  wrongEmail(){
        wait.until(ExpectedConditions.visibilityOf(wrongEmail));
        wrongEmail.clear();
        wrongEmail.sendKeys("oyo@yahoo.com");
        return this;
    }
    public LoginPage wrongPassword(){
        wait.until(ExpectedConditions.visibilityOf(wrongPassword));
        wrongPassword.clear();
        wrongPassword.sendKeys("teststudent");
        return this;
    }

    public LoginPage emptyEmail(){
     wait.until(ExpectedConditions.visibilityOf(emptyEmail));
     emptyEmail.clear();
       emptyEmail.sendKeys("");
             return this;
    }
}