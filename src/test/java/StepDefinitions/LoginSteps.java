package StepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AddCustomerPage;
import pageObjects.Helper;
import pageObjects.LoginObjects;

public class LoginSteps extends Helper {

    @Given("user launch chrome browser")
    public void user_launch_chrome_browser() {
        driver = new ChromeDriver();
        Lobj = new LoginObjects(driver);
        addCust = new AddCustomerPage(driver);
    }

    @When("user open the URl {string}")
    public void user_open_the_u_rl(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @And("user Enter email {string} and password {string}")
    public void user_enter_email_and_password(String email, String pass) {
        Lobj.setUsername(email);
        Lobj.setPwd(pass);
    }

    @And("click on login button")
    public void click_on_login_button() throws InterruptedException {
        Lobj.clickLogin();
        Thread.sleep(3000);
    }

    @Then("page should display title {string}")
    public void page_should_display_title(String string) throws InterruptedException {
        if (driver.getPageSource().contains("Login was unsuccessful")) {
            Assert.assertTrue(false);
            driver.quit();
        } else Assert.assertEquals(driver.getTitle(), string);
        Thread.sleep(3000);
    }

    @When("user click on logout button")
    public void user_click_on_logout_button() throws InterruptedException {
        Lobj.logOut();
        Thread.sleep(3000);

    }

    @And("user close browser")
    public void user_close_browser() {
        driver.quit();
    }


    //Actions for Adding customer into page
    @When("user click on customer list dropdown")
    public void click_on_customer_list() throws InterruptedException {
        addCust.customerDropdown_Btn();
    }

    @And("user click on customer listButton")
    public void click_customer_btn() {
        addCust.customer_listBtn();
    }

    @Then("customer page should display with title {string}")
    public void validate_title_for_addCustomer(String title) {
        String actual_tile = driver.getTitle();
        Assert.assertEquals(actual_tile, title);
    }

    @When("user click on add new button")
    public void click_on_addUser() {
        addCust.addUser_btn();
    }

    @Then("user should display add new customer page with title {string}")
    public void validate_title(String title) {
        String actual_title = driver.getTitle();
        Assert.assertEquals(actual_title, title);
    }

    @When("user enter all details")
    public void enterValid_Details() throws InterruptedException {
        Thread.sleep(2000);
        addCust.setFirstName("kishan");
        addCust.setEmail("abc123@gmail.com");
        addCust.setLastName("Aher");
        addCust.setCompanyName("cyber sucess");
    }

    @And("click on save")
    public void submitUser() {
        addCust.submitUser();
    }

    @Then("user should display {string}")
    public void validate_Registration(String successMsg) {
        String actual_title = driver.getTitle();
        Assert.assertEquals(actual_title, successMsg);
    }

}
