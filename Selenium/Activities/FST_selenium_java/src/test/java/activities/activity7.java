package activities;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class activity7 {
    public static void main(String[] args) {
        //Driver Setup
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);

        //Launch Site and collect Web elements
        driver.get(" https://training-support.net/selenium/drag-drop");
        System.out.println("PageTitle:" + driver.getTitle());

        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement drop1 = driver.findElement(By.id("droppable"));
        WebElement drop2 = driver.findElement(By.id("dropzone2"));

        //Move Ball to drop1Zone
         builder.clickAndHold(ball).moveToElement(drop1).release(ball).build().perform();
         String color = drop1.getAttribute("style");
         System.out.println("drop1_Back_ground_style:" + color);

         // Get Text of Drop1ZOne and confirm dropped by using that string
         String drop1Status = drop1.getText();
         System.out.println("drop1_Back_ground_Text:" + drop1Status);
         System.out.println( "Ball dropped in Drop1 :" + drop1Status.contains("Dropped!"));

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));


        //Move ball from drop1zone to drop2zone
        builder.clickAndHold(ball).moveToElement(drop2).release(ball).build().perform();


        // Get Text of Drop1ZOne and confirm dropped by using that string
        String drop2Status = drop2.getText();
        System.out.println("drop1_Back_ground_Text:" + drop2Status);
        System.out.println( "Ball dropped in Drop2 :" + drop2Status.contains("Dropped!"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

        driver.close();
        }
    }


