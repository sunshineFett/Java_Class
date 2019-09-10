

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: University of South Florida</p>
 * @author Natalie S. Wear
 * @version 1.0
 */

public class Major {
  // default constructor
  public Major() {
  } // end default constructor

  // instance methods

  String getNameOfMajor() {
    return nameOfMajor;
  } // end getNameOfMajor

  int getTotalNumberOfMajors() {
    return totalNumberOfMajors;
  } // end getTotalNumberOfMajors

  void setMajorDesc(String desc) {
    this.majorDesc = desc;
  } // end setMajorDesc


  // instance variable declaration
  int totalNumberOfMajors;
  String majorDesc;
  String nameOfMajor;

} // end class Major
