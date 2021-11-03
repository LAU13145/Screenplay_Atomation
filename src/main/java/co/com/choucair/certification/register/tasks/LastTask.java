package co.com.choucair.certification.register.tasks;

import co.com.choucair.certification.register.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LastTask implements Task {

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                SendKeys.of("r-dcM4!4SSQniAA").into(LastPage.PASSWORD),
                SendKeys.of("r-dcM4!4SSQniAA").into(LastPage.CONFIRMPASSWORD),
                Click.on(LastPage.INFORMED),
                Click.on(LastPage.TERMS),
                Click.on(LastPage.PRIVACY),
                Click.on(LastPage.BTNSUBMIT)
        );
    }

    public static LastTask lastinformation()
    {
        return instrumented(LastTask.class);
    }

}
