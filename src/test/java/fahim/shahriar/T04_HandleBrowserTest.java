package fahim.shahriar;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class T04_HandleBrowserTest extends T00_DriverSetup {

    @Test
    public void testBrowserTask() throws InterruptedException {
        driver.get("https://www.google.com/");

        String url = driver.getCurrentUrl();
        System.out.println("URL : " + url);

        String title = driver.getTitle();
        System.out.println("Title : " + title);
        Thread.sleep(3000);


        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);



        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);



        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.x.com/");
        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.instagram.com/");
        Thread.sleep(3000);

        String instaHandle = driver.getWindowHandle();
        System.out.println("Insta Handle : " + instaHandle);

        ArrayList<String> handles = new ArrayList<String>(driver.getWindowHandles());

        for(String handle: handles){
            System.out.println("Handles: " + handles);
        }
    }
}
