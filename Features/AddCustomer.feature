Feature: Customers
    Background: Login to application
    Given user launch chrome browser
    When user open the URl "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And user Enter email "admin@yourstore.com" and password "admin"
    And  click on login button
    Then page should display title "Dashboard / nopCommerce administration"

  Scenario: Create Customer with valid details
    When user click on customer list dropdown
    And user click on customer listButton
    Then customer page should display with title "Customers / nopCommerce administration"
    When user click on add new button
    Then user should display add new customer page with title "Add a new customer / nopCommerce administration"
    When user enter all details
    And click on save
    Then user should display "The new customer has been added successfully."
    And user close browser