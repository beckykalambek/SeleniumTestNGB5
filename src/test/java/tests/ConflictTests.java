package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConflictTests {
    @Test
    public void test1 (){
        int a = 5;
        int b = 20;
        int sum = (a+b) * 2;

        System.out.println("sum: " + sum);
    }
    @Test
    public void test2 (){
        String message = "Welcome to USA - the land of opportunities";
        System.out.println(message);
    }
}
