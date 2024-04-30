package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGIntroTests {
    @BeforeClass
    public void beforeClass (){
        System.out.println("I am before class method");
    }

    @BeforeMethod
    public void before (){
        System.out.println("i am before method");
    }

    @Test
    public void test1(){
        System.out.println("I am test1");
    }

    @Test
    public void test2(){
        System.out.println("test 2");
    }

    @Test
    public void test3(){

    }
    @Test
    public void test4(){

    }
}
