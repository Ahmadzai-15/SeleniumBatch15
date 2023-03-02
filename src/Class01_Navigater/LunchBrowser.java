package Class01_Navigater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create instance of webdriver
        WebDriver driver=new ChromeDriver();
        //max windows
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        //Get all the links:
        //we know that all links are in tage <a> which is also called anchor tag
        //lets use the locator by tagName for purpose.

        List<WebElement> tags= driver.findElements(By.tagName("a"));
        //in order to print we need to Iterator

        for(WebElement tag:tags){
            String link=tag.getAttribute("href");
            System.out.println(link);
        }
    }
}