package fahim.shahriar;

import org.testng.annotations.Test;

public class LocatorTestExercise extends DriverSetup{

    /*
 Task
1. Open **[https://www.google.com](https://www.google.com)** in Chrome using Selenium.
2. Use **five different locator strategies** to find the Google search input box (like `id`, `name`, `tagName`, etc.),
and type **“Selenium WebDriver”** into it.
3. Click the **Google Search button** using any suitable locator.
4. After the search results load, click the link that leads to **“Selenium” official site** ([https://www.selenium.dev](https://www.selenium.dev)).
5. On the Selenium homepage:
   * Click the **"Downloads"** link using **XPath**.
   * Use **CSS Selector** to click the **"Projects"** link.
6. Scroll down and collect all the **project names** listed under the “Selenium Projects” section using **XPath** or **CSS Selector**, and print them.
7. Navigate back to Google results.
8. From the search result page:
   * Click the **“Images”** tab using **partial link text**.
   * Use **XPath** to get the parent of the “Images” tab.
   * Use **XPath** to find the sibling links of “Images”.
9. Refresh the page and go back to the homepage using **driver.navigate().back()**.

     */

    @Test
    public void LocatorExercise(){
        

    }
}
