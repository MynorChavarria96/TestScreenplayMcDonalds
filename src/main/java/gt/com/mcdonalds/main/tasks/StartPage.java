package gt.com.mcdonalds.main.tasks;

import gt.com.mcdonalds.main.userinterfaces.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class StartPage implements Task {

    public static Performable volverInicio() {
        return instrumented(StartPage.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PrincipalPage.BTN_LOGOMCDONALDS)
        );
    }
}
