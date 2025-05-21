package fahim.shahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LocatorTest extends DriverSetup{

    @Test
    public void locatorTest() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

         /*

        WebElement searchArea = driver.findElement(By.id("APjFqb"));
        WebElement searchArea = driver.findElement(By.name("q"));
        WebElement searchArea = driver.findElement(By.tagName("textarea"));
        WebElement searchArea = driver.findElement(By.className("gLFyf"));
        WebElement searchArea = driver.findElement(By.className("q"));

        searchArea.sendKeys("Bangladesh");
        Thread.sleep(3000);

        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.findElement(By.partialLinkText("How Search")).click();
        Thread.sleep(3000);

        List<WebElement> children = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
        for (WebElement child : children){
            System.out.println("Footers : " + child.getText());
        }
        */

        // cssSelector
        driver.findElement(By.cssSelector("a[class='pHiOh']")).click();
        // cssSelector child
        driver.findElement(By.cssSelector("a[class='pHiOh']>a"));
        // cssSelector child
        driver.findElement(By.cssSelector("div[class='KxwPGc AghGtd']>a:first-child"));
        driver.findElement(By.cssSelector("div[class='KxwPGc AghGtd']>a:nth-child(2)"));
        driver.findElement(By.cssSelector("div[class='KxwPGc AghGtd']>a:last-child"));
        Thread.sleep(3000);
        driver.navigate().back();

        // xpath
        driver.findElement(By.xpath("//a[@class='pHiOh']")).click();
        // xpath multiple attribute
        driver.findElement(By.xpath("//textarea[@class=\"gLFyf\" and @name=\"q\"]")).click();
        driver.findElement(By.cssSelector("textarea[class=\"gLFyf\"][name=\"q\"]")).click();
        // xpath by visible Text
        driver.findElement(By.xpath("//a[text()='Business']")).click();
        // xpath by visible Partial Text
        driver.findElement(By.xpath("//a[contains(text(), 'Business')]")).click();
        // xpath child
        driver.findElement(By.xpath("//a[@class='pHiOh']/a"));
        // xpath child
        driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']/a[first()]"));
        driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']/a[2]"));
        driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']/a[last()]"));
        // xpath child to parent
        driver.findElement(By.xpath("//a[text()='Business']")).click();
        // xpath child to next sibling
        driver.findElement(By.xpath("//a[text()=\"Business\"]/following-sibling::a")).click();
        // xpath child to previous sibling
        driver.findElement(By.xpath("//a[text()=\"Business\"]/preceding-sibling::a")).click();





        driver.findElement(By.cssSelector("a[class='pHiOh']")).click();
        Thread.sleep(3000);
        driver.navigate().back();

    }
}
