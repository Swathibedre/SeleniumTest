package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitvsClose {

    public static void main(String[] args) {
        BrowserUtil br = new BrowserUtil();
        br.launchBrowser("chrome");
        br.launchUrl("https://www.amazon.in");
        br.browserMaximize();
        System.out.println(br.getAppTitle());
        br.quitBrowser();
        //br.closeBrowser();
        br = new BrowserUtil();
        br.launchBrowser("chrome");
        System.out.println(br.getAppTitle());
    }
}
