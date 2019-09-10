public class StringBufferExample {

  public StringBufferExample() {
  }

  public static void main (String[] args) {

      StringBuffer sb = new StringBuffer("this is a test");
      sb.append(" of how string buffer works");
      sb.append(" works with contatenating");
      sb.append(" multiple strings together");
      // convert back to a string to print out
      System.out.println(sb.toString());
  }
}