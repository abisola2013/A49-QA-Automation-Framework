import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest {

    @Test
    public void deletePlaylist(){
        loginWithCorrectCredentials();
        newPlayList();
        deleteNewPlayList();
        notificationDeleteNewPlaylist();

    }


    public void newPlayList(){
        WebElement newPlayList = driver.findElement(By.cssSelector("#playlists :nth-child(4)  a"));
        newPlayList.click();

    }
    public void deleteNewPlayList(){
        WebElement deletePlayList = driver.findElement(By.cssSelector("[data-testid='playlist-context-menu-delete-70382']"));
        WebElement confirmDeleteCommand = driver.findElement(By.cssSelector("body :nth-child(6)  button.ok"));

        deletePlayList.click();
        confirmDeleteCommand.click();

    }
    public void notificationDeleteNewPlaylist(){
        WebElement notificationDeleteNewPlaylist = driver.findElement(By.cssSelector("body .alertify-logs.top.right"));
        Assert.assertTrue(notificationDeleteNewPlaylist.isDisplayed());

    }
}
