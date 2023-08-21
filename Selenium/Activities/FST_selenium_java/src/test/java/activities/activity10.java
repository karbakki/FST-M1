package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity10 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Page Title :" + driver.getTitle());

        WebElement checkBox = driver.findElement(By.xpath("//input[contains(@class,'willDisappear')]"));
        check(checkBox);
        WebElement removeButton = driver.findElement(By.id("toggleCheckbox"));
        //System.out.println("Button Text:" + removeButton.getText());
        removeButton.click();

        System.out.println("Checkbox verification after button click:");
        check(checkBox);

        driver.close();
    }


    public static void check(WebElement checkBox){
        if(checkBox.isDisplayed()) {
            System.out.println("**Check box is visible and clickable:**");
            checkBox.click();
        }else System.out.println("--Checkbox is not available--");

    }
}
