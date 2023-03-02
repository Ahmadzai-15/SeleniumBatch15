package Class01_Navigater;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {

        //connect to webdriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // iniitate the instance of WEBDRIVER
        WebDriver driver =new ChromeDriver();

        //goto google.com
        driver.get("https://www.google.com/");

        //Class01.Maximize the windows
        driver.manage().window().maximize();

        //full screen
        driver.manage().window().fullscreen();
    }
}
