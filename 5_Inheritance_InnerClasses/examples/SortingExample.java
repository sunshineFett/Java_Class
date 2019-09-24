import java.util.*;
import java.io.*;

public class SortingExample {

    /************************
     * Default Constructor
     ***********************/
    public SortingExample() {}


    /*************************
     * Method main()
     * @param String[] args
     * @return void
     *************************/
    public static void main(String[] args) {

        // Instantiate this class
        SortingExample se = new SortingExample();

        // Get the array of Employees
        Student student = new Student();
        Student[] students = student.getAllStudents();

        // Send the array into the sorting routine
        se.sortEmployees("Last Name", students);

    }

    /****************************
     * Method:  sortEmployees()
     * @param   String sortColumn, Employee[] employees
     * @return  boolean
     * @exception
     ****************************/
    public void sortEmployees( String sortColumn, Student[] students ) {

        // Inner class for comparing
        class ColumnComparator implements Comparator {

          // Overloaded constructor
          public ColumnComparator( String sortColumn ) {
              mSortColumn = sortColumn;
          }

          // Method compare() inside the inner class ColumnComparator
          // Because this class implements the Comparator interface, you
          // must implement the compare method and the equals method.
          // NOTE:  any comparator class automatically invokes
          // the compare method when instantiated
          public int compare(Object o1, Object o2) {
            Student s1 = (Student) o1;
            Student s2 = (Student) o2;
            int result = 0;
            if( mSortColumn.equals("First Name") ) {
                result = s1.getFirstName().compareTo( s2.getFirstName());
                System.out.println("1st Object's value " + s1.getFirstName() + " 2nd object's value " + s2.getFirstName());
                System.out.println("result is " + result);
            } else if( mSortColumn.equals("Last Name") ) {
                result = s1.getLastName().compareTo( s2.getLastName());
                System.out.println("1st Object's value " + s1.getLastName() + " 2nd object's value " + s2.getLastName());
                System.out.println("result is " + result);
            } else if( mSortColumn.equals("Class") ) {
                result = s1.getCurrentClass().compareTo( s2.getCurrentClass());
                System.out.println("1st Object's value " + s1.getCurrentClass() + " 2nd object's value " + s2.getCurrentClass());
                System.out.println("result is " + result);
            } else if( mSortColumn.equals("Major") ) {
                result = s1.getMajor().compareTo( s2.getMajor());
                System.out.println("1st Object's value " + s1.getMajor() + " 2nd object's value " + s2.getMajor());
                System.out.println("result is " + result);
            } else if( mSortColumn.equals("Phone") ) {
                result = s1.getPhoneNum().compareTo( s2.getPhoneNum());
                System.out.println("1st Object's value " + s1.getPhoneNum() + " 2nd object's value " + s2.getPhoneNum());
                System.out.println("result is " + result);
            }
            return result;
          } // end compare()

          public boolean equals(Object obj) {
              return true;
          }
          private String mSortColumn;
        }
        // The Arrays class' sort() method has an internal
        // algorithm to sort through the entire array passed
        // into it (i.e., students).
        Arrays.sort( students, new ColumnComparator(sortColumn) );

        for(int i=0; i<students.length; i++) {
            System.out.println("New order is " + students[i].getLastName());
        }
    }
}