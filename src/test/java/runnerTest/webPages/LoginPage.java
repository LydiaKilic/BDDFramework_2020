package runnerTest.webPages;

import cucumber.api.java.en.And;
import org.openqa.selenium.By;

public class LoginPage extends ElementUtil{

    private By emailTextField = By.id("email");
    private By passwordTextField = By.id("pass");
    private By loginButton = By.id("u_0_b");

    public void enterEmail(String enterEmail){
        sendValue(emailTextField, enterEmail);
    }

    public void enterPassword(String enterPassword){
        sendValue(passwordTextField, enterPassword);
    }

    public void clickOnLoginButton(){
        clickOn(loginButton);
    }



}
