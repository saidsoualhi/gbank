/* Toggle sidebar */
var toggle = true;

$(".sidebar-icon").click(function() {                
  if (toggle)
  {
    $(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
    $("#menu span").css({"position":"absolute"});
  }
  else
  {
    $(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
    setTimeout(function() {
      $("#menu span").css({"position":"relative"});
    }, 400);
  }               
  toggle = !toggle;
});


/* Update an account */
function dataToUpdate(id,capital,desc,num) {
  $("[name=id]")[0].value = id;
  $("[name=capital]")[0].value = capital;
  $("[name=description]")[0].value = desc;
  $("[name=num]")[0].value = num;
  $("#updateBtn")[0].disabled = false;
}

/* Submit form ajout/update account */
var actionToDo;
var form = $('#form');
function actionToSubmit(actionToDo) {
	this.actionToDo = actionToDo;
	submitForm();
	$("#form").submit();
}

function submitForm() {
	$('#form').submit(function() {
		document.getElementById("form").action = actionToDo;
	    return true;
	});
}


/* Datatable options */
$(function () {
    /* #txt is display table id & employee_search_ class is field id which you want to filter */
    var oTable = $('#data').dataTable({
        "bPaginate":true,
        "bLengthChange":false,
        "bFilter":true,
        "bSort":false,
        "bInfo":false,
        "bAutoWidth":false,
        "bStateSave":false,
        "pagingType": "full_numbers"
    });
    $("#searchTable").keyup(function () {
        oTable.fnFilter(this.value, $("#searchTable").index(this));
    });
});
    
//    $(function () {
//        $.ajax({
//            type: "GET",
//            url: "/gbank/compte-list",
//            contentType: "application/json;charset=utf-8",
//            dataType: "json",
//            success: function (data) {
//                console.log(data)
//            },
//            error: function (response) {
//                console.log(response)
//            }
//        });
//
//    });
    
//    $("#searchTable").focus(function () {
//        if (this.className == "search-table") {
//            this.className = "";
//            this.value = "";
//        }
//    });
//
//    $("thead input").blur(function (i) {
//        if (this.value == "") {
//            this.className = "employee_search_";
//            this.value = asInitVals[$("thead input").index(this)];
//        }
//    });
