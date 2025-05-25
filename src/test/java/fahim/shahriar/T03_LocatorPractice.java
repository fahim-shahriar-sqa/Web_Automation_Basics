package fahim.shahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T03_LocatorPractice extends T00_DriverSetup {
    @Test
    public void locatorTest() throws InterruptedException {

        // Step 1: Maximize window and go to Wikipedia
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        Thread.sleep(3000);

        // Step 2: Search using ID locator
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("Bangladesh");
        Thread.sleep(3000);

        // Step 3: Click search button using tag name
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(3000);

        // Step 4: Navigate to Google and test link text locators
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.linkText("How Search works")).click();
        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("Search works")).click();
        Thread.sleep(3000);

        // Step 5: Locate an element by class name
        driver.findElement(By.className("glue-header__item")).click();
        Thread.sleep(3000);

        // Step 6: Go to AutoCare and use XPath and CSS selectors
        driver.get("https://www.autocare.com.bd/");

        // XPath for navigation bar (just finding, not interacting)
        driver.findElement(By.xpath("//nav[@class='md:flex justify-between items-center']"));

        // CSS Selector to search for a car
        WebElement autoCareSearch = driver.findElement(By.cssSelector(
                "body > header:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(2) > input:nth-child(1)"
        ));
        autoCareSearch.sendKeys("Toyota");
        Thread.sleep(3000);

        // Click search button (SVG inside a button)
        driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
        Thread.sleep(3000);

        // Step 7: Visit Google UK and click voice search (SVG element)
        driver.get("https://www.google.co.uk/");
        driver.findElement(By.xpath("//div[@aria-label='Search by voice']//*[name()='svg']")).click();
        Thread.sleep(3000);
    }

}
