package TestNG.BasicProject;

import org.testng.annotations.*;

public class priority {
            @BeforeSuite
            public void BeforeSuite() throws InterruptedException {
                System.out.println("Suite");
                Thread.sleep(500);

            }
            @BeforeTest
            public void BeforeTest(){
                System.out.println("BeforeTest");
            }
            @BeforeClass
            public void BeforeClass(){
                System.out.println("BeforeClass");
            }
            @Test(priority = 4)
            public void Test1(){
                System.out.println("Test1");
            }
            @Test(priority = 3)
            public void Test2(){
                System.out.println("Test2");
            }
            @Test(enabled = false)
            public void Test3(){
                System.out.println("Test3");
            }
            @Test(priority = 5)
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

