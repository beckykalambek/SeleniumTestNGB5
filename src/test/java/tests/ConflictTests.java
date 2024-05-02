package tests;

import org.testng.Assert;

public class ConflictTests {

    public void test1 (){
        int a = 5;
        int b = 20;
        System.out.println("sum: " + (a+b));
    }
    public void test2 (){
        String message = "Welcome to USA";
        Assert.assertTrue(message.contains("USA"));
    }
}
