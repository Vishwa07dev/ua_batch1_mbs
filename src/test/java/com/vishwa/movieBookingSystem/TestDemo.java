package com.vishwa.movieBookingSystem;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * This class will be used to demo the Unit Testing
 * JUnit Framework functionality
 *
 * @Test
 * @BeforeEach
 * @AfterEach
 * @BeforeAll
 * @AfterAll
 *
 */
public class TestDemo {



  /**
   * Whenever we use @Test with any method, it becomes executable and test method
   */
  @Test
  public void myFirstTest(){
    System.out.println("Inside the first test");
  }

  @Test
  public void mySecondTest(){
    System.out.println("Inside the second test");
  }


  /**
   * Before running any test, we do some preparation
   *
   */
  @BeforeEach
  public void beforeEachTestMethod(){
    System.out.println("Before each test");
  }

  /**
   * I want to execute something after every test is executed
   */
  @AfterEach
  public void afterEachTestMethod(){
    System.out.println("After each test");
  }

  /**
   * I want to execute something only once, in the beginning
   */
  @BeforeAll
  public static void veryBeginning(){
    System.out.println("In the very beginning");
  }

  @AfterAll
  public static void lastMethod(){
    System.out.println("In the very end");
  }






}
