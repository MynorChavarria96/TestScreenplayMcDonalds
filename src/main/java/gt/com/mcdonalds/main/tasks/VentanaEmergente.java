package gt.com.mcdonalds.main.tasks;

import gt.com.mcdonalds.main.userinterfaces.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import static net.serenitybdd.screenplay.Tasks.instrumented;



public class VentanaEmergente implements Task {
    public static Performable cerrar() {
        return instrumented(VentanaEmergente.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(PrincipalPage.VENTANA_EMERGENTE.resolveFor(actor).isVisible())
                        .andIfSo(Click.on(PrincipalPage.BTN_CERRAR_VENTANA_EMERGENTE))
        );
    }
}
