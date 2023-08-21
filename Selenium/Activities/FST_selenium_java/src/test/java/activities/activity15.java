package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity15 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("WebPage Name:" + driver.getTitle());
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[starts-with(@class,'username-')]"));
        username.click();
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.xpath("//input[starts-with(@class,'password-')]"));
        password.click();
        password.sendKeys("password");

        WebElement Login = driver.findElement(By.xpath("//button[@class='ui button']"));
        Login.click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='action-confirmation']")));
        WebElement message = driver.findElement(By.xpath("//div[@id='action-confirmation']"));

       /* WebElement h1 = driver.findElement(By.tagName("h1"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1"))); */

       System.out.println("Message:" + message.getText());


       driver.close();
    }
}
