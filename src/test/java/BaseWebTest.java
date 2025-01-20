import com.codeborne.selenide.Configuration;
import enums.ConfigProperties;
import helpers.ConfigReader;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.DriverManager;


public class BaseWebTest {
    protected WebDriver driver;
    protected SoftAssertions softly = new SoftAssertions();

    @BeforeClass()
    public void setUp() {
        Configuration.timeout = Integer.parseInt(ConfigReader.getProperty(ConfigProperties.TIMEOUT.getName()));
        driver = DriverManager.getInstance();
        driver.get(ConfigReader.getProperty(ConfigProperties.URL.getName()));
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void quit() {
        DriverManager.quit();
    }
}
