import Pages.LoginPage;
import Pages.PlaylistPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    LoginPage loginPage;

    @BeforeMethod
    public  void setup() {
        loginPage = new LoginPage(getThreadDriver());
       getThreadDriver().get(url);
    }

    @Test
    public void loginValidEmailPassword() {

        loginPage.loginWithCorrectCredentials();
    }
    @Test
    public void loginWithInvalidCredentials(){
    loginPage.loginWithInvalidCredentials();
    }
    @Test
    public void loginEmptyEmail(){
        loginPage.loginWitheEmptyEmail();
    }
    @Test
   public void loginEmptyPassword(){
   loginPage.loginWitheEmptyEmail();
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

