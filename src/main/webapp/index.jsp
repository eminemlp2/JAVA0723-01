<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	function commit() {
		$.ajax({
			type:'POST',
			url:'show.do',
			data:{number:$('#aa').val()},
			datatype:'jason',
			success:function(resultdata){
				console.log(resultdata);
				if(resultdata){
					$(resultdata).each(function (index,item) {
						$('#ss').text(item.area+" "+item.mobiletype);
					})
				}else{
					$('#ss').text("查询不存在!");
				}				
			}
		});
	}
</script>
<body>
<div id="ss"></div>
	<form action="show.do">
		要查询的号码:<input type="text" name="number" id="aa">
		<input type="button" value="提交" onclick="commit()">
	</form>
</body>
</html>