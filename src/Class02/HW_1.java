package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_1 {
    public static void main(String[] args) throws InterruptedException {

        /*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser*/

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Selab");
        driver.findElement(By.id("customer.lastName")).sendKeys("Ahmadzai");
        driver.findElement(By.name("customer.address.street")).sendKeys(" 12255 newtown");
        driver.findElement(By.name("customer.address.street")).sendKeys("New st Virginia");
        driver.findElement(By.name("customer.address.city")).sendKeys("Arlington");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22191");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("2233345566");
        driver.findElement(By.name("customer.ssn")).sendKeys("333333333");
        driver.findElement(By.id("customer.username")).sendKeys("paktia@gmail.com");
        driver.findElement(By.id("customer.password")).sendKeys("4466Test");
        driver.findElement(By.id("repeatedPassword")).sendKeys("4466Test");
        driver.findElement(By.className("button")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}