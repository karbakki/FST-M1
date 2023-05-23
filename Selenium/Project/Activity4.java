import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Statement;
import java.time.Duration;

public class Activity4 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Launch site and get website title
        driver.get("http://alchemy.hguy.co/crm");
        System.out.println("Before login page title : " + driver.getTitle());

        WebElement userName = driver.findElement(By.id("user_name"));
        WebElement password = driver.findElement(By.id("username_password"));
        WebElement loginButton = driver.findElement(By.id("bigbutton"));
        userName.sendKeys("admin");
        password.sendKeys("pa$$w0rd");
        loginButton.click();
        //wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.id("with-label"))));

        WebElement profileLink = driver.findElement(By.id("globalLinks"));


       if( driver.findElement(By.id("globalLinks")).isEnabled())
           System.out.println("Login done successful");
       else
           System.out.println("Logged in failed");

        driver.close();

    }

}
