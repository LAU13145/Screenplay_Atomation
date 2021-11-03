package co.com.choucair.certification.register.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DevicesPage {

        public static final Target COMPUTER = Target.the("computer")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]");
        public static final Target LINUX = Target.the("linux")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[3]");

        public static final Target VERSION = Target.the("version")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");
        public static final Target CENTOS = Target.the("centOS")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");

        public static final Target LANGUAGE = Target.the("language")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");
        public static final Target ENGLISH = Target.the("english")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[11]");

         public static final Target MOBILE = Target.the("mobile")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[4]");
         public static final Target APPLE = Target.the("apple")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[3]");

        public static final Target MODEL = Target.the("mobile")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]");
        public static final Target IPHONE = Target.the("iphone")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[65]");


        public static final Target OS = Target.the("os")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[6]");
        public static final Target IOS = Target.the("ios")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[38]");


        public static final Target BTNLASTPAGE = Target.the("Btn last page")
            .locatedBy("//a[@aria-label=\"Next - final step\"]");

    /*WebDriver webDriver;

    By computer = By.name("osId");
    By computerName = By.xpath("//*[@name=\"osId\"]/input[1]");
    By version = By.name("osVersionId");
    By versionName = By.xpath("//*//*[@name=\"osVersionId\"]/input[1]");
    By language = By.name("osLanguageId");
    By languageName = By.xpath("//*[@name=\"osLanguageId\"]/input[1]");
    By mobile = By.name ("handsetMakerId");
    By mobileName = By.xpath("//*[@name=\"handsetMakerId\"]/input[1]");
    By model = By.name("handsetModelId");
    By modelName = By.xpath("//*[@name=\"handsetModelId\"]/input[1]");
    By OS = By.name("handsetOSId");
    By OSName = By.xpath("//*[@name=\"handsetOSId\"]/input[1]");
    By lastPage = By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a");


    public DevicesPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }


    private void openComputerPicker (){ webDriver.findElement(computer).click(); }

    public void setComputerName(String computer_name){
        openComputerPicker();
        webDriver.findElement(computerName).sendKeys(computer_name);
    }

    private void openVersionPicker (){ webDriver.findElement(version).click(); }

    public void setVersionName(String version_name){
        openVersionPicker();
        webDriver.findElement(versionName).sendKeys(version_name);
    }

    private void openLanguagePicker (){ webDriver.findElement(language).click(); }

    public void setLanguageName(String language_name){
        openLanguagePicker();
        webDriver.findElement(languageName).sendKeys(language_name);
    }

    private void openMobilePicker (){ webDriver.findElement(mobile).click(); }

    public void setMobileName(String mobile_name){
        openMobilePicker();
        webDriver.findElement(mobileName).sendKeys(mobile_name);
        webDriver.findElement(mobileName).sendKeys(Keys.RETURN);
        webDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    private void openModelPicker (){ webDriver.findElement(model).click(); }

    public void setModelName(String model_name){
        openModelPicker();
        webDriver.findElement(modelName).sendKeys(model_name);
        webDriver.findElement(modelName).sendKeys(Keys.RETURN);
        webDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    private void openOSPicker (){ webDriver.findElement(OS).click(); }

    public void setOSName(String OS_name){
        openOSPicker();
        webDriver.findElement(OSName).sendKeys(OS_name);
        webDriver.findElement(OSName).sendKeys(Keys.RETURN);
        webDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    public void goLastPage(){
        webDriver.findElement(lastPage).click();
    }*/

}
