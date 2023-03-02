package Class04_CSS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLassCSSselector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        //click on the button create account
        WebElement createNewButn =driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        //click on the button
        createNewButn.click();
        Thread.sleep(3000);
        //fill in the first name
        WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Selab");
    }
}
