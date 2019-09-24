public class SubClassOfObject extends Object {
    
    /** Creates a new instance of SubClassOfObject */
    public SubClassOfObject() {
    }
    
    // Override the toString() method of the Object class
    public String toString() {
        return "I am overriding the toString() method in my class called " +
        this.getClass().getName();
    } // end toString method
} // end SubClassOfObject class
