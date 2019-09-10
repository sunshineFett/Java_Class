

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: University of South Florida</p>
 * @author Natalie S. Wear
 * @version 1.0
 */

public class Student {

  // default constructor
  public Student() {
  } // end default constructor

  // instance methods

  String getStudentName() {
    return studentName;
  } // end getStudentName

  int getTotalStudentCount() {
    return studentCount;
  } // end getTotalStudentCount

  void setStudentID(long ssn,String fname) {
    this.socialSecurityNumber = ssn;
    this.studentName = fname;
  } // end setStudentID


  // instance variable declaration
  long socialSecurityNumber;
  String studentName;
  String studentDOB;
  int studentCount;

}// end class Student
