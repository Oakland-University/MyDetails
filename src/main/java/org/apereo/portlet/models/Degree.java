package org.apereo.portlet.models;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Degree {

  private List<DegreeInfo> majors;
  private List<DegreeInfo> minors;
  private List<DegreeInfo> concentrations;
  private String termCode;
  private String termDescription;
  private String collegeCode;
  private String collegeDescription;
  private String degreeCode;
  private String degreeDescription;

  public Degree(String termCode, String termDescription, String collegeCode, String collegeDescription, String degreeCode, String degreeDescription) {
    setTermCode(termCode);
    setTermDescription(termDescription);

    setCollegeCode(collegeCode);
    setCollegeDescription(collegeDescription);

    setDegreeCode(degreeCode);
    setDegreeDescription(degreeDescription);
  }

  public Degree() {
  }

  public List<DegreeInfo> getMajors() {
    return majors;
  }
  public void addMajor(DegreeInfo value) {
    if(Objects.equals(this.majors, null)) {
      this.majors = new ArrayList<DegreeInfo>();
    }
    this.majors.add(value);
  }
  public void setMajors(List<DegreeInfo> value) {
    this.majors = value;
  }

  public List<DegreeInfo> getMinors() {
    return minors;
  }
  public void addMinor(DegreeInfo value) {
    if(Objects.equals(this.minors,null)) {
      this.minors = new ArrayList<DegreeInfo>();
    }
    this.minors.add(value);
  }
  public void setMinors(List<DegreeInfo> value) {
    this.minors = value;
  }

  public List<DegreeInfo> getConcentrations() {
    return concentrations;
  }
  public void addConcentration(DegreeInfo value) {
    if(this.concentrations==null) {
      this.concentrations = new ArrayList<DegreeInfo>();
    }
    this.concentrations.add(value);
  }
  public void setConcentrations(List<DegreeInfo> value) {
    this.concentrations = value;
  }

  public String getTermCode() {
    return termCode;
  }
  public void setTermCode(String value) {
    this.termCode = value;
  }

  public String getTermDescription() {
    return termDescription;
  }
  public void setTermDescription(String value) {
    this.termDescription = value;
  }

  public String getCollegeCode() {
    return collegeCode;
  }
  public void setCollegeCode(String value) {
    this.collegeCode = value;
  }

  public String getCollegeDescription() {
    return collegeDescription;
  }
  public void setCollegeDescription(String value) {
    this.collegeDescription = value;
  }

  public String getDegreeDescription() {
    return degreeDescription;
  }
  public void setDegreeDescription(String value) {
    this.degreeDescription = value;
  }

  public String getDegreeCode() {
    return degreeCode;
  }
  public void setDegreeCode(String value) {
    this.degreeCode = value;
  }

  public String toString() {
    String majors = "";
    String minors = "";
    String concentrations = "";
    if(getMajors() != null) {
      for(DegreeInfo major : getMajors()) {
        majors += major.toString();
      }
    }
    if(getMinors() != null) {
      for(DegreeInfo minor : getMinors()) {
        minors += minor.toString();
      }
    }
    if(getConcentrations() != null) {
      for(DegreeInfo concentration : getConcentrations()) {
        concentrations += concentration.toString();
      }
    }
    return "Degrees(" +
      "\nMajors:\n" + majors +
      "\nMinors: \n" + minors +
      "\nConcentrations: \n" + concentrations +
      "\nTerm Code: " + getTermCode() +
      "\nTerm Description: " + getTermDescription() +
      "\nCollege Code: " + getCollegeCode() +
      "\nCollege Description: " + getCollegeDescription() +
      "\nDegree Code: " + getDegreeCode() +
      "\nDegree Description: " + getDegreeDescription() +
      ")";
  }
}
