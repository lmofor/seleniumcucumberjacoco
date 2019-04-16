package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(){
        System.out.println("Ouverture le navigateur : Chrome");
        System.setProperty("webdriver.chrome.driver","C:\\\\Libs\\\\chromedriver.exe");
        base.Driver = new ChromeDriver();
    }

    @After
    public void TearDownTest(){
        System.out.println("Fermeture du navigateur : Chrome");
    }


}
