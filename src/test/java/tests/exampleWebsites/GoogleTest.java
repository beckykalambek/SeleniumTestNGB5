package tests.exampleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.SeleniumUtils;

public class GoogleTest {
    @Test
    public void googleTest1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("this is googleTest");
    }

    @Test(groups = {"login"})
    public void googleTest2(){
        System.out.println("This is googleTest2");
        SeleniumUtils.waitForSeconds(5);
    }

    @Test (groups = {"sanity"})
    public void googleTest3(){
        System.out.println("this is googleTest3");
        SeleniumUtils.waitForSeconds(3);
    }
}
