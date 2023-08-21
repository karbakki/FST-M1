package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity8 {
    public static void main(String[] args) throws InterruptedException {
        //Driver setup
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("PageTitle:" + driver.getTitle());

        // checkobox toggle button click

        //WebElement checkBox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
        WebElement checkBox = driver.findElement(By.id("toggleCheckbox"));
        checkBox.click();

        //Waiting for Checkmark to disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println("Dynamic checkbox not displaying: "+checkBox.isDisplayed());
        checkBox.click();

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println("Dynamic checkbox displaying Now: " + checkBox.isDisplayed());


        driver.close();
    }
}
