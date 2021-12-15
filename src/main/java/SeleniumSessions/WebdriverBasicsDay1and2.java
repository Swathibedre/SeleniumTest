package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebdriverBasicsDay1and2 {
   static WebDriver driver;
    public static void main(String[] args) {

        String browser = "edge";

        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver","C:\\Personal\\Jars\\chromedriver_win32\\chromedriver.exe");//browser started
                 driver = new ChromeDriver();//launch browser
            case "firefox":
                System.setProperty("webdriver.chrome.driver","C:\\Personal\\Jars\\chromedriver_win32\\chromedriver.exe");//browser started
                 driver = new ChromeDriver();//launch browser
            case "edge":
                System.setProperty("webdriver.edge.driver","C:\\Personal\\Jars\\edgedriver_win64\\msedgedriver.exe");//browser started
                 driver = new EdgeDriver();//launch browser
             default:
                 System.out.println("enter proper browser name");
        }

        driver.get("https://youtube.com");

        String title = driver.getTitle();
        System.out.println(title);
        if(title.equalsIgnoreCase("Youtube")) System.out.println("Passed");
        else System.out.println("Failed");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource().contains("id"));


        driver.close();

    }
}
