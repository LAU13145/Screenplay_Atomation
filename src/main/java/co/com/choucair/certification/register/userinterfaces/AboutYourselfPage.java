package co.com.choucair.certification.register.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutYourselfPage {

    public static final Target FIRSTNAME = Target.the("firstname")
            .located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("lastname")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("email")
            .located(By.id("email"));
    public static final Target BIRTHMONTH = Target.the("birthmonth")
            .located(By.id("birthMonth"));
    public static final Target BIRTHDAY = Target.the("birthday")
            .located(By.id("birthDay"));
    public static final Target BIRTHYEAR = Target.the("birthyear")
            .located(By.id("birthYear"));
    public static final Target BTNNEXTLOCATION = Target.the("btn Next Location")
            .locatedBy("//a[@class=\"btn btn-blue\"]");


    /*WebDriver webDriver;
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By email = By.id("email");
    By birthMonth = By.id("birthMonth");
    By birthDay = By.id("birthDay");
    By birthYear = By.id("birthYear");
    By addressPage = By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a");

    public AboutYourselfPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void setFirstName(String first_name){
        webDriver.findElement(firstName).sendKeys(first_name);
    }

    public void setLastName(String last_name){
        webDriver.findElement(lastName).sendKeys(last_name);
    }
    public void setEmail(String input_email){
        webDriver.findElement(email).sendKeys(input_email);
    }
    private void setBirthMonth(String month){
        webDriver.findElement(birthMonth).sendKeys(month);
    }
    private void setBirthDay(String day){
        webDriver.findElement(birthDay).sendKeys(day);
    }
    private void setBirthYear(String year){
        webDriver.findElement(birthYear).sendKeys(year);
    }

    public void setBirthDate(String day, String month, String year){
        setBirthDay(day);
        setBirthMonth(month);
        setBirthYear(year);
    }

    public void goAddressPage(){
        webDriver.findElement(addressPage).click();
    }*/
}
