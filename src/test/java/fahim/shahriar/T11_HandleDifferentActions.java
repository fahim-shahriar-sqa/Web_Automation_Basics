package fahim.shahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class T11_HandleDifferentActions extends T00_DriverSetup{

    @Test
    public void testActions() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 1000 ).build().perform();
        actions.moveToElement(driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();
        Thread.sleep(2000);

        WebElement el = driver.findElement(By.xpath("//input[@id='autocomplete']"));
        actions.moveToElement(el).build().perform();
        actions.sendKeys("Bangladesh").build().perform();

    }
}
