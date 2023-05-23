import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriver driver = new FirefoxDriver();
        Utility utility = new Utility();
        utility.login(driver);

        WebElement sales = driver.findElement(By.id("grouptab_0"));
        sales.click();
        WebElement leads = driver.findElement(By.id("moduleTab_9_Leads"));
        leads.click();

        WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='moduleTitle']")));

        WebElement table = driver.findElement(By.xpath("//form[2]/div[3]/table/tbody"));


        List<WebElement> rows =  table.findElements(By.xpath("//tr"));
        System.out.println(rows.size());

        List<WebElement> names = table.findElements(By.xpath("//td[3][contains(@class,'inlineEdit')]"));
        List<WebElement> roles = table.findElements(By.xpath("//td[8]"));

        Iterator<WebElement> cell1 = names.iterator();
        Iterator<WebElement>  cell2 = roles.iterator();
        for ( int i =1; i<11; i++)
        {
            if(cell1.hasNext()) {
                WebElement name = cell1.next();
                System.out.println("Name" + i + ":" + name.getText());
            }
            if(cell2.hasNext()) {
                WebElement role = cell2.next();
                System.out.println("Role" + i + ":" + role.getText());
            }
        }

        driver.close();

    }
}

