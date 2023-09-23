package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.UUID;

public class ProfilePage extends BasePage {

    @FindBy(css ="[ name='name']")
    WebElement provideProfileName;
    @FindBy(css ="[name='current_password']")
    WebElement currentPassword;
    @FindBy(css ="button.btn-submit")
    WebElement clickSaveButton;

   @FindBy(css = "div.success.show")
    WebElement popUpMessage;

    @FindBy(css ="a.view-profile>span")
    WebElement actualProfileName;

    public ProfilePage(WebDriver givenDriver) {
        super(givenDriver);
    }

    public ProfilePage provideProfileName(String random) {
        wait.until(ExpectedConditions.visibilityOf(provideProfileName));
      provideProfileName.clear();
      provideProfileName.sendKeys(random);
        return this;
    }

    public String generateRandom() {
        return UUID.randomUUID().toString().replace("", "");
    }

    public ProfilePage provideCurrentPassword(String password) {
       wait.until(ExpectedConditions.visibilityOf(currentPassword));
        currentPassword.clear();
        currentPassword.sendKeys(password);
        return this;
    }

    public ProfilePage clickSaveButton() {
        wait.until(ExpectedConditions.visibilityOf(clickSaveButton));
        clickSaveButton.click();
        return this;
    }

    public ProfilePage waitForPopUpMessage() {
        wait.until(ExpectedConditions.visibilityOf(popUpMessage));
        return this;
    }
    public String getActualProfileName() {
        wait.until(ExpectedConditions.visibilityOf(actualProfileName));
            return actualProfileName.getText();

        }
   }


