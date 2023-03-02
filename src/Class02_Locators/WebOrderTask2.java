package Class02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
// **
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
// **
        String title = driver.getTitle();
        if (title.equalsIgnoreCase("Web Orders")) {
            System.out.println("Title is correct!");
        } else {
            System.out.println("Title is incorrect!");
        }
// **
        Thread.sleep(5000);
        driver.findElement(By.linkText("Logout")).click();

        driver.quit();
    }
}