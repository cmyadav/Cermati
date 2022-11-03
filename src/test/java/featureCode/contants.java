package featureCode;

public class contants {
    public static String shopByCategory="//button[text()='Shop by category']";
    public static String cellphoneAndAccessories="//a[text()='Cell phones & accessories']";
    public static String cellphoneAndSmartphone="//a[text()='Cell Phones & Smartphones']";
    public static String seeAllUnderShopByBrand= "//h2[text()='Shop by Brand']//ancestor::div[@class='b-carousel__header  sameline']//span[text()='See All']";
    public static String filterScreenSize = "//div[@class='x-overlay-aspect ']//span[text()='Screen Size']";
    public static String filterPrice="//div[@class='x-overlay-aspect ']//span[text()='Price']";
    public static String filterItemLocation="//div[@class='x-overlay-aspect ']//span[text()='Item Location']";
    public static String screenSize="//span[text()='6 in or More']";
    public static String priceLowerRange="//input[@aria-label='Minimum Value, US Dollar']";
    public static String priceUpperRange="//input[@aria-label='Maximum Value, US Dollar']";
    public static String itemLoaction="//input[@value='US Only']/parent::span";
    public static String applyFilter="//button[text()='Apply']";
    public static String filtersApplied="//span[contains(text(),'filters applied')]";

    public static String seeAllAppliedFilter="//ul[contains(@class,'aspect-list')]";

    public static String searchBar="//input[@placeholder='Search for anything']";

    public static String selectCategoryForSearch="//select[@name='_sacat']";
    public static String searchButton="//input[@value='Search']";

    public static String searchResultFirstItem="//ul[@class='srp-results srp-list clearfix']/child::li[2]//div[@class='s-item__info clearfix']/a";







}
