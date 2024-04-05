package shit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    @org.testng.annotations.Test
    public void Test() {
        // Set the path to your chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marbe\\Desktop\\mari\\PROJECTS\\chromedriver-win64\\chromedriver.exe");

        // Initialize Chrome driver
        WebDriver driver = new ChromeDriver();

        // Maximize the Chrome window
        driver.manage().window().maximize();

        // Open Google
        driver.get("https://www.google.com");

        // Close the browser
        driver.quit();
    }
}
