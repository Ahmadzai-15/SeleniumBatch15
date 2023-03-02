package Class04_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hw2_CheckBox2 {
    public static void main(String[] args) {

        //goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        //1. u need to write down the code that can select  1 check box out of 4 mentioned,
        //e.g option1 , option2 , option 3, option 4

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        List<WebElement> checkBox=driver.findElements(By.cssSelector("input[class='cb1-element']"));
        for(WebElement option:checkBox){
            String check1=option.getAttribute("value");
            if(check1.equalsIgnoreCase("Option-4")){
                option.click();
            }
        }
    }
}
