package usfsolutions.week1;

/**
 * <p>Title: NameInABox </p>
 * <p>Description: Class displays name with surrounding box.</p>
 * <p>Copyright: Copyright (c) 2002</p>
 * <p>Company: </p>
 * @author Natalie S. Wear
 * @version 1.0
 */

public class NameInABox {

  // default constructor
  public NameInABox() {
  }

  // main method
  public static void main(String[] args) {
    System.out.println("+---------+");
    System.out.println("| Natalie |");
    System.out.println("+---------+");

    // or, you could write it this way
    StringBuffer buffer = new StringBuffer();
    buffer.append("+---------+");
    buffer.append("\n");
    buffer.append("| Natalie |");
    buffer.append("\n");
    buffer.append("+---------+");
    System.out.println(buffer.toString());

  } // end main method
} // end NameInABox class