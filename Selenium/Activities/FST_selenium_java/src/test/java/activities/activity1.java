package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity1 {
    public static void main(String[] args) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE ,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net");

         String title = driver.getTitle();
         System.out.println("Title:" + title);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


         WebElement aboutUs = driver.findElement(By.id("about-link"));
         aboutUs.click();

         String title1 = driver.getTitle();
         System.out.println("NewPage Title:" + title1);

         driver.close();
    }
}
