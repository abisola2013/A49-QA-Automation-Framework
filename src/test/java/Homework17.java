import org.testng.annotations.Test;

public class Homework17 extends BaseTest {

    @Test
   public void addSongToPlayList(){
        navigateToLoginPage();
        provideEmail();
        providePassword();
        clickSubmit();
        searchTab("somewhere in the dark");
        viewAllButton();
        addToButton();
        bisolaPlayList();


    }

}
