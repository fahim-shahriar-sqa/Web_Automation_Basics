package fahim.shahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class Exercise1Test extends DriverSetup{

    /*
     1: Open the browser and navigate to https://example.com
     2: Maximize the browser window
     3: Print the current URL and page title
     4: Open a new tab and go to https://www.wikipedia.org
     5: Switch between tabs
     6: In Wikipedia, locate the search input by its name and type "Selenium (software)"
     7: Submit the search form
     8: Refresh the page
     9: Close the current tab
     10: Go back to the original tab and close it using quit()
     */

    @Test
    public void task() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println("Url : " + url );
        System.out.println("Title : " + title );
        String googleHandle = driver.getWindowHandle();
        Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(3000);
        driver.get("https://www.wikipedia.org");
        Thread.sleep(3000);

        WebElement searchText = driver.findElement(By.id("searchInput"));
        Thread.sleep(1000);
        searchText.sendKeys("Selenium (software)");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".pure-button.pure-button-primary-progressive")).click();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.switchTo().window(googleHandle);
        System.out.println("Switched back to original tab: Google");
        Thread.sleep(3000);
    }
}
