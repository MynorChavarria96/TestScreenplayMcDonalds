package gt.com.mcdonalds.main.questions;

import gt.com.mcdonalds.main.tasks.VentanaEmergente;
import gt.com.mcdonalds.main.userinterfaces.PrincipalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RespuestaPaginaInicio implements Question <Boolean> {
    private final String texto;

    public RespuestaPaginaInicio(String texto) {
        this.texto = texto;
    }
public static Question<Boolean> delTexto(String texto){
        return new RespuestaPaginaInicio(texto);
}
    @Override
    public Boolean answeredBy(Actor actor) {
        return texto.equals(PrincipalPage.TITULO_INICIO.resolveFor(actor).getText());
    }
}
