public class MultiDimensionalArrayExample {

  // Default Constructor
  public MultiDimensionalArrayExample() {
  }

  // main method
  public static void main(String[] args) {

        //                                 #rows   #elements/row
        int [][] employeeIDArray = new int[EMPIDS][NYEARS];

        // debug statement
        System.out.println("employeeIDArray[0].length is " + employeeIDArray[0].length);
        // This statement is a value of 10

        for( int j=0; j< employeeIDArray[0].length; j++) {
            employeeIDArray[0][j] = 4;
            System.out.print("employeeIDArray[0]["+j+"] is " + employeeIDArray[0][j]);
        }

        // For loop creates 1 row containing 10 elements
        // Each element in the first row contains the number 4.
  }

  // variable declaration
  final static int EMPIDS = 6;
  final static int NYEARS = 10;
}