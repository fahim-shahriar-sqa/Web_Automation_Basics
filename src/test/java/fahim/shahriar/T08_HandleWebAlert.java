package fahim.shahriar;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T08_HandleWebAlert extends T00_DriverSetup{
    @Test
    public void interactWithAlert() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("1st alert: " + alert.getText());
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        System.out.println("2nd alert: " + alert.getText());
        Thread.sleep(2000);
        alert.dismiss();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        System.out.println("2nd alert: " + alert.getText());
        Thread.sleep(2000);
        alert.sendKeys("Henlo");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);

    }
}
