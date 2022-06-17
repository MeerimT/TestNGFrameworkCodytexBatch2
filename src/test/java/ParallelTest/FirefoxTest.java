package ParallelTest;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
        WebDriver driver;

        @Test
        public void FirefoxTest() throws InterruptedException {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get("https://www.amazon.com/");
            driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Car" + Keys.ENTER);
            Thread.sleep(5000);
            driver.quit();
        }
    }
