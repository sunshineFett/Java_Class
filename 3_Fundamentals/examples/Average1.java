import java.io.*;

public class Average1 {

   // main method begins execution of Java application
   public static void main( String args[] ) {
      int total= 0,          // sum of grades input by user
          gradeCounter = 0,   // number of grades entered
          gradeValue = 0,     // grade value
          average = 0;        // average of all grades
      String grade = null;       // grade typed by user

      // Initialization Phase
      total = 0;          // clear total
      gradeCounter = 1;   // prepare to loop

      // Processing Phase
      while ( gradeCounter <= 3 ) {  // loop 10 times

         // prompt for input and read grade from user
         System.out.println("Enter exam grade: " );
         BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
         try {
            grade = input.readLine();
         } catch(IOException ioe) {
            ioe.printStackTrace();
         }

         // convert grade from a String to an integer
         gradeValue = Integer.parseInt( grade );

         // add gradeValue to total
         total = total + gradeValue;

         // add 1 to gradeCounter
         gradeCounter = gradeCounter + 1;

      }  // end while structure

      // Termination Phase
      average = total / 3;  // perform integer division

      System.out.println("The modulus (average%2) is " + average%2);

      // display average of exam grades
      System.out.println("Class average is " + average);

   }  // end method main

}  // end class Average1

