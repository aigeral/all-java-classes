package TheSecondProject;

public interface WebDriver {
    //Provide Implementation for the diagram below.
    // Then create a test class in which you need to create Objects of ChromeDriver,
    // FirefoxDrive and SafariDriver classes and see which methods available to them.
    void open();

    void close();

    String getTitle();
}
    interface RemoteWebDriver extends WebDriver{
        void navigate();
    }
    interface TakesScreenShot extends RemoteWebDriver{
        void getScreenShot();
    }
    class ChromeDriver implements RemoteWebDriver, WebDriver{

        @Override
        public void navigate() {
            System.out.println("Download Chrome Driver");
        }

        @Override
        public void open() {
            System.out.println("Opening Chrome Driver");

        }

        @Override
        public void close() {
            System.out.println("Closing Chrome Driver");

        }

        @Override
        public String getTitle() {
         return "Chrome Driver";
        }
    }

    class FireFoxDriver implements RemoteWebDriver,WebDriver{

        @Override
        public void open() {
            System.out.println("Opening FireFox");
        }

        @Override
        public void close() {
            System.out.println("Closing FireFox Driver");

        }

        @Override
        public String getTitle() {
            return "Firefox Driver";
        }

        @Override
        public void navigate() {
            System.out.println("Download FireFox Driver");

        }
    }
    class SafariDriver implements RemoteWebDriver,WebDriver{

        @Override
        public void open() {
            System.out.println("Opening Safari Driver");

        }

        @Override
        public void close() {
            System.out.println("Closing Safari Driver");

        }

        @Override
        public String getTitle() {
            return "Safari Driver";
        }

        @Override
        public void navigate() {
            System.out.println("Download Safari Driver");

        }
    }





