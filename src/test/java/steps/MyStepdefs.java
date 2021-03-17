package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.BaseWeb;


public class MyStepdefs extends BaseWeb {

  @Before
  public void INIT() {
    start();
  }


  @Given("^I am on Facebook login page$")
  public void i_go_to_facebook() {
    main.goTo();
  }


  @When("^I enter username as \"(.*)\"$")
  public void i_enter_username_as(String login) {
    main.enterTextInEMailfield(login);
  }

  @When("^I enter password as \"(.*)\"$")
  public void i_enter_password_as(String password) {
    main.enterTextInPasswordField(password);
  }

  @Then("^Login should fail$")
  public void login_should_fail() {
    main.clickLogInButton();
    main.loginfail();
  }

  @Then("^Relogin option should be available$")
  public void relogin_option_should_be_available() {
    main.relogin();
  }

}
