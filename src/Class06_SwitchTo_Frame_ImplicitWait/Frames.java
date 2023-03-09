package Class06_SwitchTo_Frame_ImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        //Switch to the iframe witch contains the input box.
        // Method: by index
        driver.switchTo().frame(0);
        //this statement will shift the focus to the first frame by name or ID
        WebElement texbox=driver.findElement(By.xpath("//input[@id='name']"));
        texbox.sendKeys("abraham");
        //get the tax (click on from parent window)
        driver.switchTo().defaultContent();
        //find the text
        WebElement text= driver.findElement(By.xpath("//h3"));
        System.out.println("The text is: "+text.getText());

        //Get the text enter name of iframe
        driver.switchTo().frame("iframe_a");
        WebElement getlabel=driver.findElement(By.xpath("//label"));
        System.out.println("the label is: "+getlabel.getText());
        //focus to the main page
        driver.switchTo().defaultContent();
        //3 method switch to an iframe using WebElement
        //clear what ever written in the text box
        WebElement frame1= driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        //we use the previous object to clear the tex in line 18
        texbox.clear();
    }
}
