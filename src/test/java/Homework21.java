import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Homework21 extends BaseTest {

    @Test
    public void renamePlaylist(){
    loginWithCorrectCredentials();
    clickCreatePlaylistBtn();
    doubleClickPlayList();
    enterNewPlaylist();
    clickOnNewPlayList();
    doubleClickNewPlaylist();
    renameNewPlaylist();
    playlistNotification();

}

   public String playlistNotification() {
     WebElement successNotification= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(" div.success.show")));
     return successNotification.getText();

    }

    public void doubleClickNewPlaylist() {
       WebElement doubleClickNewPlaylist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(" [data-testid='playlist-context-menu-edit-70515']")));
        actions.moveToElement(doubleClickNewPlaylist).perform();
    }

    public void renameNewPlaylist() {
        WebElement renameNewPlayList =wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[ name='name']")));
        renameNewPlayList.sendKeys(Keys.chord(Keys.CONTROL,"A",Keys.BACK_SPACE));
        renameNewPlayList.sendKeys("DiffPlaylist");
        renameNewPlayList.sendKeys(Keys.ENTER);
    }

    public void clickOnNewPlayList() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#playlists  li:nth-child(4)  a"))).click();


    }

    public void doubleClickPlayList() {
       WebElement doubleClickPlayList=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(" [data-testid='playlist-context-menu-create-simple']")));
        actions.moveToElement(doubleClickPlayList).perform();
    }

    public void clickCreatePlaylistBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[ data-testid='sidebar-create-playlist-btn'] ")))
                .click();
    }

    public void enterNewPlaylist() {
        WebElement newPlayListName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[ name='name']")));
        newPlayListName.sendKeys(Keys.chord(Keys.CONTROL,"A",Keys.BACK_SPACE));
        newPlayListName.sendKeys("GreatPlaylist");
        newPlayListName.sendKeys(Keys.ENTER);

    }


}
