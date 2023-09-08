import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest {

    @Test
    public void deletePlaylist() throws InterruptedException {
        loginWithCorrectCredentials();
        Thread.sleep(3000);
        newPlayList();
        Thread.sleep(3000);
        deleteNewPlayList();
        Thread.sleep(3000);
        notificationDeleteNewPlaylist();

    }


    public void newPlayList(){
        WebElement newPlayList = driver.findElement(By.cssSelector(".playlist:nth-child(3)"));
        newPlayList.click();

    }
    public void deleteNewPlayList(){
        WebElement deletePlayList = driver.findElement(By.cssSelector(".del.btn-delete-playlist"));
//        WebElement confirmDeleteCommand = driver.findElement(By.cssSelector(" body  :nth-child(7)  button.ok"));

        deletePlayList.click();
//        confirmDeleteCommand.click();

    }
    public void notificationDeleteNewPlaylist(){
        WebElement notificationDeleteNewPlaylist = driver.findElement(By.cssSelector("div.success.show"));
        Assert.assertTrue(notificationDeleteNewPlaylist.isDisplayed());

    }
}
