@Wip
Feature: Login_Logout Functionality
  User Story :
  As a user, I should be able to log in so that I can land on homepage.
  As a user, I should be able to log out.

  Background: user is on the login page
    Given user is on the login page of fidexio

  @FIDE-965 @FIDE-988
  Scenario: user logged in as PosManager
    When user enters PosManager email "posmanager15@info.com" password "posmanager" and logins
    Then user sees "Inbox" is displayed

  @FIDE-965 @FIDE-989
  Scenario: user logged in as SalesManager
    When user enters SalesManager email "salesmanager10@info.com" password "salesmanager" and logins
    Then user sees "Inbox" is displayed

  @FIDE-965 @FIDE-990
  Scenario: user sees error message of login with invalid credentials
    When user enters valid email
    Then user enters invalid password
    Then user clicks to login button
    And user sees the "Wrong login/password" error message

  @FIDE-965   @FIDE-991
  Scenario: user sees error message of login with invalid credentials
    When user enters invalid email
    Then user enters  valid password
    Then user clicks to login button
    And user sees the "Wrong login/password" error message

  @FIDE-965 @FIDE-992
  Scenario: user sees an error message if the email is empty
    When user doesn't enter information for email
    Then user clicks to login button
    And user sees the "Please fill out this field" message

  @FIDE-965 @FIDE-993
  Scenario: user sees an error message if the password is empty
    When user enters SalesManager email "salesmanager10@info.com"
    When user doesn't enter information for password
    Then user clicks to login button
    And user sees the "Please fill out this field" message

  @FIDE-965 @FIDE-994
  Scenario: user checks the Reset Password button
    When user clicks the Reset Password button
    And user sees the reset password page

  @FIDE-965 @FIDE-995
  Scenario: user should see the password in bullet signs by default
    When user enters password
    And  user sees default password in bullet signs

  @FIDE-965 @FIDE-996
  Scenario: user checks the ‘Enter’ key of the keyboard
    When When user enters PosManager email "posmanager15@info.com" password "posmanager"
    Then user clicks the Enter key of the keyboard
    And user sees "Inbox" is displayed


  @FIDE-966
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