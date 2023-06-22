package gt.com.mcdonalds.main.stepdefinitions;

import gt.com.mcdonalds.main.hooks.McDonaldsHooks;
import gt.com.mcdonalds.main.questions.RespuestaMenuNavegacion;
import gt.com.mcdonalds.main.questions.RespuestaPaginaInicio;
import gt.com.mcdonalds.main.tasks.NavegacionMenu;
import gt.com.mcdonalds.main.tasks.StartPage;
import gt.com.mcdonalds.main.tasks.VentanaEmergente;
import gt.com.mcdonalds.main.userinterfaces.PrincipalPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NavegacionStepDefinitions {
    @Given("que un usuario visita la pagina de Inicio")
    public void queUnUsuarioVisitaLaPaginaDeInicio() {
        theActorInTheSpotlight().attemptsTo(
                Open.url(McDonaldsHooks.getProperties().getProperty("mcDonaldsURL"))
        );
    }
    @When("la ventana emergente aparece")
    public void laVentanaEmergenteAparece() {
       theActorInTheSpotlight().attemptsTo(
               VentanaEmergente.cerrar()
       );
    }
    @Then("el usuario puede ver el texto {string}")
    public void elUsuarioPuedeVerElTexto(String value) {
      theActorInTheSpotlight().should(
              GivenWhenThen.seeThat("Contiene", RespuestaPaginaInicio.delTexto(value))
      );
    }
    @When("el usuario hace clic en {string}")
    public void elUsuarioHaceClicEn(String value) {

        theActorInTheSpotlight().wasAbleTo(
                    NavegacionMenu.optionMenu(value)
        );
    }
    @Then("el usuario es redirigido y ve la palabra {string}")
    public void elUsuarioEsRedirigidoYVeLaPalabra(String value) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("Contiene", RespuestaMenuNavegacion.contienePalabra(value))
        );
    }
    @Then("da clic en Logo McDonald's")
    public void daClicEn() {
        theActorInTheSpotlight().wasAbleTo(
                StartPage.volverInicio()
        );
    }
}
