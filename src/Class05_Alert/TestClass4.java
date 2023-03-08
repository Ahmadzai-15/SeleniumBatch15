package Class05_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestClass4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement checkBox=driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean check=checkBox.isSelected();
        System.out.println("Is check box is selected? "+check);
        if(!check){
            checkBox.click();
        }check=checkBox.isSelected();
        System.out.println("The box is selected "+check);


    }
}
