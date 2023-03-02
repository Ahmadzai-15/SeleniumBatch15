package Class02_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //To maximize
        driver.manage().window().maximize();

        //goto amazon.com
        driver.get("http://www.amazon.com");

        //print all  the link in the amazon.com
        driver.findElements(By.tagName("a"));

        //to be continued in next class.

    }
}
