package org.apereo.portlet.models;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Student {

  private String name;
  private String studentID;
  private String phoneNumber;
  private String address;
  private String email;
  private String username;
  private String collegeLevel;
  private String classStanding;
  private boolean appliedToGraduate;
  private boolean firstYearAdvising;
  private List<Degree> degree;


  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }

  public void setStudentID(String studentID) {
    this.studentID = studentID;
  }
  public String getStudentID() {
    return studentID;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setAddress(String address) {
    this.address = address;
  }
  public String getAddress() {
    return address;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  public String getEmail() {
    return email;
  }

  public void setUsername(String username) {
    this.username = username;
  }
  public String getUsername() {
    return username;
  }

  public void setCollegeLevel(String collegeLevel) {
    this.collegeLevel = collegeLevel;
  }
  public String getCollegeLevel() {
    return collegeLevel;
  }

  public void setClassStanding(String classStanding) {
    this.classStanding = classStanding;
  }
  public String getClassStanding() {
    return classStanding;
  }

  public void setAppliedToGraduate(boolean value) {
    this.appliedToGraduate = value;
  }
  public boolean getAppliedToGraduate() {
    return appliedToGraduate;
  }

  public void setFirstYearAdvising(boolean fistYearAdvising) {
    this.firstYearAdvising = firstYearAdvising;
  }
  public boolean getFirstYearAdvising() {
    return firstYearAdvising;
  }

  public void setDegrees(List<Degree> degree) {
    this.degree = degree;
  }
  public void addDegree(Degree degree) {
    if(Objects.equals(this.degree,null)) {
      this.degree = new ArrayList<Degree>();
    }
    this.degree.add(degree);
  }
  public List<Degree> getDegrees() {
    return degree;
  }

  public String toString() {
    String degrees = "";
    for(Degree degree : getDegrees()) {
      degrees += "\n" + degree.toString();
    }

    return "Student Info(" +
      "\nName: " + getName() +
      "\nSID: " + getStudentID() +
      "\nPhone Number: " + getPhoneNumber() +
      "\nAddress: " + getAddress() +
      "\nEmail: " + getEmail() +
      "\nUsername: " + getUsername() +
      "\nCollege Level: " + getCollegeLevel() +
      "\nClass Standing: " + getClassStanding() +
      "\nApplied To Graduate: " + getAppliedToGraduate() +
      "\nFirst Year Advising: " + getFirstYearAdvising() +
      "\nDegrees: \n" + getDegrees() +
      ")";
  }
}
