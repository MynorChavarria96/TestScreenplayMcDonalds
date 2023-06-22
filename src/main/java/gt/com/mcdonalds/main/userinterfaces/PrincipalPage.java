package gt.com.mcdonalds.main.userinterfaces;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

public class PrincipalPage {

    private PrincipalPage(){

    }

    public static  final Target VENTANA_EMERGENTE = Target.the("ventana emergente que sale al inicio").
            locatedBy("//div[@id='wzrk_wrapper']");
    public static  final Target BTN_CERRAR_VENTANA_EMERGENTE = Target.the("boton cerrar ventana emergente que sale al inicio").
            locatedBy(" //button[@id= 'wzrk-cancel']");

    public static  final Target TITULO_INICIO = Target.the("titulo en pagina de inicio").
            locatedBy("//p[@class = 'mc-text-info']");

    public static  final Target BTN_MENU = Target.the("boton para ir a la ventana menú").
            locatedBy("//a[contains(@class, 'item-nav' )and text()=' Menú ']");
    public static  final Target BTN_UBICACIONES= Target.the("boton para ir a la ventana ubicaciones").
            locatedBy("//a[contains(@class, 'item-nav' )and text()=' Ubicaciones ']");
    public static  final Target BTN_PROMOCIONES_APPS= Target.the("boton para ir a la ventana promocines y apps").
            locatedBy("//a[contains(@class, 'item-nav' )and text()=' Promociones & Apps ']");
    public static  final Target BTN_CAJITA_FELIZ= Target.the("boton para ir a la ventana cajita feliz").
            locatedBy("//a[contains(@class, 'item-nav' )and text()=' Cajita Feliz ']");
    public static  final Target BTN_SERVICIO_AL_CLIENTE= Target.the("boton para ir a la ventana cajita feliz").
            locatedBy("//a[contains(@class, 'item-nav' )and text()=' Servicio al cliente ']");
    public static  final Target BTN_LOGOMCDONALDS= Target.the("boton para ir a la ventana de inicio").
            locatedBy("//a[@aria-label=\"Logo McDonald's\"]");
    public static  final Target VISTA_MENU= Target.the("Palabra que indica que entró a menú").
            locatedBy("//h1[contains(text(), 'Menú')]");
    public static  final Target VISTA_UBICACIONES= Target.the("Palabra que indica que entró a ubicaciones").
            locatedBy("//h4[contains(text(), 'Filtros')]");
    public static  final Target VISTA_PROMOCIONES_APPS= Target.the("Palabra que indica que entró a promociones y apps").
            locatedBy("//h3[contains(text(), 'Promociones')]");
    public static  final Target VISTA_CAJITA_FELIZ= Target.the("Palabra que indica que entró a cajita feliz").
            locatedBy("//h1[contains(text(), 'Diversión en Familia')]");
    public static  final Target VISTA_SERVICIO_AL_CLIENTE= Target.the("Palabra que indica que entró a servicio al cliente").
            locatedBy("//h3[contains(text(), 'Quejas')]");



}
