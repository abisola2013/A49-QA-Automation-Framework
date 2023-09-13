import Pages.HomePage;
import Pages.LoginPage;
import Pages.Profilepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class profilePage extends BaseTest {
//    LoginPage loginPage;
//    HomePage homePage;
//    Profilepage profilepage;


    @Test
    public void changeProfileName() {
        loginPage.loginWithCorrectCredentials();
        homepage.clickAvatar();

        String random = profilePage.generateRandom();

        profilePage.provideCurrentPassword("te$t$tudent")
                   .provideProfileName(random)
                   .clickSaveButton();

         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
         WebElement actualProfileName =driver.findElement(By.cssSelector("a.view-profile>span"));
         Assert.assertEquals(actualProfileName.getText(),random);

    }


    }


