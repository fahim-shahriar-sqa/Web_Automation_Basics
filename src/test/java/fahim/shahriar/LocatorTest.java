package fahim.shahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorTest extends DriverSetup{

    @Test
    public void locatorTest() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchArea = driver.findElement(By.id("APjFqb"));
//        WebElement searchArea = driver.findElement(By.name("q"));
//        WebElement searchArea = driver.findElement(By.tagName("textarea"));
//        WebElement searchArea = driver.findElement(By.className("gLFyf"));
//        WebElement searchArea = driver.findElement(By.className("q"));



        searchArea.sendKeys("Bangladesh");
        Thread.sleep(3000);

        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.findElement(By.partialLinkText("How Search")).click();
        Thread.sleep(3000);
    }
}
