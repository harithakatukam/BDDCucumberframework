 Feature:Login
 Scenario Outline: Login DataDriven 
    Given User launch chrome Browser
    When User Opens Url "https://www.saucedemo.com/v1/index.html"
    And User Enters Username as "<uname>" and Password as "<pwd>"
    And clicks the login button
    Then Page title should be "Swag Labs"
    When User Click on Log out Link
    Then Close Browser
    
    Examples:
       |uname |pwd|
       |standard_user|secret_sauce|
       |problem_user|secret_sauce|
       |performance_glitch_user|secret_sauce|
       |haritha|secret_sauce|
    