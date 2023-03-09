package Class06_SwitchTo_Frame_ImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW02 {
    public static void main(String[] args) {

        /*1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
        2.Switch to the iframe on the page
        3.Clear the existing text in the  editor inside the iframe
        4.Enter the text "Hello World!" in the editor inside the iframe
        5.Switch back to the main page*/

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);
        WebElement text=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        text.clear();
        text.sendKeys("Hello World !");
        driver.switchTo().defaultContent();

    }
}
