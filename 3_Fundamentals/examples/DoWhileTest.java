public class DoWhileTest {

   // draw lines on applet’s background
   public static void main(String[] args) {
      int counter = 1;

      do {
         System.out.println("counter is incremented to " + counter++);
      } while ( counter <= 10 );  // end do/while structure

   }  // end method paint

}  // end class DoWhileTest
