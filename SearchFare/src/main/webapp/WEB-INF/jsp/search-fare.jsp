<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fare Display</title>
</head>
<body>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<style>

body  
{  
    margin: 0;  
    padding: 0;  
    background-color:#6abadeba;  
    font-family: 'Arial';  
}  
.login{  
        width: 382px;  
        overflow: hidden;  
        margin: auto;  
        margin: 20 0 0 450px;  
        padding: 80px;  
        background: #27AE60;  
        border-radius: 15px ;  
          
}  
h2{  
    text-align: center;  
    color: #277582;  
    padding: 20px;  
}  
label{  
    color: #08ffd1;  
    font-size: 17px;  
}  
#source{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 3px;  
    padding-left: 8px;  
}  
#destination{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 3px;  
    padding-left: 8px;  
      
}  
#button{  
    width: 300px;  
    height: 30px;  
    border: none;  
    border-radius: 17px;  
    padding-left: 7px;  
    color: blue;  
}  
span{  
    color: white;  
    font-size: 17px;  
}  
a{  
    float: right;  
    background-color: grey;  
}  
</style>
<div class="login">
	<h2>Fare Result</h2><br>
	<%-- <form:form action="search-fare" method="GET" modelAttribute="searchFare"> --%>
	
	<%-- <tr><h2 align="center">Fare Details : ${fareResponse} </h2></tr> --%>
			${searchFare.message}
	<br><br> 
	 <label><b>Amount : </b>    
        </label>  
			${searchFare.currency} ${searchFare.amount}
	<br><br> 
		 <label><b>Source : </b></label>  
			${searchFare.source}
			<br><br> 
		 <label><b>Destination :</b></label> 
			${searchFare.destination}
<br><br>	
	
	<%-- <table>
 <c:forEach items="${result}" var="result">
    <tr>
        <td>${result.origin}</td>
        <td>${result.amount}</td>
    </tr>
 </c:forEach>
</table> --%>


</div>
</body>

<script type="text/javascript">
$.each(jsonobj, function(){
    //Bind your table here.
});

</script>
</html>