package TheSecondProject;

public class WebDriverTester {
    public static void main(String[] args) {
        ChromeDriver chrome=new ChromeDriver();
        System.out.println(chrome.getTitle());
        chrome.navigate();
        chrome.open();
        chrome.close();
        System.out.println();

        FireFoxDriver firefox=new FireFoxDriver();
        System.out.println(firefox.getTitle());
        firefox.open();
        firefox.close();
        firefox.navigate();
        System.out.println();

        SafariDriver safari=new SafariDriver();
        System.out.println(safari.getTitle());
        safari.open();
        safari.close();
        safari.navigate();
    }
}
