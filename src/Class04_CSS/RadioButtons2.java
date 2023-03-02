package Class04_CSS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class RadioButtons2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //goto the Syntaxtechs website
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        //find all the age group radio buttons
        //the xpath here is common to all the webElements that have age group
        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        //iterate over the list to see ur desired one
        for (WebElement radioBtn : radioBtns) {
            String age = radioBtn.getAttribute("value");
        //if the value of the WebElment is 5-10 click on it
            if (age.equalsIgnoreCase("0 - 5")) {
                radioBtn.click();
            }

        }
    }
}