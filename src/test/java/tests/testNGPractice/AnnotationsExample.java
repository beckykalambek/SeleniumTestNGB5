package tests.testNGPractice;

import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationsExample {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Setting up the suit environment");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Configuring test environment");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Loading class resources");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Initializing test method setup");
    }

    @Test
    public void test1(){
        int a = 5;
        int b = 7;
        int sum = a + b;
        Assert.assertEquals(12,sum);
    }
}
