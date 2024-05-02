package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConflictTests {
    @Test
    public void test1 (){
        int a = 5;
        int b = 20;
        System.out.println("sum: " + (a+b));
    }
    @Test
    public void test2 (){
        String message = "Welcome to USA";
        Assert.assertTrue(message.toLowerCase().contains("usa"));
    }
}
