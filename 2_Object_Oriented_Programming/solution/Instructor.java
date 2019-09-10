

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: University of South Florida</p>
 * @author Natalie S. Wear
 * @version 1.0
 */

public class Instructor {

  // default constructor
  public Instructor() {
  } // end default constructor

  // instance methods

  String getInstructorName() {
    return instructorName;
  } // end getStudentName

  int getInstructorClassId() {
    return instructorClassId;
  } // end getTotalStudentCount

  void setInstructorId(int ssn) {
    this.socialSecurityNumber = ssn;
  } // end setStudentID


  // instance variable declaration
  long socialSecurityNumber;
  String instructorName;
  int instructorClassId;

} // end class Instructor