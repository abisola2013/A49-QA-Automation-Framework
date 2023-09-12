package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class PlaylistPage extends BasePage {
    //    constructors
    public PlaylistPage(WebDriver driver, WebDriverWait wait, Actions actions) {
        super(driver, wait, actions);

    }

    public PlaylistPage checkNumberOfSongsInPlayList() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
        List<WebElement> allSongsInPlayList = driver.findElements(By.cssSelector(""));
        for (WebElement element : allSongsInPlayList) {
            System.out.println(element.getText());
        }
        Assert.assertEquals(allSongsInPlayList.size(), 3);
        return this;
    }

    public PlaylistPage moveMouseToPLayBtn() {
        WebElement playBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".side.player-controls")));
        actions.moveToElement(playBtn).perform();
        return this;
    }

    public PlaylistPage clickPlay() {
        WebElement clickPlayBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playback")));
        actions.doubleClick(clickPlayBtn).perform();
        return this;
    }

    public PlaylistPage clickOnSong() {
        WebElement clickOnSong = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#songResultsWrapper tr:nth-child(1) td.title")));
        clickOnSong.click();
        return this;
    }

    public PlaylistPage bisolaPlayList() {
        WebElement bisolaPlayList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(" #playlists ul li:nth-child(4) a")));
        actions.click(bisolaPlayList).perform();
//        bisolaPlayList.click();
        return this;
    }

    public PlaylistPage addToButton() {
        WebElement addTo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-add-to")));
        addTo.click();
        return this;
    }

    public PlaylistPage newPlayList() {
        WebElement newPlayList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)")));
        newPlayList.click();
return this;
    }

    public PlaylistPage deleteNewPlayList() {
        WebElement deletePlayList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".del.btn-delete-playlist")));
actions.click(deletePlayList).perform();
return this;

    }

    public PlaylistPage notificationDeleteNewPlaylist() {
        WebElement notificationDeleteNewPlaylist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
        Assert.assertTrue(notificationDeleteNewPlaylist.isDisplayed());
return this;
    }

    public PlaylistPage doubleClickPlayList() {
        WebElement doubleClickPlayList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#playlists nav ul li:nth-child(1)")));
        actions.doubleClick(doubleClickPlayList).perform();
        return this;
    }

    public PlaylistPage clickCreatePlaylistBtn() {
        WebElement clickCreatePlaylistBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-testid='sidebar-create-playlist-btn']")));
        actions.moveToElement(clickCreatePlaylistBtn).perform();
        actions.doubleClick(clickCreatePlaylistBtn).perform();
return this;
    }

    public PlaylistPage enterNewPlaylist() {
        WebElement newPlayListName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[ name='name']")));
        newPlayListName.sendKeys(Keys.chord(Keys.CONTROL, "A", Keys.BACK_SPACE));
        newPlayListName.sendKeys("GreatPlaylist");
        newPlayListName.sendKeys(Keys.ENTER);
return this;
    }

    public PlaylistPage clickOnNewPlayList() {
        WebElement newPlayList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#playlists  li:nth-child(3) a")));
        actions.moveToElement(newPlayList).perform();
        return this;
    }

    public PlaylistPage playlistNotification() {
        WebElement successNotification= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(" div.success.show")));
        successNotification.getText();
return this;
    }

    public PlaylistPage doubleClickNewPlaylist() {
        WebElement firstPlaylistElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#playlists ul li:nth-child(3)")));
        actions.doubleClick(firstPlaylistElement).perform();
        return this;
    }

    public PlaylistPage renameNewPlaylist() {
        WebElement renameNewPlayList =wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[ name='name']")));
        renameNewPlayList.sendKeys(Keys.chord(Keys.CONTROL,"A",Keys.BACK_SPACE));
        renameNewPlayList.sendKeys("DiffPlaylist");
        renameNewPlayList.sendKeys(Keys.ENTER);
        return this;
    }
}