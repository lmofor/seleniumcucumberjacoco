package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(how = How.XPATH, using = "//tr[2]/td[2]/input")
    public WebElement txtUserName;

    @FindBy(how = How.XPATH, using = "//tr[3]/td[2]/input")
    public WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//button[1]")
    public WebElement txtLogin;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void Login(String userName, String password){
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public void ClickLogin(){
        txtLogin.click();//submit();
    }

}
