package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjects {
    public WebDriver driver;
    public LoginObjects(WebDriver ldriver) {
        this.driver = ldriver;
        PageFactory.initElements(driver,this);
    }

    //Getting Element from browser by Id
    @FindBy(id = "Email")
    @CacheLookup
    WebElement email;

    @FindBy(id = "Password")
    @CacheLookup
    WebElement pass;

    @FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
    @CacheLookup
    WebElement LoginBtn;

    @FindBy(linkText = "Logout")
    @CacheLookup
    WebElement logOutBtn;

    //Method for setting username
    public void setUsername(String username) {
        email.clear();
        email.sendKeys(username);
    }

    //Method for  setting password
    public void setPwd(String pwd) {
        pass.clear();
        pass.sendKeys(pwd);
    }

    //Method for clicking login button
    public void clickLogin() {
        LoginBtn.click();
    }
    public void logOut() {
        logOutBtn.click();
    }
}
