package fahim.shahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T09_HandleFrameElement extends T00_DriverSetup{
    @Test
    public void interactWithFrame() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement frame = driver.findElement(By.xpath("//legend[normalize-space()='iFrame Example']"));
        System.out.println(frame.getText());
        driver.switchTo().frame("courses-iframe");
        WebElement frameReg = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        System.out.println(frameReg.getText());
    }
}
