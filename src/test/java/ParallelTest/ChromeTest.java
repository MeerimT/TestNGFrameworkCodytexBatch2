package ParallelTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ChromeTest {

        WebDriver driver;

        @Test
        public void ChromeTest(String item) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.amazon.com/");
            driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Car" + Keys.ENTER);
            Thread.sleep(5000);
            driver.quit();
        }
     //   @DataProvider(name="searchItem")



    }

