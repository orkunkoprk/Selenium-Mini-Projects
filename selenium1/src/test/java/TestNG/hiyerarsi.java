package TestNG;

import org.testng.annotations.*;

public class hiyerarsi {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Suite");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }
    @Test
    public void Test1(){
        System.out.println("Test1");
    }
    @Test
    public void Test2(){
        System.out.println("Test2");
    }
    @Test
    public void Test3(){
        System.out.println("Test3");
    }
    @Test
    public void Test4(){
        System.out.println("Test4");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("AfterTest");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite");
    }



}
