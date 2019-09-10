
// "is-a" relationship means one class extends from another class
public class ClassRelationships extends Object {

  public ClassRelationships() {
  }

  public static void main(String[] args) {
      tb = new TextBook();  // instantiation of the TextBook class
      tb.setTitle("Hamlet"); //"uses-a" relationship means one class sends
                             // messages to another class
  }

  // parts cannot exists w/o the whole
  private int _mInt; // instance variable
  private String _mStr; // instance variable

  private static TextBook tb; // "has-a" relationship means one class
                              // has objects of another class inside it.
}