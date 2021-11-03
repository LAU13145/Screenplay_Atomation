package co.com.choucair.certification.register.tasks;

import co.com.choucair.certification.register.userinterfaces.DevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Devices implements Task {

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
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
                Click.on(DevicesPage.BTNLASTPAGE)
        );
    }

    public static Devices devicesinformation()
    {
        return instrumented(Devices.class);
    }

}
