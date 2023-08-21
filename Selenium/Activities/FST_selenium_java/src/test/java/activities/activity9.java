package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity9 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/ajax");
        System.out.println("PageTitle" +driver.getTitle());

        WebElement button = driver.findElement(By.xpath("//button[contains(@class,'violet')]"));
        button.click();

        WebElement hello = driver.findElement(By.id("ajax-content"));
        WebElement h1 = driver.findElement(By.tagName("h1"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        System.out.println("After Click Whole Text:" + hello.getText());
        System.out.println("H1 text:" + h1.getText());

        WebElement h3 = driver.findElement(By.tagName("h3"));

        //System.out.println("After Click Whole Text:" + hello.getText());
        System.out.println("H3 text:" + h3.getText());

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"),"I'm late!"));
        String delayedText = driver.findElement(By.tagName( "h3")).getText();
        System.out.println("H3 delayed Text:" + delayedText);

        driver.close();

    }
}
