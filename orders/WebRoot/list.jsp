<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<HTML>
	<HEAD>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="${pageContext.request.contextPath}/css/Style1.css" rel="stylesheet" type="text/css" />
		<script language="javascript" src="${pageContext.request.contextPath}/js/public.js"></script>
		
	</HEAD>
	<body>
		<p>点我</p>
		<input type="text" name="name" id="user">
		
	</body>
</HTML>
<script type="text/javascript"  src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$("p").click(function(){
		$.ajax({
		    type: "POST",
		    url: "${pageContext.request.contextPath}/JsonAction_execute.action",
		    data: {
		    	name:$("#user").val()
		    },
		    dataType: "json",
		    success: function(root){
		    	alert(root);
		    }
		});
	})
</script>


