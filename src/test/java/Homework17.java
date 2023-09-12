
import org.testng.annotations.Test;

public class Homework17 extends BaseTest {

    @Test
   public void addSongToPlayList()  {
        loginPage.loginWithCorrectCredentials();
//        Thread.sleep(2000);
        homepage.searchTab("somewhere in the dark")
                .viewAllButton();
        playlistPage.clickOnSong()
                    .addToButton()
                    .bisolaPlayList();

    }



}
