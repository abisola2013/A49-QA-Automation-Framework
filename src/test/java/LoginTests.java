import Pages.LoginPage;
import Pages.PlaylistPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void loginValidEmailPassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCorrectCredentials();
    }

    }


