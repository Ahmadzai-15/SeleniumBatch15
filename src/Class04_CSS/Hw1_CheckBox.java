package Class04_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1_CheckBox {
    public static void main(String[] args) {
        //goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        //check if the checkbox"click on this check box" is Selected
        //if no  Select the checkbox
        //check again if the checkbox is Selected or not

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement maleBtn=driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean isBtn=maleBtn.isSelected();
        System.out.println("Is Male Button selected? "+isBtn);
        if(!isBtn){
            maleBtn.click();
        }
        isBtn=maleBtn.isSelected();
        System.out.println("The button is already selected: "+isBtn);
        }
    }

