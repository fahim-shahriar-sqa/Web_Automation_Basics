package fahim.shahriar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class  T05_InteractionWithWebElement extends T00_DriverSetup {

    @Test
    public void interactWithElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Practice Page']"));
        System.out.println("Title : " + title.getText());

        //Radio Button
        WebElement radioBtn1 = driver.findElement(By.cssSelector("input[value='radio1']"));
        radioBtn1.click();
        System.out.println(radioBtn1.isSelected());
        Thread.sleep(3000);
        WebElement radioBtn2 = driver.findElement(By.cssSelector("input[value='radio2']"));
        radioBtn2.click();
        System.out.println(radioBtn2.isSelected());
        Thread.sleep(3000);
        WebElement radioBtn3 = driver.findElement(By.cssSelector("input[value='radio3']"));
        radioBtn3.click();
        System.out.println(radioBtn3.isSelected());
        Thread.sleep(3000);

        //
        WebElement textBox = driver.findElement(By.cssSelector("#name"));
        textBox.sendKeys("Arman Nola");
        Thread.sleep(3000);
        textBox.clear();
        Thread.sleep(3000);
        System.out.println("Placeholder : " + textBox.getAttribute("placeholder"));



    }
}
