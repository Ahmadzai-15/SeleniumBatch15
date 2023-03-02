package Class03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create instance of webdriver
        WebDriver driver=new ChromeDriver();
        //max windows
        driver.manage().window().maximize();

        //find the username
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        username.sendKeys("Tester");

        //find the password field
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");

        //clear the username test box using method clear(). NOTE:
        username.clear();

        //Find the webElement beside username
        WebElement usernameText=driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());

        //to get password which is beside the password text box
        WebElement passwordText=driver.findElement(By.xpath("//label[text()='Password:']"));
        String password=passwordText.getText();
        System.out.println(password);
    }
}
