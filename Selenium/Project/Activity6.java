import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {


    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");

        WebDriver driver = new FirefoxDriver();
        Utility utility = new Utility();
        utility.login(driver);
         menuChecking(driver);
         driver.close();

    }

    private static void menuChecking(WebDriver driver) {
        
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        WebElement link = driver.findElement(By.xpath("//a[text() = 'Activities']"));
        System.out.println("Text:" +link.getText());
        link.click();

        WebElement calenderOption = driver.findElement(By.id("moduleTab_9_Calendar"));
        System.out.println("Activity menu options are displaying:" + calenderOption.isDisplayed());


        }

    }

