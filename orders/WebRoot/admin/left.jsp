<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>菜单</title>
<link href="${pageContext.request.contextPath}/css/left.css" rel="stylesheet" type="text/css"/>
<link rel="StyleSheet" href="${pageContext.request.contextPath}/css/dtree.css" type="text/css" />
</head>
<body>
<table width="100" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="12"></td>
  </tr>
</table>
<table width="100%" border="0">
  <tr>
    <td>
<div class="dtree">

	<a href="javascript: d.openAll();">展开所有</a> | <a href="javascript: d.closeAll();">关闭所有</a>
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/dtree.js"></script>
	<script type="text/javascript">
		
		d = new dTree('d');
		d.add('01',-1,'功能列表');
		d.add('0101','01','系统管理','','','mainFrame');
		d.add('010101','0101','职工权限管理','${pageContext.request.contextPath}/userAdmin_findAll.action?page=1','','mainFrame');
		d.add('010102','0101','统计管理员管理','${pageContext.request.contextPath}/userAdmin_findAll.action?page=1','','mainFrame');
		d.add('010103','0101','管理所有员工','${pageContext.request.contextPath}/AdminStaff_findAllStaff.action','','mainFrame');

		d.add('0102','01','商品管理','','','mainFrame');
		d.add('010201','0102','商品入库管理','${pageContext.request.contextPath}/adminCategory_findAll.action','','mainFrame');
		d.add('010202','0102','商品出库管理','${pageContext.request.contextPath}/adminCategory_findAll.action','','mainFrame');
		d.add('010103','0102','供应商管理','${pageContext.request.contextPath}/AdminSupplier_findAllSupplier.action','','mainFrame');
		d.add('0103','01','查询统计');
		d.add('010301','0103','商品统计','${pageContext.request.contextPath}/AdminUser_productList.action','','mainFrame');
		d.add('010302','0103','出库查询','','','mainFrame');
		d.add('010303','0103','入库查询','','','mainFrame');
		d.add('010304','0103','库存查询','${pageContext.request.contextPath}/AdminProduct_findAllProduct.action','','mainFrame');
		document.write(d);
	
	</script>
</div>	</td>
  </tr>
</table>
</body>
</html>
