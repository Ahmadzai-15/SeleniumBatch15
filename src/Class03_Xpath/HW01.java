package Class03_Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HW01 {
    public static void main(String[] args) throws InterruptedException {
        /*enter the message in the text box
        click on show message
        Enter value of A
        Enter value of B
        click on the button get total
        also please print the value of the attribute type of the button GET TOTAL*/

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.manage().window().maximize();
        WebElement message=driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']"));
        message.sendKeys("Class03 Task01");
        WebElement vlaue1=driver.findElement(By.xpath("//input[@id='sum1']"));
        vlaue1.sendKeys("4");
        WebElement value2=driver.findElement(By.xpath("//input[@id='sum2']"));
        value2.sendKeys("4");
        WebElement total=driver.findElement(By.xpath("//button[@onclick='return total()']"));
        total.click();
        Thread.sleep(4000);
        driver.quit();




    }
}
