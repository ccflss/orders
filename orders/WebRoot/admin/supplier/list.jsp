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
							<strong>供应商列表</strong>
						</TD>
					</tr>
					
					<tr>
	<td class="ta_01" align="center" bgColor="#f5fafe">
		<table cellspacing="1" cellpadding="1" rules="all"bordercolor="gray" border="1"  width="1300">

		 <tr style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

				<td align="center" width="10%">
				供应商id
				</td>
									<td align="center" width="10%">
										供应商名称
									</td>
									<td align="center" width="10%">
									供应商地址
									</td>
									<td width="10%" align="center">
										供应商联系人
									</td>
									<td width="10%" align="center">
										供应商电话
									</td>
										<td width="10%" align="center">
										邮编
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
									<s:iterator var="supplierlist" value="supplierlist">
										<tr align="center">
								<td ><s:property value="#supplierlist.sid"/></td>
								<td><s:property value="#supplierlist.sname"/></td>
								<td><s:property value="#supplierlist.saddr"/></td>
								<td><s:property value="#supplierlist.slink"/></td>
								<td><s:property value="#supplierlist.sphone"/></td>
								<td><s:property value="#supplierlist.scode"/></td>
							
								<td><a href="${pageContext.request.contextPath}/AdminSupplier_delectById.action?sid=<s:property value="#supplierlist.sid"/>">删除</a></td>
								<td><a href="${pageContext.request.contextPath}/admin/staff/updateedit.jsp">更新</a></td>
						</tr>
									</s:iterator>	
							
							
							
							</table>
						</td>
					</tr>
					
				</TBODY>
			</table>
		</form> <br>
		<input type="button" value="添加供应商" onclick="window.location='${pageContext.request.contextPath}/admin/supplier/edit.jsp'" >
	
		

		
	</body>
</HTML>

