package Class05_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement dropdown=driver.findElement(By.xpath("//select[@id='select-demo']"));
        //Use select class because this drop down has a select tag
        Select sel=new Select(dropdown);

        //Using select class we have different methods to select the desired option
        sel.selectByIndex(2);
        Thread.sleep(2000);

        sel.selectByValue("Tuesday");
        Thread.sleep(2000);

        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);



    }
}
