import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;

public class Activity2 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //Get the url of the header image
        driver.get("http://alchemy.hguy.co/crm");

       WebElement url = driver.findElement(By.xpath("//img[contains(@src,'images')]"));

       System.out.println( "Image URL - " + url.getAttribute("src"));

        driver.close();

    }
}