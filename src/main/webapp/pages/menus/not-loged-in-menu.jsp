<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
  <%--  <link href="<c:url value="/resources/css/common/jquery-ui.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/common/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/menu/menu.css" />" rel="stylesheet">

    <script src="<c:url value="/resources/js/common/jquery-2.2.3.js" />"></script>
    <script src="<c:url value="/resources/js/common/jquery-ui.js" />"></script>
    <script src="<c:url value="/resources/js/common/bootstrap/bootstrap.js" />"></script>--%>
</head>
<body>

<ul>
    <div onclick="tabSelected('path.welcome')">
        <li><a class="not-loget-in-menu-item" id="menu-home-url"></a></li>
    </div>
    <div style="float: right" onclick="tabSelected('path.login')">
        <li><a class="not-loget-in-menu-item" id="menu-login-url"></a></li>
    </div>
    <div style="float: right" onclick="tabSelected('path.register')">
        <li><a class="not-loget-in-menu-item" id="menu-register-url"></a></li>
    </div>
    <div style="float: right" onclick="tabSelected('path.contact')">
        <li><a class="not-loget-in-menu-item" id="menu-contact-url"></a></li>
    </div>
    <div style="float: right" onclick="tabSelected('path.offer')">
        <li><a class="not-loget-in-menu-item" id="menu-offer-url"></a></li>
    </div>
</ul>

</body>
</html>