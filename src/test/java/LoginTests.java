import Pages.LoginPage;
import Pages.PlaylistPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    LoginPage loginPage;

//    @BeforeMethod
//    public  void setup() {
//        loginPage = new LoginPage(getThreadDriver());
//       getThreadDriver().get(url);
//    }

    @Test
    public void loginValidEmailPassword() {
LoginPage loginPage =new LoginPage(getThreadDriver());
        loginPage.loginWithCorrectCredentials();
    }

//    @Test
//    public void inavlidPasswordEmail(){
//
//        loginPage.provideEmail("").providePassword("").clickSubmit("");
//    }

//    @Test
//    public void emptyEmail() {
//
//        loginPage.provideEmail("").providePasword("").clickSubmit("");
//    }
}

