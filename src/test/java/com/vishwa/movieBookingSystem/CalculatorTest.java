package com.vishwa.movieBookingSystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Name of test class : <ClassName>Test
 */
public class CalculatorTest {

  /**
   * Test Add
   *
   * test<MethodName>
   */

   @Test
   public void testAdd(){

     //Expected result :  2,3 -> 5
     int expectedResult = 5 ;

     //Actual result
     int actualResult = new Calculator().add(2,3);

     /**
      * If Actual is matching with expected
      *
      * yes -> Pass
      * no -> Fail
      */
     Assertions.assertEquals(actualResult,expectedResult);

   }


  /**
   * Test Sub
   */

  @Test
  public void testSub(){
      // Expected  value  7 - 3 =  4
    int expectedValue =4 ;

    int actualValue = new Calculator().sub(7,3);

    Assertions.assertEquals(expectedValue,actualValue);
  }

  /**
   * Test Mul
   */

  /**
   * Test Div
   */
}
