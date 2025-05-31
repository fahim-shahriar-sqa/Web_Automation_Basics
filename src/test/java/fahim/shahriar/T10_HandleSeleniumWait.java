package fahim.shahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class T10_HandleSeleniumWait extends T00_DriverSetup{

    @Test
    public void testDelayElement() throws InterruptedException {
        driver.get("https://qavbox.github.io/demo/delay/");
        // Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.findElement(By.xpath("//input[@name='commit']")).click();
        WebElement t1 = driver.findElement(By.xpath("//h2[@id='two']"));
        System.out.println("Text 1: " + t1.getText() );

        driver.findElement(By.xpath("//input[@name='commit1']")).click();
        WebElement t2 = driver.findElement(By.xpath("//h2[@id='delay']"));
        System.out.println("Text 2: " + t2.getText() );

        driver.findElement(By.xpath("//input[@id='loaderStart']")).click();
        WebElement t3 = driver.findElement(By.xpath("//h2[@id='loaderdelay']"));
        System.out.println("Text 3: " + t3.getText() );

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElement(t1, "I am here!"));

    }
}
