@FIDE-966
Feature: Logout Functionality
  User Story :
  As a user, I should be able to log out.

  Background: user is on the login page
    Given user is on the login page of fidexio


  Scenario: Logout Scenarios
    When user enters PosManager email "posmanager15@info.com" password "posmanager" and logins
    Then user sees "posmanager15" userId is displayed
    Then user clicks "posmanager15" button
    And user clicks to Logout button
    Then user sees loginPage is displayed

  @FIDE-966
  Scenario: Not Back To Inbox Scenarios
    When user enters PosManager email "posmanager15@info.com" password "posmanager" and logins
    Then user sees "posmanager15" userId is displayed
    Then user clicks "posmanager15" button
    And user clicks to Logout button
    And user clicks back arrow button
    Then user sees "Odoo Session Expired" alert is displayed

  @FIDE-966
  Scenario: Logout Scenarios
    When user enters SalesManager email "salesmanager10@info.com" password "salesmanager" and logins
    Then user sees "salesmanager10" userId is displayed
    Then user clicks "salesmanager10" button
    And user clicks to Logout button
    Then user sees loginPage is displayed

  @FIDE-966
  Scenario: Not Back To Inbox Scenarios
    When user enters SalesManager email "salesmanager10@info.com" password "salesmanager" and logins
    Then user sees "salesmanager10" userId is displayed
    Then user clicks "salesmanager10" button
    And user clicks to Logout button
    And user clicks back arrow button
    Then user sees "Odoo Session Expired" alert is displayed