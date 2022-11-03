Feature: Access product

  Scenario Outline: Access the product via category after applying multiple filters

    Given the user is allowed to access the ebay page
    When user navigate to the "<url>"
    Then apply filter of category and sub category
    Then will click on the cell phones and smartphones
    And now click on see all
    Then apply the "<filter1>", "<filter2>" and "<filter3>"
    And click on apply
    Then verify the filter tags are applied
    Examples:
      | url | filter1 | filter2 | filter3 |
      |https://www.ebay.com/|Screen Size|Price|Item Location|


  Scenario Outline: Access the product via search
    Given the user is allowed to access the ebay page
    When user navigate to the "<url>"
    Then search with "<searchstring>"
    And change the "<cetagory>"
    Then click search
    Then verify the page load completely
    And validate the fisrt search result with "<searchstring>"
    Examples:
      |url        |searchstring | cetagory                    |
      |https://www.ebay.com/|MacBook       |Computers/Tablets & Networking|
