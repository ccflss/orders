<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<HTML>
	<HEAD>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<LINK href="${pageContext.request.contextPath}/css/Style1.css" type="text/css" rel="stylesheet">
	</HEAD>
	
	<body>
		<form  name="Form1" action="${pageContext.request.contextPath}/AdminSupplier_addSupplier.action" method="post" >
			
			&nbsp;
			<table cellSpacing="1" cellPadding="5" width="100%" align="center" bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
						height="26">
						<strong>添加供应商
						</strong>
					</td>
				</tr>

				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
					供应商名称：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<input type="text" name="sname" />
					</td>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						供应商地址
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<input type="text" name="saddr"/>
					</td>
				</tr>
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						供应商联系人
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<input type="text" name="slink" />
						</td>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
			供应商电话
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<input type="text" name="sphone" />
					</td>
				</tr>
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
					邮编
					</td>
					<td class="ta_01" bgColor="#ffffff">
						<input type="text" name="scode"/>
						</td>
				
				</tr>
			
				<tr>
					<td class="ta_01" style="WIDTH: 100%" align="center"
						bgColor="#f5fafe" colSpan="4">
						<button type="submit" id="userAction_save_do_submit" value="确定" class="button_ok">
							&#30830;&#23450;
						</button>

						<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
						<button type="reset" value="重置" class="button_cancel">重置</button>

						<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
						<INPUT class="button_ok" type="button" onclick="history.go(-1)" value="返回"/>
						<span id="Label1"></span>
					</td>
				</tr>
			</table>
		</form>
	</body>
</HTML>