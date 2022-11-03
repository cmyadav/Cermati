package featureCode;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass{
    static WebDriver driver;

    public static void setup() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }
    @After
    public static void tearDown(){
        driver.close();

    }
}
