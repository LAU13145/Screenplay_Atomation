package co.com.choucair.certification.register.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class HomePage {
    public static final Target HOME = Target.the("home")
                .located(By.className("unauthenticated-nav-bar__sign-up"));
}
