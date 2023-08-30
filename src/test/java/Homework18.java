import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest{

    @Test
    public void playSong(){
        loginWithCorrectCredentials();
        clickOnAllSongs();
        selectSong();
        playASong();
        soundBarVisible();
    }




    public void soundBarVisible() {
        WebElement soundBar = driver.findElement(By.cssSelector("#mainFooter .media-info-wrap .other-controls  button:nth-child(2)  img"));
        Assert.assertTrue(soundBar.isDisplayed());
    }
    public void playASong() {
        WebElement playButton = driver.findElement(By.cssSelector("#mainFooter .side.player-controls .play"));
        playButton.click();
    }
    public void selectSong() {
        WebElement clickOnSong = driver.findElement(By.cssSelector("#songsWrapper .item-container  table  tr.song-item.selected  td.title"));
        clickOnSong.click();
    }

    public void clickOnAllSongs() {
        WebElement allSongs = driver.findElement(By.cssSelector("#sidebar section.music li:nth-child(3) a"));
        allSongs.click();
    }
}
