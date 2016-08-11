package org.apereo.portlet.models;

public class College {

  private String link;
  private String advisingLink;

  public College(String link, String advisingLink) {
    this.link = link;
    this.advisingLink = advisingLink;
  }

  public void setLink(String link) {
    this.link = link;
  }
  public String getLink() {
    return link;
  }

  public void setAdvisingLink(String advisingLink) {
    this.advisingLink = advisingLink;
  }
  public String getAdvisingLink() {
    return advisingLink;
  }

  public String toString() {
    return "College(" +
      "\nLink:" + getLink() +
      "\nAdvising Link:" + getAdvisingLink() +
      ")";
  }
}
