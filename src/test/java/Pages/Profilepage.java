package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.UUID;

public class Profilepage extends BasePage {

    @FindBy(css ="[ name='name']")
    WebElement provideProfileName;

    public Profilepage(WebDriver givenDriver) {
        super(givenDriver);
    }

    public Profilepage provideProfileName(String random) {
        wait.until(ExpectedConditions.visibilityOf(provideProfileName));
      provideProfileName.clear();
      provideProfileName.sendKeys(random);
        return this;
    }

    public String generateRandom() {
        return UUID.randomUUID().toString().replace("", "");
    }

    public Profilepage provideCurrentPassword(String password) {
        WebElement currentPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='current_password']")));
        currentPassword.clear();
        currentPassword.sendKeys(password);
        return this;
    }

    public Profilepage clickSaveButton() {
        WebElement clickSaveButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn-submit")));
        clickSaveButton.click();
        return this;
    }

    public Profilepage waitForPopUpMessage() {
        WebElement popUpMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
        return this;
    }
    public String getActualProfileName() {
            WebElement actualProfileName = driver.findElement(By.cssSelector("a.view-profile>span"));
            return actualProfileName.getText();



        }
   }


