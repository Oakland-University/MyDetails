<%--

    Licensed to Jasig under one or more contributor license
    agreements. See the NOTICE file distributed with this work
    for additional information regarding copyright ownership.
    Jasig licenses this file to you under the Apache License,
    Version 2.0 (the "License"); you may not use this file
    except in compliance with the License. You may obtain a
    copy of the License at:

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on
    an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied. See the License for the
    specific language governing permissions and limitations
    under the License.

--%>

<jsp:directive.include file="/WEB-INF/jsp/include.jsp"/>

<style type="text/css">
.mmc ul {
  list-style-type:none;
  padding:0;
  color:#fff;
  font-size:16px;
}
.mmc ul li {
  background-color:#b69b56;
  padding:7px 5px 7px 5px;
  margin-top:1px;
}

.applytograduatemsg {
  width:inherit;
}

.modal-content {
  overflow-x: overlay;
}

.modal-content .close {
  margin-top: -10px;
  color: white;
}

.modal-content .id-card {
  background-color: #000;
  background-image: url(/my-details/img/IDBackground.jpg);
  background-size: 100%;
  background-repeat: no-repeat;
  background-position: center center;
  min-width: 376px;
  min-height: 225px;
}

.modal-content .id-card .id-card-mask {
  background-color: rgba(0,0,0,0.6);
  min-width: 376px;
  min-height: 225px;
}

.modal-content .id-card .id-card-mask .modal-body {
  margin-bottom: 0px;
  min-width: 376px;
  min-height: 225px;
}

.modal-content .id-card .id-card-mask .id-card-header {
  font-size: 25px;
  color: white;
  text-align: left;
}

.modal-content .id-card .id-card-mask .id-card-content {
  margin-top: 25px;
}

.modal-content .id-card .id-card-mask .id-card-name {
  margin: 30px 0px 0px 0px;
  font-size: 20px;
  color: white;
  text-align: left;
  overflow-wrap: break-word;
}

.modal-content .id-card .id-card-mask .id-card-sid {
  margin: 30px 0px 0px 0px;
  font-size: 20px;
  color: white;
  text-align: right;
}

#thumb {
  height: 100%;
  width: 100%;
}
</style>

<div id="${n}mdContainer">
  <div class="row apply_to_graduate">
    <div class="col-xs-12">
      <jsp:directive.include file="/WEB-INF/jsp/header_row.jsp"/>
    </div>
  </div>
  <div class="row user_info">
    <div class="col-md-4">
    <jsp:directive.include file="/WEB-INF/jsp/link_list.jsp"/>
    </div>
    <div class="col-md-8">
    <jsp:directive.include file="/WEB-INF/jsp/degree_info.jsp"/>
    </div>
  </div>
</div> <!-- /${n}mdContainer -->

<!-- per Jasig/Apereo JS Standards -->
<script type="text/javascript">
    var portlets = portlets || {};
    up.jQuery().carousel || portlets.bootstrapjQuery || document.write('<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"><\/script>');
</script>

<!-- per Jasig/Apereo JS Standards -->
<script type="text/javascript">
    portlets["${n}"] = {};
    portlets["${n}"].jQuery = jQuery.noConflict(true);
    portlets.bootstrapjQuery = portlets.bootstrapjQuery || (up.jQuery().carousel ? up.jQuery : portlets["${n}"].jQuery);
</script>

<!-- MyDetails Custom JS -->
<script type="text/javascript">
  (function($) {
    $(function(){
      //Add random colors to Major / Minor / Concentration
      $('#${n}mdContainer .mmc li').each(function() {
        $(this).css('border-left', '5px solid ' + randomColor());
      })
    })//end on document ready

    //Random color code generator
    var randomColor = function() {
      var color = '#'+Math.floor(Math.random()*16777215).toString(16);
      return (color.length === 7) ? color : randomColor();
    }
        $(".${n}mydetails_show").click(function(){
        $(this).next('span').show();
        $(this).hide();
    });
  })(portlets["${n}"].jQuery);
</script>
