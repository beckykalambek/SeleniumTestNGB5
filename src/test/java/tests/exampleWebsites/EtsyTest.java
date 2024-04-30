package tests.exampleWebsites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.SeleniumUtils;

public class EtsyTest {
    @Test (groups = {"sanity"})
    public void EtsyTest1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        System.out.println("this is etsyTest");
    }

    @Test(groups = {"login"})
    public void etsyTest2(){
        System.out.println("This is etsyTest2");
        SeleniumUtils.waitForSeconds(5);
    }

    @Test
    public void etsyTest3(){
        System.out.println("this is etsyTest3");
        SeleniumUtils.waitForSeconds(3);
    }
}
