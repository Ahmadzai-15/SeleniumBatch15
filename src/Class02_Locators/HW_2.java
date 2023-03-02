package Class02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_2 {
    public static void main(String[] args) throws InterruptedException {

        /*HW2
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser
        TIP for HW2:
        just fill in text boxes or button, no need to deal with other webElements*/

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Selab");
        driver.findElement(By.name("lastname")).sendKeys("Ahamdzai");
        driver.findElement(By.name("reg_email__")).sendKeys("selab@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("selab@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Selab123");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
