import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTests extends BaseTest {



    @Test
    public void changeProfileName() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProfilePage profilepage = new ProfilePage(driver);

        loginPage.loginWithCorrectCredentials();
        homePage.clickAvatar();

        String random = profilepage.generateRandom();

        profilepage.provideCurrentPassword("te$t$tudent")
                   .provideProfileName(random);
//        String getActualProfileName;
        profilepage.clickSaveButton()
                   .waitForPopUpMessage();

        Assert.assertEquals(profilepage.getActualProfileName(),random);

    }


    }


