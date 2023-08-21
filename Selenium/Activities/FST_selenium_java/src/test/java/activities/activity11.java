package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Field;
import java.time.Duration;

public class activity11 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("PageTitle:" + driver.getTitle());

        WebElement check = driver.findElement(By.name("toggled"));
        check.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("toggled")));

        System.out.println("Checkbox is selected :" + check.isSelected());

        check.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("toggled")));
        System.out.println("Checkbox is selected :" + check.isSelected());

        driver.close();


    }
}
