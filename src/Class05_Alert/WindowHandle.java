package Class05_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S638481990%3A1678243025491152&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AWnogHdl_-NzNr8Quc__iROVxlonN7PGF52m4RT2pLFP0fkafBTIQQphxeFmA8YZLpglYJasgE9dWg&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        //get the parent window handle of the parent window.
        String parentWindow=driver.getWindowHandle();
        System.out.println(parentWindow);
        Set<String> windowHandle=driver.getWindowHandles();
        for (String st:windowHandle){
            System.out.println(st);
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy –Terms")){
                break;
            }
        }
        //To verify we switched to the right windows
        System.out.println(driver.getTitle());







    }


}
