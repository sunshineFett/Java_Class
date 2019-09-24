public class SubClassOfSubClass extends SubClassOfObject {
    
    /** Creates a new instance of SubClassOfSubClass */
    public SubClassOfSubClass() {
    }
    
    // Override the toString() method of the 
    // Object class and of the parent class
    public String toString() {
        return "I am overriding the toString() method in my class called " +
        this.getClass().getName();
    } // end toString method
    
} // end SubClassOfSubClass class