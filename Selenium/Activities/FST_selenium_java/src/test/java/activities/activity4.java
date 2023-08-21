package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity4 {

    public static void main(String[] args) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/target-practice");

        System.out.println("Page Title :" + driver.getTitle());
        WebElement thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']"));
        System.out.println("Third Header Name :"+ thirdHeader.getText());

        WebElement fifthHeader = driver.findElement(By.xpath("//h5[contains(@class,'green')]"));
        String color = fifthHeader.getCssValue("color");
        System.out.println("Fifth header colr:"+ color);

        String violet = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
        System.out.println("Violet button classed:" + violet);

        String grey = driver.findElement(By.xpath("//button[contains(@class,'grey')]")).getText();
        System.out.println("Violet button classed:" + grey);

        driver.close();

    }
}
