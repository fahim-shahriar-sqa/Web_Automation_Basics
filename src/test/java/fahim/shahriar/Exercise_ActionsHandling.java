package fahim.shahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Exercise_ActionsHandling extends T00_DriverSetup{

    @Test
    public void handleActions() throws InterruptedException {
        driver.get("https://demoqa.com/");

        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 500).build().perform();
        Thread.sleep(2000);

        //actions.scrollToElement(driver.findElement(By.xpath("//h5[normalize-space()='Book Store Application']"))).build().perform();
        //Thread.sleep(2000);

        WebElement elements = driver.findElement(By.cssSelector("div[class='category-cards'] div:nth-child(1) div:nth-child(1) div:nth-child(3) h5:nth-child(1)"));
        actions.moveToElement(elements).build().perform();
        elements.click();
        Thread.sleep(2000);

        WebElement buttons = driver.findElement(By.xpath("//span[normalize-space()='Buttons']"));
        buttons.click();
        Thread.sleep(2000);

        actions.clickAndHold(driver.findElement(By.xpath("//button[text()='Click Me']"))).build().perform();
        Thread.sleep(2000);
        actions.doubleClick(driver.findElement(By.xpath("//button[@id='doubleClickBtn']"))).build().perform();
        Thread.sleep(2000);
        /*

        WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
        actions.clickAndHold(clickMe).build().perform();
        Thread.sleep(2000);
        WebElement doubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        actions.doubleClick(doubleClick).build().perform();
        Thread.sleep(2000);
        */

    }
}
