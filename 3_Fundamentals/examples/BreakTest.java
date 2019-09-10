public class BreakTest {

   // main method begins execution of Java application
   public static void main( String args[] ) {
      String output = "count is now ";
      int count;

      // loop 10 times
      for ( count = 1; count <= 10; count++ ) {

         // if count is 5, terminate loop
         if ( count == 5 )
            break;  // break loop only if count == 5

         output += count + " ";

      }  // end for structure

      output += "\nBroke out of loop at count = " + count;
      System.out.println(output);

   }  // end method main

}  // end class BreakTest
