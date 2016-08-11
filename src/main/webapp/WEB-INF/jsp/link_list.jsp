<ul class="list-group">
  <a class="list-group-item" data-toggle="modal" data-target="#myModal" style="cursor:pointer">Verify Contact Information</a>
  <a class="list-group-item" data-toggle="modal" data-target="#showStudentID" style="cursor:pointer">Student ID</a>
</ul>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Verify Contact Information</h4>
      </div>
      <div class="modal-body">
        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title"><spring:message code="mydetails.panel.userInfo" /></h3>
          </div> <!-- /panel-heading -->
          <div class="panel-body mdUserInfo">
            <table id="mdUserTable" class="table table-striped">
              <tbody>
                <tr>
                  <td><spring:message code="mydetails.user.name" /></td>
                  <td>${ student.name }</td>
                </tr>
                <tr>
                  <td><spring:message code="mydetails.user.sid" /></td>
                  <td>${ student.studentID }</td>
                </tr>
                <tr>
                  <td><spring:message code="mydetails.user.email" /></td>
                  <td>${ student.email }</td>
                </tr>
                <tr>
                  <td><spring:message code="mydetails.user.address" /></td>
                  <td>${ student.address }</td>
                </tr>
                <tr>
                  <td><spring:message code="mydetails.user.phoneNumber" /></td>
                  <td>${ student.phoneNumber }</td>
                </tr>
              </tbody>
            </table>
          </div> <!-- /panel-body -->
          <div class="panel-footer">
            <spring:message code="mydetails.panel.footer" />
          </div>
        </div> <!-- /panel -->
      </div> <!-- /userInfo -->
    </div>
  </div>
</div>

<!-- Modal -->
<div class="modal fade" id="showStudentID" tabindex="-1" role="dialog" aria-labelledby="showStudentIDLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="id-card">
        <div class="id-card-mask">
          <div class="modal-body">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <div class="row">
              <div class="col-xs-4">
                <img alt="Your Image" id="thumb" src="/my-details/img/logo.png">
              </div>
              <div class="col-xs-8">
                <p class="id-card-header">University</p>
              </div>
            </div>
            <div class="row id-card-content">
              <div class="col-xs-6">
                <p class="id-card-name">${ student.name }</p>
              </div>
              <div class="col-xs-6">
                <p class="id-card-sid">Student ID: ${ student.studentID }</p>
              </div>
            </div>
          </div> <!-- /userInfo -->
        </div>
      </div>
    </div>
  </div>
</div>
