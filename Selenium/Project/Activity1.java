import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        //Read the title of the website and verify text

        //Launch site and get website title
        driver.get("http://alchemy.hguy.co/crm");

        System.out.println("Page Title :" + driver.getTitle());

        if(driver.getTitle().equals("SuiteCRM"))
            System.out.println("WebSite title matched- Test passed ");
        else System.out.println("WebSite title not matched - Test Failed");

        driver.close();


    }
}
