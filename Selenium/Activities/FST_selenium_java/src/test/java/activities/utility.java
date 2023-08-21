package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class utility {
    public void launch(WebDriver driver ,String url){
        WebDriverManager.firefoxdriver().setup();
        driver.get(url);
        driver.manage().window().maximize();

    }

}
