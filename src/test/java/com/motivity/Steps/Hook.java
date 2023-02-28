package com.motivity.Steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hook {
    @BeforeAll
    public static void startSession(){
        System.out.println("Intialize Report");
    }

//    @AfterAll
//    public static void endSession(){
//        System.out.println("KIll Session");
//    }

    @Before
    public void beforeStep(){
        System.out.println("Before Step");
    }

//    @After
//    public void afterStep(){
//        System.out.println("After Step");
//    }
}
