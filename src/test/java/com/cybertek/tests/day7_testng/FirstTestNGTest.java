package com.cybertek.tests.day7_testng;

import org.testng.annotations.Test;

public class FirstTestNGTest {
    @Test
    public void test1() {       //it is not a regular java method, it is TestNg test method. it replace with main method
        System.out.println("My First Test Case");
    }
    @Test
    public void test2() {
        System.out.println("My Second Test Case");



    }


}