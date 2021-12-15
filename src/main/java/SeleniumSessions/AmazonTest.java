package SeleniumSessions;

public class AmazonTest {

    public static void main(String[] args) {
        BrowserUtil br = new BrowserUtil();
        br.launchBrowser("chrome");
        br.launchUrl("https://www.amazon.in");
        br.browserMaximize();
        System.out.println(br.getAppTitle());
        System.out.println(br.getCurrentPageSource().contains("id"));
        System.out.println(br.getOpenUrl());
        br.quitBrowser();
    }
}
