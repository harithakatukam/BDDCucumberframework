Feature: Login
 Scenario: Successful login with Valid Credentials
   Given User launch chrome Browser
   When User Opens Url "https://www.saucedemo.com/v1/index.html"
    And User Enters Username as "standard_user" and Password as "secret_sauce"
    And clicks the login button
    Then Page title should be "Swag Labs"
    When User Click on Log out Link
    Then Close Browser
