package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class activity5 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);


        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Page Title -" + driver.getTitle());

        WebElement dice =  driver.findElement(By.className("active"));
        System.out.println("Dice text:" + dice.getText());

        builder.click().pause(1000).build().perform();

        String frontText =  driver.findElement(By.className("active")).getText();
        System.out.println( "Face Value-" + frontText);


        builder.doubleClick().pause(1000).build().perform();
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println( "Face Value-" +frontText);



        builder.contextClick().pause(1000).build().perform();
        frontText =  driver.findElement(By.className("active")).getText();
        System.out.println("Face Value-" +frontText);




        driver.close();


    }
}
