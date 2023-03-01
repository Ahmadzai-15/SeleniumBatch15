package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Amazon {
    public static void main(String[] args) throws InterruptedException {
        /*
         * 1. launch the browser
         * 2. navigate to amazon web site
         * 3. print out the title and the url in the console
         * 4. close the browser*/
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        System.out.println("WebDriver Title is:  " + driver.getCurrentUrl());
        driver.quit();
    }
}