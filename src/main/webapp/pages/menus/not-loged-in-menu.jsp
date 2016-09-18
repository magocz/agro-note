<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
    <link href="<c:url value="/resources/css/common/jquery-ui.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/common/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/menu/menu.css" />" rel="stylesheet">

    <script src="<c:url value="/resources/js/common/jquery-2.2.3.js" />"></script>
    <script src="<c:url value="/resources/js/common/jquery-ui.js" />"></script>
    <script src="<c:url value="/resources/js/common/bootstrap/bootstrap.js" />"></script>
    <script src="<c:url value="/resources/js/i18n/I18n.js" />"></script>
    <script src="<c:url value="/resources/js/url/UrlUtil.js" />"></script>
    <script src="<c:url value="/resources/js/menu/NotLogedInMenuOnLoad.js" />"></script>

</head>
<body>

<ul>
    <li><a id="menu-home-url"></a></li>

    <div style="float: right" onclick="showLoginModal()">
        <li><a id="menu-login-url"></a></li>
    </div>
    <div style="float: right">
        <li><a id="menu-register-url"></a></li>
    </div>
    <div style="float: right">
        <li><a id="menu-contact-url"></a></li>
    </div>
    <div style="float: right">
        <li><a id="menu-offer-url"></a></li>
    </div>

</ul>

</body>
</html>

</html>