import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Homework21 extends BaseTest {

    @Test
    public void renamePlaylist(){
    loginWithCorrectCredentials();
    clickCreatePlaylistBtn();
    doubleClickNewPlayList();
    enterNewPlaylist();
    clickOnNewPlayList();
    renameNewPlaylist();



}

    public void renameNewPlaylist() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));

    }

    public void clickOnNewPlayList() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(""))).click();




    }

    public void doubleClickNewPlayList() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(""))).click();
    }

    public void clickCreatePlaylistBtn() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[ data-testid='sidebar-create-playlist-btn'] ")))
                .click();
    }

    public void enterNewPlaylist() {
        WebElement newPlayListName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(" ")));
        newPlayListName.sendKeys(Keys.chord(Keys.CONTROL,"A",Keys.BACK_SPACE));
        newPlayListName.sendKeys("GreatPlaylist");
        newPlayListName.sendKeys(Keys.ENTER);

    }


}
