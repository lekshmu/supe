package Runner_file;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"C://Users//AJIT SINGH PAWAR//OneDrive//Desktop//automation//Enterprice-superadmin//src//main//resources//Feature"},
        glue = {"StepDefinition"}
)

public class TestSuite {

}