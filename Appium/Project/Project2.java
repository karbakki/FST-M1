package Project_Appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Project2 {
    AndroidDriver driver;
    @BeforeTest
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppActivity(".activities.BrowseActivity");
        options.setAppPackage("com.google.android.keep");
        options.noReset();
        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL,options);
    }

    @Test
    public void GoogleKeepTest() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("com.google.android.keep:id/new_note_button")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("com.google.android.keep:id/open_search_bar_text_view")));
        System.out.println("waiting for icon clickable");
       // driver.findElement(AppiumBy.accessibilityId("New text note")).click();
        System.out.println(driver.findElement(AppiumBy.id("com.google.android.keep:id/new_note_button")).getClass());
       // driver.findElement(AppiumBy.id("com.google.android.keep:id/new_note_button")).submit();
        driver.findElement(AppiumBy.id("com.google.android.keep:id/add_items_layout")).click();
        driver.findElement(AppiumBy.id("com.google.android.keep:id/new_note_button")).click();
       // driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[contains(@content-desc,'New text note')]")).click();
        System.out.println("Icon clicked");
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("editable_title")));
        System.out.println("Title wait");
        driver.findElement(AppiumBy.id("editable_title")).sendKeys("Header");
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("edit_note_text")));
        driver.findElement(AppiumBy.id("edit_note_text")).sendKeys("Text description for Keep note");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

      String label = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("com.google.android.keep:id/index_note_title"))).getText();

     // String label = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[(@text,'Header') and (@resource-id,'com.google.android.keep:id/index_note_title')]"))).getText();
      Assert.assertEquals(label,"Header");

    }
    @AfterTest
    public void tearDown(){
       driver.quit();
    }


}
