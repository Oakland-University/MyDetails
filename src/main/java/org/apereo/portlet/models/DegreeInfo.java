package org.apereo.portlet.models;

public class DegreeInfo {
  private String code;
  private String description;

  public DegreeInfo(String code, String description) {
    this.code = code;
    this.description = description;
  }

  public void setCode(String value) {
    this.code = value;
  }
  public String getCode() {
    return code;
  }

  public void setDescription(String value) {
    this.description = value;
  }
  public String getDescription() {
    return description;
  }

  public String toString() {
    return "Degree Info(" +
      "\nCode: " + getCode() +
      "\nDescription: " + getDescription() +
      ")";
  }
}
