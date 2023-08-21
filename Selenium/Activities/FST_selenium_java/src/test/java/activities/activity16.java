package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class activity16 {
    public static void main(String[] args) {
        String url = "https://training-support.net/selenium/dynamic-attributes";
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriver driver = new FirefoxDriver();

        utility obj = new utility();
        obj.launch(driver,url);
        System.out.println("Page Title:" + driver.getTitle());

        WebElement username = driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
        username.sendKeys("karun");

        WebElement password = driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
        password.sendKeys("Abcd1234");

       WebElement comfirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
      // WebElement comfirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
        comfirmPassword.click();
        comfirmPassword.sendKeys("Abcd1234");

        WebElement email = driver.findElement(By.xpath("//label[text() = 'Email']/following-sibling::input"));
        email.click();
        email.sendKeys("Abcd1234");

        WebElement submit = driver.findElement(By.xpath("//button[text() = 'Sign Up']"));
        submit.click();

        WebElement message = driver.findElement(By.id("action-confirmation"));
        String RegisterMessage = message.getText();
        System.out.println("Register message :" + RegisterMessage);

       driver.close();
    }
}
