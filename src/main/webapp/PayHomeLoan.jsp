<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <label for="Amount">Amount</label>
    <input type="number" id="amount" name="Amount" placeholder="Enter amount..">
  
 
    
    <input type="button" id="submit" value="Submit" />
    <script>
	jQuery(document).ready(function($) {
 
		$("#submit").click(function(){
			var GoldLoanData = {};
		
			GoldLoanData["Interest"] = $("#interest").val();
			
			$.ajax({
				type : "POST",
				contentType : "application/json",
				url : "GoldLoanDataController",
				data : JSON.stringify(GoldLoanData),
				dataType : 'json',				
				success : function(data) {
					$('#processedData').html(JSON.stringify(data));
					$('#displayDiv').show();
				}
			});
		});
 
	});
</script>
</body>
</html>