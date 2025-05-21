package fahim.shahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Exercise2Test extends DriverSetup{
    @Test
    public void locatorTest() throws InterruptedException {
        /*
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("https://www.wikipedia.org/");
        System.out.println("Url : " + driver.getCurrentUrl());
        System.out.println("Title : " + driver.getTitle());
        Thread.sleep(3000);

        // Search By id.
        WebElement searchText = driver.findElement(By.id("searchInput"));
        searchText.sendKeys("Bangladesh");
        Thread.sleep(3000);

        // Search By tag name.
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(3000);

        // Search By link text.
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.linkText("How Search works")).click();
        Thread.sleep(3000);

        // Search By partial link text.
        driver.findElement(By.partialLinkText("Search works")).click();
        Thread.sleep(3000);

        // Search By class name.
        driver.findElement(By.className("glue-header__item")).click();
        Thread.sleep(3000);


        driver.get("https://www.autocare.com.bd/");

        driver.findElement(By.xpath("//nav[@class='md:flex justify-between items-center']"));

        WebElement searchText = driver.findElement(By.cssSelector("body > header:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > input:nth-child(1)"));
        searchText.sendKeys("Toyota");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
        Thread.sleep(3000);
        */
        driver.manage().window().maximize();
        driver.get("https://www.google.co.uk/");
        driver.findElement(By.xpath("//div[@aria-label='Search by voice']//*[name()='svg']")).click();
        Thread.sleep(3000);
    }
}
