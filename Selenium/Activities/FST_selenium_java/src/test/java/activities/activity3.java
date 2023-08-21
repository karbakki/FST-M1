package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class activity3 {
    public static void main(String[] args)
    {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE ,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net");

        String title = driver.getTitle();
        System.out.println("Title:" + title);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement aboutUs = driver.findElement(By.xpath("//a[contains(@id,'about-link')]"));
        aboutUs.click();

        String title1 = driver.getTitle();
        System.out.println("NewPage Title:" + title1);

        driver.get("https://training-support.net/selenium/login-form");

        System.out.println("BaseTitle:" + driver.getTitle());

        WebElement username = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
        //WebElement login = driver.findElement(By.xpath("//button[contains(@class,'button')]" ));
        WebElement login = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
        System.out.println("LoginbuttonText:" + login.getText());
        login.click();
      //  WebElement red = driver.findElement(By.xpath("//div[contains(@id,'action')]"));
        WebElement red = driver.findElement(By.xpath("//div[@id='action-confirmation']"));

        System.out.println("Red text:" + red.getText());
        username.sendKeys("admin");
        password.sendKeys("password");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        login.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Green text:" + red.getText());
        System.out.println("Page2 Title:" + driver.getTitle());

        driver.quit();

    }
}

