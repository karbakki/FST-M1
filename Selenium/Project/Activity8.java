import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class Activity8 {

    public static void main(String[] args) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");

        WebDriver driver = new FirefoxDriver();
        Utility utility = new Utility();

        utility.login(driver);

        WebElement sales = driver.findElement(By.xpath("//a[text() = 'Sales']"));
        sales.click();
        WebElement accounts = driver.findElement(By.xpath("//a[text() = 'Accounts']"));
        accounts.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='list view table-responsive']/tbody/tr/td[3]")));

       WebElement table = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody"));

       List<WebElement> rows = table.findElements(By.xpath("//tr[@class='oddListRowS1']"));
        System.out.println("rows:" + rows.size());

        List<WebElement> cellos = table.findElements(By.xpath("//tr[@class='oddListRowS1']/td[3]"));
        java.util.Iterator<WebElement> cel = cellos.iterator();
        for ( int i =0; i<5; i++)
         {
            WebElement name = cel.next();
            System.out.println(name.getText());
        }

        driver.close();

    }
}

