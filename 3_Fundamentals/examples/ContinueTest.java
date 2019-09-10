public class ContinueTest {


   public static void main( String args[] )  {
      String output = "";

      // loop 10 times
      for ( int count = 1; count <= 10; count++ ) {

         // if count is 5, continue with next iteration of loop
         if ( count == 5 )
            continue;  // skip remaining code in loop
                       // only if count == 5

         output += count + " ";

      }  // end for structure

    System.out.println(output);
   } // end method main

}  // end class ContinueTest

