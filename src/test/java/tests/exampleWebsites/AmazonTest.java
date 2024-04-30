package tests.exampleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.SeleniumUtils;

public class AmazonTest {
    @Test (groups = {"sanity"})
    public void amazonTest1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println("this is amazonTest");
    }

    @Test(groups = {"login"})
    public void amazonTest2(){
        System.out.println("This is amazonTest2");
        SeleniumUtils.waitForSeconds(5);
    }

    @Test
    public void amazonTest3() {
        System.out.println("this is amazonTest3");
        SeleniumUtils.waitForSeconds(3);
    }
}
