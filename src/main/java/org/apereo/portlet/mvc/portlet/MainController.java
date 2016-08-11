/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apereo.portlet.mvc.portlet;

import java.util.Map;
import java.util.Objects;

import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import javax.portlet.PortletSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.ModelAndView;

import org.apereo.portlet.dao.MockStudentDetailsDao;
import org.apereo.portlet.service.PreferenceService;
import org.apereo.portlet.models.Student;

import org.apereo.portlet.dao.IStudentDao;


/**
 * Main portlet view.
 */
@Controller
@RequestMapping("VIEW")
public class MainController {

    private PortletSession portletSession;
    protected final Log logger = LogFactory.getLog(getClass());

    /*
    Any class that implements the IStudentDao interface will be autowired.
    */
    @Autowired
    IStudentDao detailDaos;

    @Autowired
    PreferenceService preference;

    @RenderMapping
    public ModelAndView showMainView(final RenderRequest request, final RenderResponse response) {

      // Retrives the main.jsp and loads it so it can be sent data and displayed
      ModelAndView mav = new ModelAndView("main");

      // Gets access to the portlet session so data can be saved and loaded to it
      portletSession = request.getPortletSession();

      // Gets isAdvidorPreference from a saved preference
      String isAdvisorPreference = preference.getSavedPreferences(request);

      // Resets the student just in case previous data is remnant
      Student student = null;
      if(isAdvisorPreference.equals("true")) {

        student = detailDaos.getUserInfo();
        student = detailDaos.getStudentInfo(student);

        mav.addObject("student", student);
      } else {

        student = detailDaos.getUserInfo();
        student = detailDaos.getStudentInfo(student);

        mav.addObject("student", student);
      }

      mav.addObject("isAdvisor", isAdvisorPreference);
      return mav;
    }

    @ActionMapping
    public void doAction() {
        // no-op action mapping to prevent accidental calls to this URL from
        // crashing the portlet
    }
}
