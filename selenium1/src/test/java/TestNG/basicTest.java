package TestNG;

import org.testng.annotations.Test;

public class basicTest {
    @Test(groups = "group1")
    public void Test1(){
        System.out.println("Test1");
        System.out.println("-------------------------");
    }
    @Test(groups = "group1")
    public void Test2(){
        System.out.println("Test2");
        System.out.println("-------------------------");
    }
    @Test
    public void Test3(){
        System.out.println("Test3");
        System.out.println("-------------------------");
    }
    @Test
    public void Test4(){
        System.out.println("Test4");
        System.out.println("-------------------------");
    }
    @Test
    public void Test5(){
        System.out.println("Test5");
        System.out.println("-------------------------");
    }
    @Test
    public void Test6(){
        System.out.println("Test6");
        System.out.println("-------------------------");
    }
}
