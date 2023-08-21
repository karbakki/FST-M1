package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.List;

public class activity14 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/tables");
        driver.manage().window().maximize();
        System.out.println(" Page Title: - " + driver.getTitle());

        WebElement tableName = driver.findElement(By.xpath("//div[contains(@class,'ui huge header')]"));
        System.out.println("Table Name : -" + tableName.getText());

        /* WebElement table2 = driver.findElement(By.id("sortableTable"));
        System.out.println("Table2 Text : " + table2.getText()); */

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'sortableTable']/thead/tr/th"));
        System.out.println("Rows in TableTwo:" + rows.size());

      List<WebElement> cells = driver.findElements(By.xpath("//table[@id = 'sortableTable']/tbody/tr"));
      System.out.println("Cells in TableTwo : " + cells.size());


       WebElement secondRowSecondColoumn = driver.findElement(By.xpath("//table[@id = 'sortableTable']/tbody/tr[2]/td[2]"));
       System.out.println("second row second column :" +secondRowSecondColoumn.getText());

        //header of the first column
        WebElement headerOfFirstColoumn = driver.findElement(By.xpath("//table[@id ='sortableTable']/thead/tr/th[1]"));
        headerOfFirstColoumn.click();

        secondRowSecondColoumn = driver.findElement(By.xpath("//table[@id = 'sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("second row second column after Name Sort :" + secondRowSecondColoumn.getText());

        //footer
        List<WebElement> footer = driver.findElements(By.xpath("//table[@id = 'sortableTable']/tfoot/tr/th"));
        System.out.println("Cell values of the footer: ");
        for(WebElement cell : footer) {
            System.out.println(cell.getText());
        }
        driver.close();
    }

}
