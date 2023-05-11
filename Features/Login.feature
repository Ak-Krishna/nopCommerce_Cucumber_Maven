Feature: Login To nopcommerce

  Scenario: Successfully login with valid data
    Given user launch chrome browser
    When user open the URl "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user Enter email "admin@yourstore.com" and password "admin"
    And click on login button
    Then page should display title "Dashboard / nopCommerce administration"
    When user click on logout button
    Then page should display title "Your store. Login"
    And user close browser

  Scenario Outline: Login With Test Driven Data
    Given user launch chrome browser
    When  user open the URl "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user Enter email "<email>" and password "<password>"
    And click on login button
    Then page should display title "Dashboard / nopCommerce administration"
    When user click on logout button
    Then page should display title "Your store. Login"
    And user close browser
    Examples:
      | email  | password
      | admin@yourstore.com |admin
    | admin@your | admin