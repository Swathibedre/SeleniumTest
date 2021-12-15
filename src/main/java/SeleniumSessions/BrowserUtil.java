package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserUtil {
    public WebDriver driver;

    public WebDriver launchBrowser(String browserName) {
        switch (browserName) {
            case "chrome":
                //System.setProperty("webdriver.chrome.driver", "C:\\Personal\\Jars\\chromedriver_win32\\chromedriver.exe");//browser started

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();//launch browser
                break;

            case "edge":
                System.setProperty("webdriver.edge.driver", "C:\\Personal\\Jars\\edgedriver_win64\\msedgedriver.exe");//browser started
                driver = new EdgeDriver();//launch browser
                break;
            default:
                System.out.println("enter proper browser name");

        }
        return  driver;
    }

    public void launchUrl(String url){
        if (url.isBlank() || url.isEmpty() || url == null){
            return ;
        }
        else
            driver.get(url);
    }

    public  String getOpenUrl(){
        return  driver.getCurrentUrl();
    }

    public  String getCurrentPageSource(){
        return  driver.getPageSource();
    }

    public  String getAppTitle(){
        return  driver.getTitle();
    }

    public void browserMaximize(){
        driver.manage().window().maximize();
    }

    public  void quitBrowser(){
       driver.quit();
    }

    public  void closeBrowser(){
        driver.close();
    }

    public WebElement getElement(By locator){
       return driver.findElement(locator);
    }

}
