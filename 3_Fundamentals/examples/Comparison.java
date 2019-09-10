import java.io.*;

public class Comparison {

   // main method begins execution of Java application
   public static void main( String args[] ) {
      String firstNumber = null;   // first string entered by user
      String secondNumber = null;  // second string entered by user
      String result = null;        // a string containing the output
      int number1 = 0;          // first number to compare
      int number2 = 0;          // second number to compare


      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      try {
          System.out.println("Please enter your first number: ");
          // read first number from user as a String
          firstNumber = input.readLine();

          System.out.println("Please enter your second number: ");
          // read second number from user as a String
          secondNumber = input.readLine();
      } catch (IOException ioe) {
          ioe.printStackTrace();
      }

      // convert numbers from type String to type int
      number1 = Integer.parseInt( firstNumber );
      number2 = Integer.parseInt( secondNumber );

      // initialize result to empty String
      result = "";

      if ( number1 == number2 )
         result = number1 + " == " + number2;

      if ( number1 != number2 )
         result = number1 + " != " + number2;

      if ( number1 < number2 )
         result = result + "\n" + number1 + " < " + number2;

      if ( number1 > number2 )
         result = result + "\n" + number1 + " > " + number2;

      if ( number1 <= number2 )
         result = result + "\n" + number1 + " <= " + number2;

      if ( number1 >= number2 )
         result = result + "\n" + number1 + " >= " + number2;

      System.out.println("Result is " + result);

   }  // end method main

}  // end class Comparison
