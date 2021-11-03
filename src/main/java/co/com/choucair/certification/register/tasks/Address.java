package co.com.choucair.certification.register.tasks;

import co.com.choucair.certification.register.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Address implements Task {

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                SendKeys.of("Bogotá").into(AddressPage.CITY),
                SendKeys.of("110456").into(AddressPage.ZIP),
                Click.on(AddressPage.COUNTRYSELECT),
                SendKeys.of("Colombia").into(AddressPage.COUNTRY),
                Click.on(AddressPage.BTNDEVICEPAGE)
        );
    }

    public static Address addressinformation()
    {
        return instrumented(Address.class);
    }

}
