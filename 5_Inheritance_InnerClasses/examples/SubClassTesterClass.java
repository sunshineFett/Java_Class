public class SubClassTesterClass {
    
    /** Creates a new instance of SubClassTesterClass */
    public SubClassTesterClass() {
    }
    
    // This class will contain main to call the other classes
    public static void main(String[] args) {
        // Create an instance of the SubClassOfObject
        SubClassOfObject scoo = new SubClassOfObject();
        
        // call the toString() method of the SubClassOfObject class
        System.out.println(scoo.toString());
        
        // call the toString() method of
        // SubClassOfObject's parent class, Object
        Object o = new Object();
        System.out.println("This is Object's toString() method " + o.toString());
        
        // Create an instance of the SubClassOfSubClass class
        SubClassOfSubClass scosc = new SubClassOfSubClass();
        System.out.println(scosc.toString());
    } // end main method
} // end SubClassTesterClass class
