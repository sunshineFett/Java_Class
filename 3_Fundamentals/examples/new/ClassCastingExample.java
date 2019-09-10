public class ClassCastingExample {
    static int total = 10;
    public static void main(String args []) {
        
        // Instaniate our class
        new ClassCastingExample();

        // o is really a String at runtime
        Object o = new String(); // From specific to general

        String s = (String) o; // explicit cast, this is ok

        // now object is really an Object at runtime
        Object object = new Object();

        //String string = object; // Compiler error, Incompatible Types
        String str =  (String) object; // Runtime exception:
ClassCastException, 
                                      // cannot go from general to specific,
unless you
// originally instantiated the object as a specific
data type
        
    }
}
