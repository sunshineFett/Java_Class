

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: University of South Florida</p>
 * @author Natalie S. Wear
 * @version 1.0
 */

public class Class {
  // default constructor
  public Class() {
  } // end default constructor

  // instance methods

  String getClassName() {
    return className;
  } // end getClassName

  int getTotalClassSize() {
    return classSize;
  } // end getTotalClassSize

  void setClassID(int classId) {
    this.classId = classId;
  } // end setClassID


  // instance variable declaration
  int classId;
  int classSize;
  String className;
}