import Pages.LoginPage;
import Pages.PlaylistPage;
import org.testng.annotations.Test;

public class RenamePlaylistHW21 extends BaseTest {

    @Test
    public void renamePlaylist(){
        LoginPage loginPage = new LoginPage(driver);
        PlaylistPage playlistPage = new PlaylistPage(driver);

        loginPage.loginWithCorrectCredentials();
   playlistPage.doubleClickNewPlaylist()
               .renameNewPlaylist()
               .playlistNotification();

}

//   public void playlistNotification() {
//     WebElement successNotification= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(" div.success.show")));
//       successNotification.getText();
//
//   }
//
//    public void doubleClickNewPlaylist() {
//        WebElement firstPlaylistElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#playlists ul li:nth-child(3)")));
//        actions.doubleClick(firstPlaylistElement).perform();
//    }
//
//    public void renameNewPlaylist() {
//        WebElement renameNewPlayList =wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[ name='name']")));
//        renameNewPlayList.sendKeys(Keys.chord(Keys.CONTROL,"A",Keys.BACK_SPACE));
//        renameNewPlayList.sendKeys("DiffPlaylist");
//        renameNewPlayList.sendKeys(Keys.ENTER);
//    }






}
