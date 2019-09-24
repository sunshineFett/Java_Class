
public class MethodOverload {

   // first definition of method square with double argument
   public int square( double x )
   {
      return (int)(x * x);
   }

   // second definition of method square with double argument
   // causes syntax error
   public double square( int y )
   {
      return y * y;
   }

}  // end class MethodOverload

class MethodOverride extends MethodOverload {
    public int square( double x ) {
        return (int) (x * x);
    }
}