
import java.text.DecimalFormat;

public class ThisTest {

   // test class SimpleTime
   public static void main( String args[] )
   {

      SimpleTime time = new SimpleTime( 12, 30, 19 );
      System.out.println(time);
      System.out.println(time.buildString());
   }

}  // end class ThisTest

// class SimpleTime demonstrates the "this" reference
class SimpleTime {

private static String name;
private int animal;

   // initialization block
   static { name = "Sunny"; }

   { animal = 10; }

   private int hour, minute, second;

   // Default Constructor
   public SimpleTime() {

      // initialize the instance variables
      hour = 0;
      minute = 0;
      second = 0;
      System.out.println("name is " + this.name);
      System.out.println("animal is " + this.animal);
   }

   // constructor uses parameter names identical to instance
   // variable names, so "this" reference required to distinguish
   // between instance variables and parameters
   public SimpleTime( int hour, int minute, int second )
   {
      // example of constructor-chaining
      this();
      this.hour = hour;      // set "this" object's hour
      this.minute = minute;  // set "this" object's minute
      this.second = second;  // set "this" object's second
   }

   // call toString explicitly via "this" reference, explicitly
   // via implicit "this" reference, implicitly via "this"
   public String buildString()
   {
       return "this.toString(): " + this.toString() +
         "\ntoString(): " + toString() +
         "\nthis (with implicit toString() call): " + this;
   }

   // convert SimpleTime to String format
   public String toString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );

      // "this" not required, because toString does not have
      // local variables with same names as instance variables
      return twoDigits.format( this.hour ) + ":" +
         twoDigits.format( this.minute ) + ":" +
         twoDigits.format( this.second );
   }

   protected void finalize() throws Throwable {
      super.finalize();
   }

   private int number;

}  // end class SimpleTime

