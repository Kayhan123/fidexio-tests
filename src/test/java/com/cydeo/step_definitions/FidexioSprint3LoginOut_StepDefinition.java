package com.cydeo.step_definitions;

import com.cydeo.pages.FidexioLoginOutPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


public class FidexioSprint3LoginOut_StepDefinition {

    FidexioLoginOutPage fidexioLoginOutPage = new FidexioLoginOutPage();
    Actions actions= new Actions(Driver.getDriver());

    @Given("user is on the login page of fidexio")
    public void user_is_on_the_login_page_of_fidexio() {
        String url = ConfigurationReader.getProperty("fidexio.url");
        Driver.getDriver().get(url);
    }

    @When("user enters PosManager email {string} password {string} and logins")
    public void user_enters_pos_manager_email_password_and_logins(String string, String string1) {
        fidexioLoginOutPage.loginInput.sendKeys("posmanager15@info.com");
        fidexioLoginOutPage.passwordInput.sendKeys("posmanager");
        fidexioLoginOutPage.loginButton.click();
    }

    @Then("user sees {string} is displayed")
    public void userSeesIsDisplayed(String arg0) {
        Assert.assertTrue(fidexioLoginOutPage.oChannelNameSpan.isDisplayed());
    }

    @When("user enters SalesManager email {string} password {string} and logins")
    public void user_enters_sales_manager_email_password_and_logins(String string, String string1) {
        fidexioLoginOutPage.loginInput.sendKeys("salesmanager10@info.com");
        fidexioLoginOutPage.passwordInput.sendKeys("salesmanager");
        fidexioLoginOutPage.loginButton.click();
    }

    @When("user enters valid email")
    public void user_enters_valid_email() {
        fidexioLoginOutPage.loginInput.sendKeys("posmanager15@info.com");
    }

    @Then("user enters invalid password")
    public void user_enters_invalid_password() {
        fidexioLoginOutPage.passwordInput.sendKeys("faker.crypto");

    }
    @Then("user clicks to login button")
    public void userClicksToLoginButton() {
        fidexioLoginOutPage.loginButton.click();
    }

    @Then("user sees the {string} error message")
    public void user_sees_the_error_message(String string) {
        Assert.assertTrue(fidexioLoginOutPage.alert.isDisplayed());
    }

    @When("user enters invalid email")
    public void user_enters_invalid_email() {
        fidexioLoginOutPage.loginInput.sendKeys("faker.email");
    }

    @Then("user enters  valid password")
    public void user_enters_valid_password() {
        fidexioLoginOutPage.passwordInput.sendKeys("posmanager");
    }

    @When("user doesn't enter information for email")
    public void user_doesn_t_enter_information_for_email() {
        fidexioLoginOutPage.loginInput.sendKeys("");
    }

    @When("user sees the {string} message")
    public void user_sees_the_message(String string) {
        Assert.assertTrue(fidexioLoginOutPage.topMenuUl.isDisplayed());
    }

    @When("user enters SalesManager email {string}")
    public void userEntersSalesManagerEmail(String string) {
        fidexioLoginOutPage.loginInput.sendKeys("salesmanager10@info.com");
    }

    @When("user doesn't enter information for password")
    public void user_doesn_t_enter_information_for_password() {
        fidexioLoginOutPage.passwordInput.sendKeys("");
    }

    @When("user clicks the Reset Password button")
    public void user_clicks_the_reset_password_button() {

        fidexioLoginOutPage.oeLoginForm.click();
    }

    @When("user sees the reset password page")
    public void user_sees_the_reset_password_page() {
        Assert.assertTrue(fidexioLoginOutPage.oeResetPasswordForm.isDisplayed());
    }

    @When("user enters password")
    public void user_enters_password() {
        fidexioLoginOutPage.passwordInput.sendKeys("posmanager");
    }

    @When("user sees default password in bullet signs")
    public void user_sees_default_password_in_bullet_signs() {
        Assert.assertTrue(fidexioLoginOutPage.passwordInput.isDisplayed());
    }

    @When("When user enters PosManager email {string} password {string}")
    public void when_user_enters_pos_manager_email_password(String string, String string2){
        fidexioLoginOutPage.loginInput.sendKeys("posmanager15@info.com");
        fidexioLoginOutPage.passwordInput.sendKeys("posmanager");

    }

    @Then("user clicks the Enter key of the keyboard")
    public void user_clicks_the_enter_key_of_the_keyboard() {
        actions.sendKeys(Keys.ENTER).perform();
    }



    @Then("user sees {string} userId is displayed")
    public void userSeesUserIdIsDisplayed(String arg) {
        Assert.assertTrue(fidexioLoginOutPage.oeTopbarNameSpan.isDisplayed());
    }

    @Then("user clicks {string} button")
    public void userClicksButton(String arg) {
        fidexioLoginOutPage.oeTopbarNameSpan.click();
    }

    @And("user clicks to Logout button")
    public void userClicksToLogoutButton() {
        fidexioLoginOutPage.logoutLink.click();
    }

    @Then("user sees loginPage is displayed")
    public void userSeesLoginPageIsDisplayed() {
        Assert.assertTrue(fidexioLoginOutPage.SingInLink.isDisplayed());
    }

    @And("user clicks back arrow button")
    public void userClicksBackArrowButton() {
        Driver.getDriver().navigate().back();
    }

    @Then("user sees {string} alert is displayed")
    public void userSeesAlertIsDisplayed(String arg0) {
        Assert.assertTrue(fidexioLoginOutPage.odooSessionExpired.isDisplayed());
    }


}