package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {

        //connect to webdriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        // iniitate the instance of WEBDRIVER
        WebDriver driver =new ChromeDriver();

        // navigate to google
        driver.get("https://www.google.com/");

        //slow down or show for a few seconds
        Thread.sleep(2000);

        //now navigate to facebook
        driver.navigate().to("https://www.facebook.com/");

        //slow down
        Thread.sleep(2000);

        //go back
        driver.navigate().back();
        //slow down
        Thread.sleep(2000);

        //go to facebook
        driver.navigate().forward();
        //slow down
        Thread.sleep(2000);

        //slow down
        Thread.sleep(2000);
        driver.navigate().refresh();

        //driver.quit();

        driver.close();
    }
}
