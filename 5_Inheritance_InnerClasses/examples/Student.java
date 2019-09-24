/**
 * Title:        USF Class Examples
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:      University of South Florida
 * @author Natalie S. Wear
 * @version 1.0
 */
import java.util.*;

public class Student {

  // Use this one for an array of students
  public Student() {
    setAllStudents();
  }

  // Use this one for an individual student
  public Student(String firstName, String lastName, String phoneNum,
                  String currentClass, String major){

     setFirstName(firstName);
     setLastName(lastName);
     setPhoneNum(phoneNum);
     setCurrentClass(currentClass);
     setMajor(major);
  }

  public void setFirstName(String firstName) {
    _firstName = firstName;
  }
  public String getFirstName() {
    return _firstName;
  }

  public void setLastName(String lastName) {
    _lastName = lastName;
  }
  public String getLastName() {
    return _lastName;
  }

  public void setPhoneNum(String phoneNum) {
    _phoneNum = phoneNum;
  }
  public String getPhoneNum() {
    return _phoneNum;
  }

  public void setCurrentClass(String currentClass) {
    _currentClass = currentClass;
  }
  public String getCurrentClass() {
    return _currentClass;
  }

  public void setMajor(String major) {
    _major = major;
  }
  public String getMajor() {
    return _major;
  }

  public void setAllStudents() {

    Student[] stds = { (new Student("John","Zoe","999-999-9999","ISM 4234 OOD(Java)","MIS")),
    (new Student("Jane","Capers","999-999-9999","ISM 4234 OOD(Java)","ATG")),
    (new Student("Michael","Hortz","999-999-9999","ISM 4234 OOD(Java)","EE")),
    (new Student("Daisy","Miller","999-999-9999","ISM 4234 OOD(Java)","MASS"))
    };
    _stds = stds;
  }

  public Student[] getAllStudents() {
    return _stds;
  }

  private String _firstName;
  private String _lastName;
  private String _phoneNum;
  private String _currentClass;
  private String _major;
  private Student[] _stds;
}