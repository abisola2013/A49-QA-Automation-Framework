import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class BaseTest {

    public WebDriver driver;

    public String url = "https://qa.koel.app/";
    public static final ThreadLocal<WebDriver> threadDriver =new ThreadLocal<>();
    public static WebDriver getThreadDriver(){
        return threadDriver.get();
    };

    @BeforeClass
    public void setup() throws MalformedURLException {
        threadDriver.set(setupBrowser(!(System.getProperty("browser") == null)?System.getProperty("browser") : "chrome"));
        System.out.println("Browser setup by Thread" + Thread.currentThread().getId() + "and Driver reference is :" + getThreadDriver());

//        String browser = System.getProperty("browser");
//        threadDriver.set(setupBrowser(browser));

//        driver=setupBrowser(browser);

//        WebDriverManager.chromedriver().setup();
//        WebDriverManager.firefoxdriver().setup();
    }

//    @BeforeMethod
//    public void launchBrowser() {
////        //      Added ChromeOptions argument below to fix websocket error
//////        ChromeOptions options = new ChromeOptions();
//////        options.addArguments("--remote-allow-origins=*");
//////        options.addArguments("--disable-notifications");
//////        options.addArguments("--start-maximized");
//////        driver = new ChromeDriver(options);
////        driver= new FirefoxDriver();
//          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
//        driver.get(url);
//
//    }

    @AfterClass
    public void closeBowser() {
        threadDriver.get().close();
        threadDriver.remove();
//    driver.quit();
    }
public WebDriver setupBrowser(String browser) throws MalformedURLException {
//    DesiredCapabilities caps =new DesiredCapabilities();
//    String gridURL=" http://192.168.1.196:4444 ";
        switch(browser){
            case"firefox":
                return setupFirefox();
            case "chrome":
                return setupChrome();
            case "cloud":
                return setupLambda();
//            case"grid-chrome":
//                caps.setCapability("browserName","chrome");
//                return driver = new RemoteWebDriver(URI.create(gridURL).toURL(),caps);
//            case"grid-firefox":
//                caps.setCapability("browserName","firefox");
//                return driver = new RemoteWebDriver(URI.create(gridURL).toURL(),caps);
//            case "edge":
//                return setEdge();
            default:
                return setupChrome();
        }
}
    WebDriver setupFirefox(){
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        return driver;
    }
   WebDriver setupChrome(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        return driver;
    }
    WebDriver setupLambda() throws MalformedURLException {
String hubURL="https://hub.lambdatest.com/wd/hub";
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 10");
        browserOptions.setBrowserVersion("118.0");
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("username", "abisola.omotoso");
        ltOptions.put("accessKey", "HmYeYDqJvvvDjepjgPBJP4JPh9wtsRAxU3e0qnDf3c2NpPGYNu");
        ltOptions.put("project", "Untitled");
        ltOptions.put("selenium_version", "4.0.0");
        ltOptions.put("w3c", true);
        browserOptions.setCapability("LT:Options", ltOptions);
        return new RemoteWebDriver(new URL(hubURL),browserOptions);
    }
}

