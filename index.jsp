<%@ page contentType="text/html; charset=Shift_JIS"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>


<%--
<logic:redirect forward="welcome"/>

Redirect default requests to Welcome global ActionForward.
By using a redirect, the user-agent will change address to match the path of our Welcome ActionForward.

<logic:redirect href="/struts/pages/test.jsp"/>
--%>

indexPage!!
<br />

<iframe id="content" neme="content" src="http://localhost:8080/struts/pages/login.jsp"
	name="sample" width="500" height="150">
	縺薙�ｮ驛ｨ蛻�縺ｯ繧､繝ｳ繝ｩ繧､繝ｳ繝輔Ξ繝ｼ繝�繧剃ｽｿ逕ｨ縺励※縺�縺ｾ縺吶�� </iframe>

<%--
<html:frame href="/struts/pages/login.jsp" frameName="sample" width="500" height="150" />

function test(){
	var ssoo = <bean:write name="sso"/>;
	alert(ssoo);

	var src=document.getElementById("content").src;
	alert(src);

}
--%>

<br />
<%-- sso-------->
<bean:write name="sso" />
!!
<br />
loginid---->
<bean:write name="loginId" />
!!
<br />
function-test --%>


<logic:present name="sso"> 
<script type="text/javascript">
	alert("aaa");
	function change_iframe_src() {
		var sso = <bean:write name="sso"/>;
		if (sso){
			document.getElementById("content").contentWindow.location.replace('http://localhost:8080/struts/pages/top.jsp');
		}
	}
	change_iframe_src();
</script>
</logic:present>
