package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.firefox.FirefoxDriver.*;

public class helloSelinium {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
       // WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new FirefoxDriver();


        //WebDriver driver = new ChromeDriver();


        driver.get("https://training-support.net/");
        System.out.println(driver.getTitle());

        Thread.sleep(10000);

        driver.findElement(By.xpath("//i[contains(@class,'sidebar big icon')]")).click();


        WebElement aboutus = driver.findElement((By.id("about-link")));
        aboutus.click();

        /*WebElement icon = driver.findElement(By.xpath("//i[contains(@class,'sidebar')]"));
        boolean op = icon.isDisplayed();
        System.out.println(op);
        icon.click();

        driver.findElement(By.id("nav2")).click(); */


        String pageTitle = driver.getTitle();
        System.out.println("New page Title:" + pageTitle);




    }
}
