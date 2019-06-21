Feature: Test Salesforce login functionality

  Scenario: login to Salesforce using invalid credentials
    Given Open firefox browser and start application
    When I enter "test.user@gmail.com.test" and "aygduyagye"
    And I click the login button
    And I am logged in