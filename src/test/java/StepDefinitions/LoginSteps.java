package StepDefinitions;

import Pages.ZeroBankElements;
import Utilities.BaseDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    ZeroBankElements zb=new ZeroBankElements();

    @Given("^Navigate to ZeroBank$")
    public void navigate_to_ZeroBank() {
        WebDriver driver = BaseDriver.getDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Given("^Enter e valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void enter_e_valid_username_and_password(String username, String password) {
           zb.findAndSend(ZeroBankElements.PageElements.USERLOGIN, username);
        zb.findAndSend(ZeroBankElements.PageElements.USERPASSWORD, password);
        zb.findAndClick(ZeroBankElements.PageElements.SUBMIT);
        zb.findAndClick(ZeroBankElements.PageElements.SECURITY1);
        zb.findAndClick(ZeroBankElements.PageElements.SECURITY2);


    }

    @Then("^Login successfully$")
    public void login_successfully() {
    zb.escape();
zb.verifyContainsText(zb.cashAccounts, "Cash");
    }

}
