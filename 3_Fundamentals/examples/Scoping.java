
public class Scoping  {

   // Default constructor
   public Scoping() {}

   // main() method
   public static void main(String[] args) {

      // Create an instance of our class
      Scoping scope = new Scoping();
      int x = 5;   // variable local to method start
      System.out.println("variable x, local to main method has value of "+x);
      scope.useLocal();      // useLocal has local x
      scope.useInstance();   // useInstance uses instance variable x
      scope.useLocal();      // useLocal reinitializes local x
      scope.useInstance();   // instance variable x retains its value

   }  // end method main

   // useLocal reinitializes local variable x during each call
   public void useLocal() {
      int x = 25;  // initialized each time useLocal is called
      System.out.println("variable x, local to useLocal method has value of "+x);
   }  // end method useLocal

   // useInstance modifies instance variable x during each call
   public void useInstance() {
      x *= 10;
      System.out.println("variable x, local to useInstance method has value of "+x);
   }  // end method useInstance

   // instance variable accessible to all methods of this class
   int x = 1;

}  // end class Scoping
