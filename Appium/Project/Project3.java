package Project_Appium;

import com.beust.ah.A;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Project3 {
    AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.setAppPackage("com.android.chrome");
        options.noReset();
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
    }

    @Test
    public void chromeApptest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://www.training-support.net/selenium");

        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView")));
        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".flingForward()"));
        driver.findElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'To-Do')]")).click();

       // driver.findElement(AppiumBy.xpath("//android.widget.Button[@text()='Add Task']")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("Add Task"))).click(); //sendKeys("Add tasks to list");

        //driver.findElement(AppiumBy.androidUIAutomator("resourceId(\"taskInput\")")).sendKeys("Get number of tasks");
        // Get image elements after scroll
        List<WebElement> classElements = driver.findElements(AppiumBy.className("android.widget.EditText"));
        // Print the number of images after scroll
        System.out.println("Edit Text Class elements : " + classElements.size());
        for(WebElement classElement:classElements){
            System.out.println(classElement.getText());
        }

        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id,'taskInput']")).sendKeys("Add tasks to list");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Add Task\")")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id,'taskInput']")).sendKeys("Get number of tasks");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Add Task\")")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id,'taskInput']")).sendKeys("Clear the list");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Add Task\")")).click();

        List<WebElement> txtElements = driver.findElements(AppiumBy.className("android.widget.TextView"));
        // Print the number of images after scroll
        System.out.println("Edit Text Class elements : " + txtElements.size());
        for(WebElement txtElement:txtElements){
            System.out.println(txtElement.getText());
        }

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Add tasks to list\")")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Get number of tasks\")")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Clear the list\")")).click();

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"To-Do List\")")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\" Clear List\")")).click();

        List<WebElement> AfterElements = driver.findElements(AppiumBy.className("android.widget.TextView"));
        System.out.println("Edit Text Class elements : " + AfterElements.size());
        for(WebElement AfterElement:AfterElements){
            System.out.println(AfterElement.getText());
        }
        int ListAfterDeleting = AfterElements.size();

        Assert.assertEquals(ListAfterDeleting,5);
    }
}
