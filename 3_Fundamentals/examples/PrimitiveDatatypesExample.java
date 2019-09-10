public class PrimitiveDatatypesExample {

  public PrimitiveDatatypesExample() {
  }
  public static void main(String[] args) {
    // 4 bytes
    int inum = 213456674;
    // 2 bytes
    short snum = 32767;
    // 8 bytes
    long lnum = 2000000000000000L;// without the "l", this number
                                 // defaults to an int and the
                                 // compiler will tell you that
    // 1 byte                             // it's too big for an integer.
    byte bnum = 127;
    // 4 bytes
    float fnum = 3.44f; // without the "f", this number defaults to
                        // a double, which means the compiler thinks
                        // you are converting it down to a float...
                        // thus, you will lose data. (Explicit cast required.)
    // 8 bytes                    
    double dnum = 23.232;
    // 2 bytes
    char c = 'a';

    boolean b = true;
  }
}