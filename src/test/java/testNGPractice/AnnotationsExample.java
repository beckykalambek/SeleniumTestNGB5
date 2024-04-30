package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationsExample {
    @BeforeSuite
    public void beforeSuit() {
        System.out.println("Setting up the suite environment.");
    }
    @BeforeTest
    public void beforeTest (){
        System.out.println("Configuring test environment.");
    }

    @BeforeClass
    public void beforeClass (){
        System.out.println("Loading class resources.");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println(" Initializing test method setup.");
    }

    @Test
    public void test1(){
        System.out.println("Test 1: Performing assertion or printing message.");
        int expected = 5;
        int actual = 2 + 3;
        Assert.assertEquals(actual, expected, "Sum of two integers is incorrect");
    }

    @Test
    public void test2 (){
        System.out.println("This is TEST 2");
    }
    @Test
    public void test3 (){
        System.out.println("This is TEST ");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Cleaning up after test method.");
    }

    @AfterClass
    public void afterClass (){
        System.out.println("Releasing class resources.");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Tearing down test environment.");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("Cleaning up the suite environment.");
    }

}
//<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
//<suite name="MySuite">
//    <test name="MyTest">
//        <classes>
//            <class name="testNGPractice.AnnotationsExample"/>
//        </classes>
//    </test>
//</suite>