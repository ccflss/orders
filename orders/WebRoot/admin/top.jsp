<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<style type="text/css">
BODY {
	MARGIN: 0px;
	BACKGROUND-COLOR: #ffffff
}

BODY {
	FONT-SIZE: 12px;
	COLOR: #000000
}

TD {
	FONT-SIZE: 12px;
	COLOR: #000000
}

TH {
	FONT-SIZE: 12px;
	COLOR: #000000
}
</style>
		<link href="${pageContext.request.contextPath}/css/Style1.css" rel="stylesheet" type="text/css">
	</HEAD>
	<body>
		<table width="100%" height="70%"  border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td width="100%" style="background-image:url(${pageContext.request.contextPath}/images/top_100.png);background-repeat:no-repeat;background-position:center;background-size:45% 90%;" >
				</td>
			</tr>
		</table>
		
		
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="30" valign="bottom" background="${pageContext.request.contextPath}/images/mis_01.jpg">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td width="75%" align="left">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<font color="#000000"> 							
<script language="JavaScript">
<!--
tmpDate = new Date();
date = tmpDate.getDate();
month= tmpDate.getMonth() + 1 ;

document.write(month);
document.write("月");
document.write(date);
document.write("日 ");

myArray=new Array(6);
myArray[0]="星期日"
myArray[1]="星期一"
myArray[2]="星期二"
myArray[3]="星期三"
myArray[4]="星期四"
myArray[5]="星期五"
myArray[6]="星期六"
weekday=tmpDate.getDay();
if (weekday==0 | weekday==6)
{
document.write(myArray[weekday])
}
else
{document.write(myArray[weekday])
};
// -->
									
</script> </font>
							</td>
							
							
							
							<td width="25%">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
								<td style="width: 108px; ">
										<p style="font-size:18px; color: red; margin-left: 10px" >用户名：</p>
						               	<font color="blue"><s:property value="#session.existAdminUser.username"/></font>
						        </td>
						        <td style="width: 126px; ">
								     <a href> <p style="font-size:18px; color:blue; margin-top: -1px; " > 退出</p></a>
								</td>	
									</tr>
								</table>
							</td>
						
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</HTML>
