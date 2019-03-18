<%@ include file="../includes/includes.jsp" %>  
<html>
<head>
<%@ include file="../shared/head.jsp" %>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="row">
            <div class="col-sm-8">

                <form id="form" role="form" action="" method="Post">
                <div class="col-md-12 col-sm-12">
                    <input type="hidden" class="hidden" name="id">
                	<div class="form-group float-label-control">
                        <label for="">Capital</label>
                        <input type="text" class="form-control" name="capital" placeholder="Capital">
                    </div>
                    <div class="form-group float-label-control">
                        <label for="">Description</label>
                        <input type="text" class="form-control" name="description" placeholder="Description">
                    </div>
                    <div class="form-group float-label-control">
                        <label for="">Num</label>
                        <input type="number" class="form-control" name="num" placeholder="Num">
                    </div>
                </div>
                    <div class="col-md-12 col-sm-12">
                    	<input class="btn btn-success" onclick="addCompte('addCompte')" type="submit" value="Add"/>
                    	<input class="btn btn-info" onclick="updateCompte('updateCompte')" type="submit" value="Update" disabled="disabled" id="updateBtn" />
                    	<a class="btn btn-info" id="id_search" >Search</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<hr />
<div class="container">
    <div class="row">
        <div class="row">
            <div class="col-sm-8">
		        <display:table id="data" name="${compteList}" keepStatus="true" requestURI="/list" export="true" pagesize="5" defaultorder="descending"
		        class="table table-bordered table-condensed table-hover table-striped" >
				    <display:column property="id" title="Id" sortable="true" />
					<display:column property="capital" title="Capital" sortable="true" />
					<display:column property="description" title="Description" sortable="true" />
					<display:column property="num" title="Num" sortable="true" />
					<display:column title="Action">
						<a class="btn btn-info" onclick="dataToUpdate(${data.id}, ${data.capital},'${data.description}',${data.num})">Update</a>
						<a class="btn btn-info" href="./deleteCompte/${data.id}">delete</a>
					</display:column>
				</display:table>
	        </div>
	    </div>
	</div>
</div>
<script type="text/javascript">
	function dataToUpdate(id,capital,desc,num) {
		console.log(id);
		document.getElementsByName("id")[0].value = id;
	  document.getElementsByName("capital")[0].value = capital;
	  document.getElementsByName("desc")[0].value = desc;
	  document.getElementsByName("num")[0].value = num;
	  document.getElementById("updateBtn").disabled = false;
	}
	var actionToDo = "";
	function addCompte(actionToDo) {
		this.actionToDo = actionToDo;
		document.getElementById("form").action = actionToDo;
	}
	function updateCompte(actionToDo) {
		this.actionToDo = actionToDo;
		document.getElementById("form").action = actionToDo;
	}
// 	document.addEventListener("DOMContentLoaded", function(event) {
// 		document.getElementById("id_search").quicksearch("table tbody tr", {
//             noResults: '#noresults',
//             stripeRows: ['odd', 'even'],
//             loader: 'span.loading'
//         });
// 	})
</script>
</body>
</html>