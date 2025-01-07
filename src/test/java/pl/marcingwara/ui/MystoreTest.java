package pl.marcingwara.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MystoreTest {
    WebDriver driver;

    @BeforeAll
    void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @Test
    void examplel() {
        // 1. https://mystore-testlab.coderslab.pl
        String url;
        driver.navigate().to("https://mystore-testlab.coderslab.pl");
        //2. klikniecie na sigi in
        driver.findElement(By.cssSelector("[class=\"user-info\"]")).click();
        //3. Podanie Loginu i hasla
        driver.findElement(By.cssSelector("[id=\"field-email\"]")).sendKeys("marcingwara@gmx.de");
        driver.findElement(By.cssSelector("[id=\"field-password\"]")).sendKeys("zanbiF-zyzxyn-vysni2");
        driver.findElement(By.cssSelector("[id=\"submit-login\"]")).click();

    }

    @AfterAll
      void tearDown(){
         driver.quit();
    }
}
