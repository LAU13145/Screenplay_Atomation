package co.com.choucair.certification.register.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastPage {

    public static final Target PASSWORD = Target.the("password")
            .located(By.id("password"));
    public static final Target CONFIRMPASSWORD = Target.the("Confirmpassword")
            .located(By.id("confirmPassword"));
    public static final Target INFORMED = Target.the("informed")
            .located(By.name("newsletterOptIn"));
    public static final Target TERMS = Target.the("Terms")
            .located(By.name("termOfUse"));
    public static final Target PRIVACY = Target.the("Privacy")
            .located(By.name("privacySetting"));
    public static final Target BTNSUBMIT = Target.the("Btn submit")
            .locatedBy("//a[@class=\"btn btn-blue\"]");


    /*WebDriver webDriver;

    By password = By.id("password");
    By confirmPassword = By.id("confirmPassword");
    By Informed = By.name("newsletterOptIn");
    By terms = By.name("termOfUse");
    By privacy = By.name("privacySetting");
    By submit = By.xpath("//*[@id=\"laddaBtn\"]");

    public LastPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void setPassword(String password_name){
        webDriver.findElement(password).sendKeys((password_name));
        setConfirmPassword(password_name);
    }

    private void setConfirmPassword(String confirm_password){
        webDriver.findElement(confirmPassword).sendKeys(confirm_password);
    }

    public void setInformed(){
        webDriver.findElement(Informed).click();
    }

    public void setTerms(){
        webDriver.findElement(terms).click();
    }

    public void setPrivacy(){
        webDriver.findElement(privacy).click();
    }


    public void submit(){
        webDriver.findElement(submit).click();
    }*/
}
