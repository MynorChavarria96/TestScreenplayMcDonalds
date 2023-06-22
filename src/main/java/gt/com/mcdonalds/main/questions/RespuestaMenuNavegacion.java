package gt.com.mcdonalds.main.questions;

import gt.com.mcdonalds.main.userinterfaces.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RespuestaMenuNavegacion implements Question<Boolean> {
    private final String palabra;

    public RespuestaMenuNavegacion(String palabra) {
        this.palabra = palabra;
    }


    public static Question<Boolean> contienePalabra(String palabra) {
        return new RespuestaMenuNavegacion(palabra);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        switch (palabra){
            case "Menú":
                return palabra.equals(PrincipalPage.VISTA_MENU.resolveFor(actor).getText());
            case "Filtros":
                return palabra.equals(PrincipalPage.VISTA_UBICACIONES.resolveFor(actor).getText());
            case "Promociones":
                return palabra.equals(PrincipalPage.VISTA_PROMOCIONES_APPS.resolveFor(actor).getText());
            case "Diversión en Familia":
                return palabra.equals(PrincipalPage.VISTA_CAJITA_FELIZ.resolveFor(actor).getText());
            case "Quejas":
                return palabra.equals(PrincipalPage.VISTA_SERVICIO_AL_CLIENTE.resolveFor(actor).getText());
            default:
                return false;
        }

    }
}
