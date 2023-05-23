import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity7 {

    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Utility utility = new Utility();
        utility.login(driver);

        Actions builder = new Actions(driver);
        WebElement sales = driver.findElement(By.id("grouptab_0"));
        sales.click();

        WebElement leads = driver.findElement(By.id("moduleTab_9_Leads"));
        leads.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@id,'adspan_1bf01e91')]")));
        WebElement icon = driver.findElement(By.xpath("//span[contains(@id,'adspan_1bf01e91')]"));

        icon.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='open ui-dialog-content ui-widget-content']/span")));
        WebElement widget = driver.findElement(By.xpath("//div[@class='open ui-dialog-content ui-widget-content']/span"));

        System.out.println("Phone Class:" + widget.getAttribute("class"));
        System.out.println("Phone Number:" + widget.getText());


        WebElement x = driver.findElement(By.xpath("//span[contains(@class,'ui-icon-closethick')]"));
        builder.moveToElement(x).click().build();

        driver.close();


    }
}
