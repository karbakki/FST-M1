package Project_Appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Project1 {
    AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL,options);


    }

    @Test
    public void googleTaskTest() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       // Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Create new task")));
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_bottom_app_bar")).click();
        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.apps.tasks:id/add_task_title")));
       driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete Activity with Google Tasks");
       WebElement save = driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done"));
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.apps.tasks:id/tasks_fab")));
          driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        String task1 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks, Starred\"]/android.view.ViewGroup/android.widget.TextView")).getText();
        System.out.println("task1 :"+ task1);
        Assert.assertEquals(task1,"Complete Activity with Google Tasks");


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.apps.tasks:id/add_task_title")));
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete Activity with Google Keep");

        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.apps.tasks:id/tasks_fab")));
        String task2 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Keep, Starred\"]/android.view.ViewGroup/android.widget.TextView")).getText();
       System.out.println("task2 - "+ task2);
        Assert.assertEquals(task2,"Complete Activity with Google Keep");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(AppiumBy.accessibilityId("Create new task")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.apps.tasks:id/add_task_title")));
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete the second Activity Google Keep");
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.apps.tasks:id/tasks_fab")));
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        String task3 = driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep, Starred\"]/android.view.ViewGroup/android.widget.TextView")).getText();
        System.out.println("task3 - "+ task3);
       Assert.assertEquals(task3,"Complete the second Activity Google Keep");

    }

    @AfterClass
    public void tearDown(){

        List<WebElement> checks = driver.findElements(AppiumBy.xpath("//android.view.View[@resource-id,'tasks_item_completed_check']"));
        System.out.println("Number of added tasks:-" + checks.size());
        for ( WebElement check:checks){
            check.click();
            driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        }
        // Close the app

        driver.quit();
    }
}
