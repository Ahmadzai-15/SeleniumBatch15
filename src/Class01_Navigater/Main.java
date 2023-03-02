package Class01_Navigater;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http:www.google.com");

        String path= "https://www.google.com/";
        driver.get(path);
        String URl=driver.getCurrentUrl();
        String title=driver.getTitle();

        System.out.println(path);
        System.out.println(URl);

        if(path.equalsIgnoreCase(URl)){
            System.out.println("match");
        }else{
            System.out.println("not match");
        }
        if(title.equalsIgnoreCase("Google")){
            System.out.println("Match");
        }
        else{
            System.out.println("not match");
        }

        driver.quit();
    }
}
