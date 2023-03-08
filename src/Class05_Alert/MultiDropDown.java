package Class05_Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement DD=driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel=new Select(DD);
        //Select by values
        sel.selectByValue("New Jersey");
        //select by text
        sel.selectByVisibleText("Ohio");

        Thread.sleep(2000);
        sel.deselectByValue("New Jersey");
        Thread.sleep(2000);
        sel.deselectByVisibleText("Ohio");
        System.out.println("The dropdown is multiple: "+sel.isMultiple());

        driver.quit();



    }
}
