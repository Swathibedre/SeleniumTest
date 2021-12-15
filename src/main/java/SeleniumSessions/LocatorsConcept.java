package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsConcept {
    public static void main(String[] args) {

        BrowserUtil br = new BrowserUtil();
        br.launchBrowser("chrome");
        br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
        br.browserMaximize();

//        WebElement firstName =br.driver.findElement(By.id("Form_submitForm_subdomain"));
//        firstName.sendKeys("swathi");

        //use this approach
        By fName= By.id("Form_submitForm_subdomain");
//        WebElement firstName =br.driver.findElement(fName);
//        firstName.sendKeys();

        // using generic method;
        br.getElement(fName).sendKeys();
    }
}