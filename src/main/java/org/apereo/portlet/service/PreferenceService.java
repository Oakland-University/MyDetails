package org.apereo.portlet.service;

import org.springframework.stereotype.Service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.portlet.PortletRequest;
import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.ValidatorException;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Objects;
import java.io.IOException;

@Service
public class PreferenceService {

  protected final Log logger = LogFactory.getLog(getClass());

  private static String isAdvisorPreference = "isAdvisorPreference";

  public String getSavedPreferences(PortletRequest request) {
    // Gets Access to where the portlet preferences are saved to
    PortletPreferences preferences = request.getPreferences();

    // Retriving all values that have the same key as isAdvisorPreference
    String[] values = preferences.getValues(isAdvisorPreference, null);

    // If there is no value set for that key then return false
    if(Objects.equals(values,null)) {
      return "false";
    }

    // return the first element in the array
    return values[0];
  }
}
