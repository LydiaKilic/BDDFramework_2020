package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import runnerTest.webPages.LoginPage;
import utils.BasePage;

public class LoginPageSD {

    LoginPage loginPage = new LoginPage();

    @Given("^I am on home page$")
    public void onHomePage(){
        Assert.assertEquals(BasePage.get().getCurrentUrl(),  "https://www.facebook.com/");

    }

    @When("^I enter (.+) into (username|password) text fields on home screen$")
    public void enterDataUserandPassField(String anyText, String textFields){
        switch (textFields){
            case "username":
                loginPage.enterEmail(anyText);
                break;

            case "password":
                loginPage.enterPassword(anyText);
                break;
        }
    }

@And("^I click on login button on home screen$")
    public void clickOnButton(){
        loginPage.clickOnLoginButton();
}

@Then("^I verify that I am invalid login page$")
    public void verifyInvalidLogin(){
        Assert.assertEquals(BasePage.get().getTitle(), "Facebook - Log In or Sign Up");
}

}
