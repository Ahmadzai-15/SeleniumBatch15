package Class02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationElements {

    public static <WebdDriver> void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance of webdriver
        WebDriver driver=new ChromeDriver();

        //open up a fb.com
        driver.get("https://www.facebook.com/");

        //send in the user name
        driver.findElement(By.id("email")).sendKeys("Selab");

        //send the password
        driver.findElement(By.name("pass")).sendKeys("Password check");

        //click on the button create new account
        driver.findElement(By.linkText("Create new account")).click();
        //click on the Forget Password
        driver.findElement(By.partialLinkText("password?")).click();
        //close the browser
        driver.quit();


    }
}
