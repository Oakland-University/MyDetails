package org.apereo.portlet.dao;

import org.springframework.stereotype.Service;
import org.apereo.portlet.models.Student;


@Service
public interface IStudentDao {

  public Student getStudentInfo(Student student);

  public Student getUserInfo();
}
