package gt.com.mcdonalds.main.tasks;

import gt.com.mcdonalds.main.userinterfaces.PrincipalPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class NavegacionMenu implements Task {

    private String opcion;

    public NavegacionMenu(String opcion) {
        this.opcion = opcion;
    }


    public static Performable optionMenu(String option) {
    return instrumented(NavegacionMenu.class, option);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (opcion)
        {
            case "Menú":
                actor.attemptsTo(
                        Click.on(PrincipalPage.BTN_MENU));
                break;
            case "Ubicaciones":
                actor.attemptsTo(
                        Click.on(PrincipalPage.BTN_UBICACIONES));
                break;
            case "Promociones & Apps":
                actor.attemptsTo(
                        Click.on(PrincipalPage.BTN_PROMOCIONES_APPS));
                break;
            case "Cajita Feliz":
                actor.attemptsTo(
                        Click.on(PrincipalPage.BTN_CAJITA_FELIZ));
                break;
            case "Servicio al cliente":
                actor.attemptsTo(
                        Click.on(PrincipalPage.BTN_SERVICIO_AL_CLIENTE));
                break;
        }

    }
}
