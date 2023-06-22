package gt.com.mcdonalds.main.hooks;

import gt.com.mcdonalds.main.exceptions.exceptionLoadProperties;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class McDonaldsHooks {

    static Properties properties = new Properties();

    @Before
    public void setUpOnStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
    }

    @Before
    public void OnStage() throws exceptionLoadProperties {
        try(FileReader reader = new FileReader("src/test/resources/general.properties")) {
            properties.load(reader);
        }
        catch (IOException e){
            throw new exceptionLoadProperties("Error en la carga del archivo propierties",e);
        }
    }

    public static Properties getProperties(){
        return properties;
    }
}
