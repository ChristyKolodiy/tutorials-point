package utils;

import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getInstance() {
        if (driver.get() == null) {
            WebDriverManager.chromedriver().setup();
            driver.set(new ChromeDriver());
            WebDriverRunner.setWebDriver(driver.get());
        }
        return driver.get();
    }

    public static void quit() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
