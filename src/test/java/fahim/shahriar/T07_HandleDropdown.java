package fahim.shahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class T07_HandleDropdown extends T00_DriverSetup{

    @Test
    public void interactionWithDropdown() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        WebElement selectElement = driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(selectElement);

        selectElement.click();
        Thread.sleep(2000);

        select.selectByIndex(1);
        Thread.sleep(2000);
        System.out.println("Selected option: " + select.getFirstSelectedOption().getText());

        select.selectByValue("option2");
        Thread.sleep(2000);
        System.out.println("Selected option: "+ select.getFirstSelectedOption().getText());

        select.selectByVisibleText("Option3");
        Thread.sleep(2000);
        System.out.println("Selected option: "+ select.getFirstSelectedOption().getText());

        List<WebElement> all_options = select.getOptions();
        System.out.println("Number of options : " + all_options.size());
        System.out.println("List of options");
        for (WebElement options: all_options){
            System.out.println(options.getText());
        }
    }
}
