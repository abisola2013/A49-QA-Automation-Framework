import Pages.LoginPage;
import Pages.PlaylistPage;
import org.testng.annotations.Test;

public class CreatePlaylist extends BaseTest {


    @Test
    public void createPlaylist() {
        LoginPage loginPage = new LoginPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);

        loginPage.loginWithCorrectCredentials();
        playlistPage.clickCreatePlaylistBtn()
                    .doubleClickPlayList()
                    .enterNewPlaylist()
                    .clickOnNewPlayList();


    }
    }

