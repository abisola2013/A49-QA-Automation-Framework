package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.UUID;

public class Profilepage extends BasePage{
    public Profilepage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);
        String random = generateRandom();
    }

    public Profilepage provideProfileName(String random){
        WebElement profileName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='name']")));
        profileName.clear();
        profileName.sendKeys(random);
        return this;
    }
    public String generateRandom(){
        return UUID.randomUUID().toString().replace("","");
    }

    public Profilepage provideCurrentPassword(String password){
        WebElement currentPassword= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='current_password']")));
        currentPassword.clear();
        currentPassword.sendKeys(password);
        return this;
    }
    public Profilepage clickSaveButton(){
        WebElement clickSaveButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn-submit")));
        clickSaveButton.click();
        return this;
    }
//    WebElement actualProfileName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.view-profile>span")));
//        Assert.assertEquals(actualProfileName.getText(),random);


}
