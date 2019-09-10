

/**
 * <p>Title: HashedCodeForStrings</p>
 * <p>Description: Need to find an efficient way to hash Strings and look at them in memory</p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: TSI, Inc.</p>
 * @author Sunny Wear
 * @version 1.0
 */

public class OverriddenMethodInParentConstructor {

  public OverriddenMethodInParentConstructor() {
    System.out.println("PARENT: Inside OverriddenMethodInParentConstructor() Constructor");
    running();
  }

  public void running() {
    System.out.println("PARENT: Inside OverriddenMethodInParentConstructor() running method");
  }
}


class Subclass extends OverriddenMethodInParentConstructor{

  public Subclass() {
   System.out.println("SUBCLASS: Inside Subclass() Constructor");
  }

  // Overridden method gets called, looks exactly like parent method
  public void running() {
    System.out.println("SUBCLASS: Inside Subclass() running method");
  }

  public static void main(String[] args) {
     Subclass sc = new Subclass();

     // should print out the following in this order:
     // 1. Inside OverriddenMethodInParentConstructor() Constructor
     // 2. Inside Subclass() running method
     // 3. Inside Subclass() Constructor
  }
}