package co.com.choucair.certification.register.tasks;

import co.com.choucair.certification.register.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUser implements Task {

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Click.on(HomePage.HOME),
                SendKeys.of("Yolanda").into(AboutYourselfPage.FIRSTNAME),
                SendKeys.of("Parra").into(AboutYourselfPage.LASTNAME),
                SendKeys.of("Yolan8912@dev.com").into(AboutYourselfPage.EMAIL),
                SendKeys.of("September").into(AboutYourselfPage.BIRTHMONTH),
                SendKeys.of("17").into(AboutYourselfPage.BIRTHDAY),
                SendKeys.of("1988").into(AboutYourselfPage.BIRTHYEAR),
                Click.on(AboutYourselfPage.BTNNEXTLOCATION)
                /*SendKeys.of("Bogotá").into(AddressPage.CITY),
                SendKeys.of("110456").into(AddressPage.ZIP),
                Click.on(AddressPage.COUNTRYSELECT),
                SendKeys.of("Colombia").into(AddressPage.COUNTRY),
                Click.on(AddressPage.BTNDEVICEPAGE),
                Click.on(DevicesPage.COMPUTER),
                Click.on(DevicesPage.LINUX),
                Click.on(DevicesPage.VERSION),
                Click.on(DevicesPage.CENTOS),
                Click.on(DevicesPage.LANGUAGE),
                Click.on(DevicesPage.ENGLISH),
                Click.on(DevicesPage.MOBILE),
                Click.on(DevicesPage.APPLE),
                Click.on(DevicesPage.MODEL),
                Click.on(DevicesPage.IPHONE),
                Click.on(DevicesPage.OS),
                Click.on(DevicesPage.IOS),
                Click.on(DevicesPage.BTNLASTPAGE),
                SendKeys.of("r-dcM4!4SSQniAA").into(LastPage.PASSWORD),
                SendKeys.of("r-dcM4!4SSQniAA").into(LastPage.CONFIRMPASSWORD),
                Click.on(LastPage.INFORMED),
                Click.on(LastPage.TERMS),
                Click.on(LastPage.PRIVACY),
                Click.on(LastPage.BTNSUBMIT)*/
        );
    }

    public static RegisterUser makeinformation()
    {
        return instrumented(RegisterUser.class);
    }

}
