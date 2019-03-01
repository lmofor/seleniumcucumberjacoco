package Steps;

import Base.BaseUtil;
import Pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        System.out.println("I  navigate to the login page");
        base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
    }

//    @And("^I enter the username as admin and password as admin$")
//    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() throws Throwable {
//        System.out.println("I enter the username as admin and password as admin$");
//    }

    @And("^I click Login button$")
    public void iClickLoginButton() throws Throwable {
        //System.out.println("I click Login button");
        //base.Driver.findElement(By.name("Login")).submit();
        LoginPage page = new LoginPage(base.Driver);
        page.ClickLogin();
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        //System.out.println("I should see the userform page");
        Assert.assertEquals(
                base.Driver.findElement(By.id("Initial")).isDisplayed(),true);
    }

//    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
//    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
//       System.out.println("I enter the username as "+username+" and password as "+password);
//    }

    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {
       List<List<String>> data = table.raw();
       /*System.out.println("The value is : "+data.get(0).get(0));
        System.out.println("The value is : "+data.get(0).get(1));*/
        List<User> users = new ArrayList<User>();
       users = table.asList(User.class);
        for (User user : users) {
            //System.out.println("The UserName is : "+user.username);
            //System.out.println("The Password is : "+user.password);
            //base.Driver.findElement(By.name("UserName")).sendKeys(user.username);
            //base.Driver.findElement(By.name("Password")).sendKeys(user.password);
            LoginPage page = new LoginPage(base.Driver);
            page.Login(user.username,user.password);
        }
    }

    public class User
    {
        public String username;
        public String password;


        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
