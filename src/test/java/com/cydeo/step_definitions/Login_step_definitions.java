package com.cydeo.step_definitions;

import com.cydeo.pages.SeamlessLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_step_definitions {

    SeamlessLoginPage loginPage = new SeamlessLoginPage();

    @Given("user is on the log in page")
    public void user_is_on_the_log_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamless.url"));

    }
    @When("user enter valid username")
    public void user_enter_valid_username() {
        loginPage.txt_username.sendKeys(ConfigurationReader.getProperty("seamless.username"));

    }
    @When("user enter valid password")
    public void user_enter_valid_password() {
        loginPage.txt_password.sendKeys(ConfigurationReader.getProperty("seamless.password"));

    }
    @When("user click log in button")
    public void user_click_log_in_button() {
        loginPage.btn_lod_in.click();


    }
    @Then("user should be able to log in")
    public void user_should_be_able_to_log_in() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("File"));


    }

    @When("user enter valid username {string}")
    public void userEnterValidUsername(String username) {
        loginPage.txt_username.sendKeys(username);

            }

    @And("user enter valid password {string}")
    public void userEnterValidPassword(String password) {
        loginPage.txt_password.sendKeys(password);

    }
}
