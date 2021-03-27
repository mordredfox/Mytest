package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
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
  public void openFacebookPage() {
    main.goTo();
  }


  @When("^I enter (.*) as \"(.*)\"$")
  public void enterTextInField(String nameField, String stringText) {
    switch (nameField) {
      case "username":
        main.enterTextInEMailfield(stringText);
        break;
      case "password":
        main.enterTextInPasswordField(stringText);
        break;
    }
  }

  @And("I click on LogIn button")
  public void iClickOnLogInButton() {
    main.clickLogInButton();
  }

  @Then("^Login should fail$")
  public void login_should_fail() {
    main.LogInFail();
  }

  @Then("^Relogin option should be available$")
  public void relogin_option_should_be_available() {
    main.reLogInAvailable();
  }

  @After
  public void finish() {
    driver.close();
  }
}


/*
Есть замечание по названию методов camelCase почитайте про него
*/