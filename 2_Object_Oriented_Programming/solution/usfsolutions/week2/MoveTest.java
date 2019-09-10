package usfsolutions.week2;

/**
 * <p>Title: MoveTest</p>
 * <p>Description: Class creates a Rectange, translates it, and prints it.</p>
 * <p>Copyright: Copyright (c) 2002</p>
 * <p>Company: University of South Florida, Inc.</p>
 * @author Natalie S. Wear
 * @version 1.0
 */
import java.awt.Rectangle;

public class MoveTest {

  // default constructor
  public MoveTest() {
  } // end constructor

  // main method
  public static void main(String[] args) {

    // creat a Rectangle object
    Rectangle cerealBox = new Rectangle(5, 10, 20, 30);

    // move the rectange using the translate method
    cerealBox.translate(15, 25);

    // print the moved rectangle, output shows x moved by 15, y by 25
    System.out.println(cerealBox);

  } // end main method
} // end MoveTest class