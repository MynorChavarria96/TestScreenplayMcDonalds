package gt.com.mcdonalds.test.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/navegacion_menu.feature",
        glue = {"gt.com.mcdonalds.main.stepdefinitions","gt.com.mcdonalds.main.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class NavegationRunnerTest {
}
