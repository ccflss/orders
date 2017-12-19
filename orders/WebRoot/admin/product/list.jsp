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
		<br>
		<form id="Form1" name="Form1" action="${pageContext.request.contextPath}/user/list.jsp" method="post">
			<table cellSpacing="1" cellPadding="0" width="100%" align="center" bgColor="#f5fafe" border="0">
				<TBODY>
					<tr>
						<td class="ta_01" align="center" bgColor="#afd1f3">
							<strong>商品列表</strong>
						</TD>
					</tr>
					
					<tr>
	<td class="ta_01" align="center" bgColor="#f5fafe">
		<table cellspacing="1" cellpadding="1" rules="all"bordercolor="gray" border="1"  width="1300">

		 <tr style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

				<td align="center" width="10%">
					商品id
				</td>
									<td align="center" width="10%">
									商品名称
									</td>
									<td align="center" width="10%">
									商品价格
									</td>
									<td width="10%" align="center">
									商品数量
									</td>
									<td width="10%" align="center">
									商品日期
									</td>
										<td width="10%" align="center">
									商品产地
									</td>
										
									</td>
										<td width="10%" align="center">
										操作1
									</td>
									</td>
										<td width="10%" align="center">
										操作2
									</td>
								</tr>
									<s:iterator var="product" value="productlist">
										<tr align="center">
								<td ><s:property value="#product.pid"/></td>
								<td><s:property value="#product.pname"/></td>
								<td><s:property value="#product.pprice"/></td>
								<td><s:property value="#product.pnum"/></td>
								<td><s:property value="#product.pdate"/></td>
								<td><s:property value="#product.pfrom"/></td>
						
								<td><a href="${pageContext.request.contextPath}/AdminProduct_deletcById.action?pid=<s:property value="#product.pid"/>">删除</a></td>
								<td><a href="${pageContext.request.contextPath}/admin/staff/updateedit.jsp">更新</a></td>
						</tr>
									</s:iterator>	
							
							
							
							</table>
						</td>
					</tr>
					
				</TBODY>
			</table>
		</form> <br>
		<input type="button" value="新增员工" onclick="window.location='${pageContext.request.contextPath}/admin/staff/edit.jsp'" ><br>
	
		<input type="text" placeholder="请输入用户名查询" name="pname" id="pname">
		<input type="button" id="serch"  value="模糊查询">
    </br>
    	<table id="tit" border="1" cellpadding="10">
    	<th colspan="2">商品信息表</th>
    	<tr >
		<td >商品名称</td>
		<td >商品库存</td>
        </tr>
      
       
    	
		</table>
	</body>
</HTML>
<script type="text/javascript"  src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$("#serch").click(function(){
		$.ajax({
			type: "POST",
			url: "${pageContext.request.contextPath}/AdminProduct_findByProductName.action",
			data: {
				pname:$("#pname").val()
			},
			dataType: "json",
			success: function(root){
		    //alert(root);
		    var str="";
		    $.each(root, function(name, value) {			     
			  //alert(value.pname);
			   str+="<tr><td>"+value.pname+"</td><td>"+value.pnum+"</td></tr>"
			      //name表示Object当前属性的名称
			     //value表示Object当前属性的值
			});
			$("#tit").append(str);
			
		   		}
		   	
	});
	});
</script>


