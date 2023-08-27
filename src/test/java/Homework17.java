import org.testng.annotations.Test;

public class Homework17 extends BaseTest {

    @Test
   public static void addSongToPlayList(){
        navigateToLoginPage();
        provideEmail("abisola.omotoso@testpro.io");
        providePassword("te$tStudent");
        clickSubmit();
        searchTab("somewhere in the dark");
        viewAllButton();
        addToButton();
        bisolaPlayList();
    }

}
