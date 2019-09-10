import java.io.*;

public class SwitchTest {


   public static void main(String[] args) {
      String input = null;  // user's input

      System.out.println("Enter a number from 1 - 3: ");
      BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
      try {
        input = inputReader.readLine();
      }catch(IOException ioe) {
          ioe.printStackTrace();
      }
      // convert user's input to an int
      choice = Integer.parseInt( input );
      test(choice);
   }


   public static void test( int choice )
   {

          // determine user's choice
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

         }  // end switch structure

   }  // end test method

      private static int choice;

}  // end class SwitchTest

