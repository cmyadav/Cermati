package stepDefination;

import featureCode.utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;

import static featureCode.homePage.*;
import static featureCode.productPage.*;


public class MyStepdefs extends utility {
    static String[] filtersSent=new String[3];

    @Given("the user is allowed to access the ebay page")
    public void theUserIsAllowedToAccessTheEbayPage() {
    }
    @When("user navigate to the {string}")
    public void userNavigateToThe(String url) {
        navigeteToUrl(url);
    }


    @Then("apply filter of category and sub category")
    public void applyFilterOfCategoryAndSubCategory() {
        chooseSubcategory();
    }
    @Then("will click on the cell phones and smartphones")
    public void willClickOnTheCellPhonesAndSmartphones() {

    }
    @And("now click on see all")
    public void nowClickOnSeeAll() {
    }

    @Then("apply the {string}, {string} and {string}")
    public void applyTheAnd(String filter1, String filter2, String filter3) throws InterruptedException {
        applyScreensizeFilter();
        applypriceFilter("200","2000");
        applyItemLoactionFilter();
        filtersSent= new String[]{filter1, filter2, filter3};
    }

    @And("click on apply")
    public void clickOnApply() {
        clickApplyButton();

    }
    @Test
    @Then("verify the filter tags are applied")
    public void verifyTheFilterTagsAreApplied() {
        validateAppliedFilters(filtersSent);

    }

    @Then("search with {string}")
    public void searchWith(String searchstring) {
        searchProduct(searchstring);
    }

    @And("change the {string}")
    public void changeThe(String cetagory) {
        changeCategory();
    }

    @Then("click search")
    public void clickSearch() {
        hitSearchButton();
    }

    @Then("verify the page load completely")
    public void verifyThePageLoadCompletely() {
        Assert.assertTrue(checkForpageload());
    }

    @And("validate the fisrt search result with {string}")
    public void validateTheFisrtSearchResultWith(String searchstring) {
       Assert.assertTrue(checkSearchFirstItem(searchstring));
    }


}
