package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity17 {
    public static void main(String[] args) {
        String url = "https://training-support.net/selenium/selects";
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriver driver = new FirefoxDriver();
        utility obj = new utility();
        obj.launch(driver,url);
        System.out.println("WebPage Title:" + driver.getTitle());

        WebElement singleSelect = driver.findElement(By.id("single-select"));
        singleSelect.click();

    }
}
