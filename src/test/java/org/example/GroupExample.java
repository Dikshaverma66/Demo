package org.example;

import org.testng.annotations.Test;

@Test(groups = {"all"})
public class GroupExample {


    @Test(groups = {"smoke"})
    public void example1(){
        System.out.println("test1");
    }

    @Test(groups = {"smoke","sanity"})
    public void example2(){
        System.out.println("test2");
    }
    @Test(groups = {"sanity","regression"})
    public void example3(){
        System.out.println("test3");
    }
}
