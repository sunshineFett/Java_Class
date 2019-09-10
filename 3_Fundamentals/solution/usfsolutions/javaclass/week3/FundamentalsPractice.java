/*
 * FundamentalsPractice.java
 *
 * Created on September 14, 2002, 12:45 PM
 *
 * Purpose:  This assignment demonstrates the use of 
 * switch statements as well as method invocation and
 * correct parameter passing.  Likewise, an understanding
 * of the difference between static and instance variables
 * is necessary to complete this exercise.
 */
package usfsolutions.javaclass.week3;
/**
 *
 * @author  Natalie S. Wear
 */

public class FundamentalsPractice {

  public FundamentalsPractice() {
  }
  public static void main(String[] args) {
    // local variable declaration and initialization
    int i = 3;
    // instantiation of our FundamentalsPractice class
    FundamentalsPractice fp = new FundamentalsPractice();
    // use object (instance) of FundamentalsPractice class to 
    // invoke instance method, checkAnimalType.
    // Method signature defines receiving a String as a paramter
    fp.checkAnimalType(s1);
    // use object (instance) of FundamentalsPractice class to
    // invoke the instance method, switchTester.
    // Method signature defines receiving a primitive int as a parameter
    fp.switchTester(i);
  }

  public void checkAnimalType(String inStr) {
      // since String is an object, not a primitive
      // must use .equals() method
      if(inStr.equals("dog"))
      System.out.println("This is a dog");
    else
      return;
  }

  public void switchTester(int choice) {

     // determine user's choice via switch statement
     switch ( choice ) {

       case 1:
              System.out.println("test matches case 1");
              break;  // done processing case

       case 2:
              System.out.println("test matches case 2");
              break;  // done processing case

       case 3:
              System.out.println("test matches case 3");
              break;  // done processing case

       default:
              System.out.println("Invalid Input, please try again.");
    }

  }

  // class (or static) variable declaration and initialization
  private static String s1 = "dog";
  private static String s2 = "cat";
}