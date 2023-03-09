package Class05_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestCheckBox {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        List<WebElement> checkBox=driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for (WebElement box : checkBox) {
            String value = box.getAttribute("value");
            if (value.equalsIgnoreCase("Option-2")) {
                box.click();
            }
        }
    }
}
