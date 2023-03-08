package Class05_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmation {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        // use switch to
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()')]")).click();
        alert.sendKeys("Hello");
        alert.accept();
    }
}
