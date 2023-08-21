package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity12 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);

        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("PageTitle:" + driver.getTitle());

        WebElement textField = driver.findElement(By.id("dynamicText"));
        System.out.println("Text Field is Enabled :" + textField.isEnabled());

        WebElement toggleButton = driver.findElement(By.id("toggleInput"));
        System.out.println("ToggleButton before click status text:" + toggleButton.getText());
        toggleButton.click();
        System.out.println("ToggleButton After click Status Text:" + toggleButton.getText());


        System.out.println("Text Field is After Button Click :" + textField.isEnabled());
        builder.click(textField).release(textField).sendKeys("Karun").build().perform();

        driver.close();

    }
}
