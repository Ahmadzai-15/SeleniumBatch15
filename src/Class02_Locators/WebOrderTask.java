package Class02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance of webdriver
        WebDriver driver=new ChromeDriver();
        //open up a fb.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Selab");
        driver.findElement(By.name("ct100$MainContent$password")).sendKeys("test");

        //driver.findElement(By.name());
        driver.findElement(By.className("button")).click();

    }
}
