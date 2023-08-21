package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class activity18 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/selenium/selects");

        System.out.println("Title of the Page :" + driver.getTitle());

        WebElement dropdown = driver.findElement(By.id("multi-select"));

        Select multiSelect = new Select(dropdown);

        multiSelect.selectByVisibleText("Javascript");

        for(int i =4; i<=6;i++){
            multiSelect.selectByIndex(i);
        }
        multiSelect.selectByValue("node");

        List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected pOptions are :");
        for(WebElement Option : selectedOptions){
            System.out.println(Option.getText());
        }

        multiSelect.deselectByIndex(5);
        selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("selected options are :");
        for (WebElement option : selectedOptions){
            System.out.println(option.getText());
        }

        driver.quit();
    }
}
