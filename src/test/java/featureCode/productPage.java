package featureCode;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import static featureCode.contants.*;

public class productPage extends utility {
    public static void applyScreensizeFilter() throws InterruptedException {
        clickOnElement(seeAllUnderShopByBrand);
        clickOnElement(filterScreenSize);
        clickOnElement(screenSize);
    }


    public static void applypriceFilter(String min, String max) {
        clickOnElement(filterPrice);
        enterValue(priceLowerRange, min);
        enterValue(priceUpperRange, max);

    }

    public static void applyItemLoactionFilter() {
        clickOnElement(filterItemLocation);
        clickOnElement(itemLoaction);

    }

    public static void clickApplyButton(){
        clickOnElement(applyFilter);
    }
    public static void validateAppliedFilters(String[] filters) {

        clickOnElement(filtersApplied);
        for (String filter : filters) {
            Assert.assertTrue(getTextValue(seeAllAppliedFilter).contains(filter));
        }
    }



    public static void searchProduct(String searchstring){
        enterValue(searchBar,searchstring);
    }

    public static void changeCategory() {
        selectDropdownValue(selectCategoryForSearch, "58058");
    }


    public static void hitSearchButton(){
        clickOnElement(searchButton);
    }

    public static boolean checkForpageload(){
        return ((JavascriptExecutor)driver).executeScript("return document.readyState").toString().equals("complete");
    }

    public static boolean checkSearchFirstItem(String searchstring){
       return getTextValue(searchResultFirstItem).contains(searchstring);
    }



}