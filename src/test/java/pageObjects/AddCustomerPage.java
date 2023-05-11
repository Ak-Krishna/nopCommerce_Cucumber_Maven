package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
    public WebDriver ldriver;

    public AddCustomerPage(WebDriver rdriver){
        this.ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

    //Extracting all paths for particular WenElement
    By customer_listbutton= By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]");
    By customer_btn=By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]");
    By add_user_btn=By.xpath("/html/body/div[3]/div[1]/form[1]/div/div/a");
    By email=By.id("Email");
    By firstName=By.id("FirstName");
    By lastName=By.id("LastName");
    By gender=By.id("Gender_Male");
    By companyName=By.id("Company");
    By customer_role=By.id("SelectedCustomerRoleIds");
    By manage_vendor=By.id("VendorId");
    By user_comment=By.id("AdminComment");
    By saveChange=By.name("save");


    //Method for redirect to add customer page
    public void customerDropdown_Btn() throws InterruptedException {
        ldriver.findElement(customer_listbutton).click();
        Thread.sleep(2000);
    }
    public void customer_listBtn(){
        ldriver.findElement(customer_btn).click();
    }
    public void addUser_btn(){
        ldriver.findElement(add_user_btn).click();
    }
    public void submitUser(){
        ldriver.findElement(saveChange).click();
    }
    //Methods for getting web element and passing values

    public void setFirstName(String firstname){
        ldriver.findElement(firstName).clear();
        ldriver.findElement(firstName).sendKeys(firstname);
    }
    public void setLastName(String lastname){
        ldriver.findElement(lastName).clear();
        ldriver.findElement(lastName).sendKeys(lastname);
    }
    public void setEmail(String Email){
        ldriver.findElement(email).clear();
        ldriver.findElement(email).sendKeys(Email);
    }
    public void setCompanyName(String cName){
        ldriver.findElement(companyName).clear();
        ldriver.findElement(companyName).sendKeys(cName);
    }
    public void setComment(String comment){
        ldriver.findElement(user_comment).clear();
        ldriver.findElement(user_comment).sendKeys(comment);
    }

    //Method for Extracting element from dropdown and select

}
