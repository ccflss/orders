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
							<strong>用户列表</strong>
						</TD>
					</tr>
					
					<tr>
	<td class="ta_01" align="center" bgColor="#f5fafe">
		<table cellspacing="1" cellpadding="1" rules="all"bordercolor="gray" border="1"  width="1300">

		 <tr style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

				<td align="center" width="10%">
					员工id
				</td>
									<td align="center" width="10%">
										员工名字
									</td>
									<td align="center" width="10%">
									员工电话
									</td>
									<td width="10%" align="center">
										员工职位
									</td>
									<td width="10%" align="center">
										离职时间
									</td>
										<td width="10%" align="center">
										入职时间
									</td>
										<td width="10%" align="center">
										权利
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
									<s:iterator var="staff" value="stafflist">
										<tr align="center">
								<td ><s:property value="#staff.s_id"/></td>
								<td><s:property value="#staff.s_name"/></td>
								<td><s:property value="#staff.s_phone"/></td>
								<td><s:property value="#staff.s_job"/></td>
								<td><s:property value="#staff.s_leavetime"/></td>
								<td><s:property value="#staff.s_cometime"/></td>
								<td><s:property value="#staff.s_power"/></td>
								<td><a href="${pageContext.request.contextPath}/AdminStaff_deletcById.action?s_id=<s:property value="#staff.s_id"/>">删除</a></td>
								<td><a href="${pageContext.request.contextPath}/admin/staff/updateedit.jsp">更新</a></td>
						</tr>
									</s:iterator>	
							
							
							
							</table>
						</td>
					</tr>
					
				</TBODY>
			</table>
		</form> <br>
		<input type="button" value="新增员工" onclick="window.location='${pageContext.request.contextPath}/admin/staff/edit.jsp'" >
		<input type="submit" value="根据id查找员工">
		

		
	</body>
</HTML>

