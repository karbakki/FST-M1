import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //Launch site and get website title
        driver.get("http://alchemy.hguy.co/crm");

        WebElement copyRightText = driver.findElement(By.id("admin_options"));
        System.out.println("CopyRight Text:" + copyRightText.getText());

        driver.close();
    }
}
