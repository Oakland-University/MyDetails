package org.apereo.portlet.dao;

import org.apereo.portlet.models.Degree;
import org.apereo.portlet.models.DegreeInfo;
import org.apereo.portlet.models.Student;

import java.util.Map;
import java.util.Set;

import javax.portlet.PortletRequest;
import javax.naming.directory.Attributes;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service("student")
public class MockStudentDetailsDao implements IStudentDao {

  protected final Log logger = LogFactory.getLog(getClass());

  public Student getUserInfo() {
    final Student student = new Student();

    student.setName("John Doe");
    student.setPhoneNumber("(123)-456-7890");
    student.setAddress("123 Main St");
    student.setEmail("johndoe@email.com");
    student.setUsername("JohnDoe");

    return student;
  }

  public Student getStudentInfo(Student student) {

    //Set student ID with mock data
    student.setStudentID("758293L");

    Boolean appliedToGraduate = false;
    student.setAppliedToGraduate(appliedToGraduate);

    student.setCollegeLevel("UG");
    student.setClassStanding("Junior");

    String termCode = "201610";
    String termDescription =  "Winter Semester 2016";
    String collegeCode = "EG";
    String collegeDescription = "School of Egr. and Comp. Sci.";
    String degreeCode = "BS";
    String degreeDescription = "Bachelor of Science";
    Degree degree = new Degree(termCode, termDescription, collegeCode, collegeDescription, degreeCode, degreeDescription);

    String desc = "Computer Science";
    String code = "5020";
    String type = "MAJOR";
    DegreeInfo degreeInfo = new DegreeInfo(code, desc);
    switch(type) {
      case "MAJOR" :
        degree.addMajor(degreeInfo);
        break;
      case "MINOR" :
        degree.addMinor(degreeInfo);
        break;
      case "CONCENTRATION" :
        degree.addConcentration(degreeInfo);
        break;
    }

    student.addDegree(degree);
    return student;
  }
}
