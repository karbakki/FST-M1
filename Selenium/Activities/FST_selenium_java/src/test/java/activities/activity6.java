package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class activity6 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);

        driver.get("https://training-support.net/selenium/input-events");
        System.out.println("Page Title:"+ driver.getTitle());

       // builder.sendKeys("L").pause(1000).build().perform();
        builder.keyDown(Keys.SHIFT).sendKeys("k").keyUp(Keys.SHIFT).build().perform();

        builder.keyDown(Keys.COMMAND).sendKeys("a").sendKeys("c").keyUp(Keys.COMMAND).build().perform();
        //builder.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();


        driver.close();

    }
}
