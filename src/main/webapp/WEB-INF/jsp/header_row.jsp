<link rel="stylesheet" type="text/css" href="<c:url value="/css/myDetails.css"/>"></link>
<!-- APPLY TO GRADUATE -->
<c:if test="${ student.classStanding == 'Senior' and student.collegeLevel == 'UG' }">
  <c:choose>
    <c:when test="${ not student.appliedToGraduate }">
      <div class="alert alert-danger alert-dismissible" role="alert">
        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
        <div class="row">
          <div class="flexcontainer">
            <div class="col-xs-2 ${n}warningIcon" id="myDetails-warningIcon"> 
              <span class="glyphicon glyphicon-warning-sign" aria-hidden="true" style="font-size:xx-large"></span>
            </div>
            <div class="col-xs-10 ${n}warningMsg"> 
              <c:choose>
                <c:when test="${ isAdvisor eq false }">
                Our records indicate that you are a <strong>${ student.classStanding }</strong> and have not applied to graduate yet.<br \>If you are ready to do so, please <a class="alert-link" href="/uPortal/f/p/degree-progress/${ renderRequest.windowState }?action=showProgress" target="_blank">apply to graduate</a>
                </c:when>
                <c:otherwise>
                Our records indicate that this student is a <strong>${ student.classStanding }</strong> and has not applied to graduate yet.<br \>You can run a <a class="alert-link" href="/uPortal/f/p/advisor-degree-progress?action=showProgress" target="_blank">Progress To Degree Evaluation</a> to see if the student is ready to graduate
                </c:otherwise>
              </c:choose>
            </div>
          </div> <!-- /container -->
        </div> <!-- /row -->
      </div> <!-- /alert -->
      </c:when>
      <c:otherwise>
        <div class="alert alert-success alert-dismissible" role="alert">
          <button type="button" class="close" data-dismiss="alert" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
          <div class="row">
            <div class="flexcontainer">
              <div class="col-xs-2 ${n}thumbsUpIcon">
                <span class="glyphicon glyphicon-thumbs-up" aria-hidden="true" style="font-size:xx-large"></span>
              </div>
              <div class="col-xs-10 ${n}thumbsUpMsg">
                <c:choose>
                <c:when test="${ isAdvisor eq false }">
                Our records show you have <strong>applied to graduate</strong>!<br \>Remember to periodically check your email for more information.
                </c:when>
                <c:otherwise>
                Our records show this student has <strong>applied to graduate</strong>!
                </c:otherwise>
                </c:choose>
              </div>
            </div> <!-- /container -->
          </div> <!-- /row -->
        </div> <!-- /alert -->
      </c:otherwise>
    </c:choose>
  </c:if>
