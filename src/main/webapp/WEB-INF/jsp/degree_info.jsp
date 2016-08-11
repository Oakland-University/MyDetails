<div class="panel-group" id="mdAccordion">
  <c:forEach items="${ student.degrees }" var="degree" varStatus="loop">
  <div class="panel panel-default">

    <div class="panel-heading">
      <h1 class="panel-title">
        ${ degree.degreeDescription }
      </h1>
      <small>${ degree.collegeDescription }</small>
    </div>

    <!-- TERM / LEVEL / STANDING -->
    <div class="row">
      <br/>
      <div class="col-md-12">
        <!-- TERM -->
        <div class="col-xs-12 col-sm-4 col-md-12 col-lg-4">
          <p><strong><spring:message code="mydetails.term" />: </strong>${ degree.termDescription }</p>
        </div>

        <!-- COLLEGE LEVEL -->
        <div class="col-xs-12 col-sm-4 col-md-12 col-lg-4">
          <p><strong><spring:message code="mydetails.college" />: </strong>${ student.collegeLevel }</p>
        </div>

        <!-- CLASS STANDING -->
        <div class="col-xs-12 col-sm-4 col-md-12 col-lg-4">
          <c:choose>
          <c:when test="${ student.classStanding == null}">
          <p><strong><spring:message code="mydetails.class" />: </strong>Not Available</p>
          </c:when>
          <c:otherwise>
          <p><strong><spring:message code="mydetails.class" />: </strong>${ student.classStanding }</p>
          </c:otherwise>
          </c:choose>
        </div>
      </div>
    </div> <!-- /row -->

    <!-- MAJOR / MINOR / CONCENTRATION / COLLEGE -->
    <div class="row">
      <!-- MAJOR / MINOR / CONCENTRATION -->
      <div class="col-md-12">
          <div class="col-xs-12 col-sm-4 col-md-12 col-lg-4 mmc">
            <h2>Majors</h2>
            <ul>
              <c:forEach items="${ degree.majors }" var="major">
              <li>${ major.description }</li>
              </c:forEach>
            </ul>
        </div> <!-- /row -->

        <c:if test="${ fn:length(degree.minors) gt 0 }">
          <div class="col-xs-12 col-sm-4 col-md-12 col-lg-4 mmc">
            <h2>Minors</h2>
            <ul>
              <c:forEach items="${ degree.minors }" var="minor">
              <li>${ minor.description }</li>
              </c:forEach>
            </ul>
          </div>
        </c:if>

        <c:if test="${ fn:length(degree.concentrations) gt 0 }">
          <div class="col-xs-12 col-sm-4 col-md-12 col-lg-4 mmc">
            <h2>Concentrations</h2>
            <ul>
              <c:forEach items="${ degree.concentrations }" var="concentration">
              <li>${ concentration.description }</li>
              </c:forEach>
            </ul>
          </div>
        </c:if>
      </div> <!-- /major /minor /concentration -->
    </div> <!-- /row-major-minor-concentration-college -->
  </div>
  </c:forEach>
</div>
