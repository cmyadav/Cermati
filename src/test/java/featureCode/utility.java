package featureCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class utility extends baseClass{




    public static void clickOnElement(String xpath){
        explicitwaits(10,xpath);
        driver.findElement(By.xpath(xpath)).click();
    }

    public static String getTextValue(String xpath){
        explicitwaits(10,xpath);
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public static void enterValue(String xpath, String value){
        explicitwaits(10,xpath);
        driver.findElement(By.xpath(xpath)).sendKeys(value);
    }

    public static void navigeteToUrl(String url){
        setup();
        driver.get(url);

    }
    public static void implicitwaits(int duration){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
    }
    public static void explicitwaits(int duration, String xpath){

        WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(duration));
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }


    public static void selectDropdownIndex(String xpath, int index){
        WebElement dropdown= driver.findElement(By.xpath(xpath));
        Select dp=new Select(dropdown);
        dp.selectByIndex(index);
    }
    public static void selectDropdownValue(String xpath, String value){
        WebElement  dropdown= driver.findElement(By.xpath(xpath));
        Select dp=new Select(dropdown);
        dp.selectByValue(value);
    }
    public static boolean isElemetVisible(String xpath){
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

}


