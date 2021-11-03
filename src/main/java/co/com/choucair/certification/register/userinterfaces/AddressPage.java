    package co.com.choucair.certification.register.userinterfaces;

    import net.serenitybdd.screenplay.targets.Target;
    import org.openqa.selenium.By;

    public class AddressPage {

    public static final Target CITY = Target.the("city")
            .located(By.id("city"));
    public static final Target ZIP = Target.the("zip")
            .located(By.id("zip"));
    public static final Target COUNTRYSELECT = Target.the("CountrySelect")
                .located(By.name("countryId"));
    public static final Target COUNTRY = Target.the("zip")
            .locatedBy("//*[@name=\"countryId\"]/input[1]");
    public static final Target BTNDEVICEPAGE = Target.the("Btn device page")
            .locatedBy("//a[@aria-label=\"Next step - select your devices\"]");



    /*WebDriver webDriver;

    By city = By.id("city");
    By zip = By.id("zip");
    By country = By.name("countryId");
    By countryName = By.xpath("//*[@name=\"countryId\"]/input[1]");
    By devicePage =  By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a");


    public AddressPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

   public void setCity(String city_name){
        WebElement element = webDriver.findElement(city);
        element.clear();
        element.sendKeys(city_name);
    }

   public void setZip (String zip_code){
        WebElement element = webDriver.findElement(zip);
        element.clear();
        element.sendKeys(zip_code);
    }

    private void openCountryPicker(){
        webDriver.findElement(country).click();
    }

    public void setCountryName(String country_name){
        openCountryPicker();
        webDriver.findElement(countryName).sendKeys(country_name);
    }

    public void goDevicePage(){
        webDriver.findElement(devicePage).click();
    }*/
}



