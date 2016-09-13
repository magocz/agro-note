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
    <script src="<c:url value="/resources/js/common/i18n/I18n.js" />"></script>

</head>
<body>

<ul>
    <li><a id="menu-home-url" href="/"></a></li>
    <li><a id="menu-seasons-url" href="/news"></a></li>
    <li><a id="menu-user-url" href="/contact"></a></li>
    <div style="float: right">
        <li><a id="menu-offer-url" href="/about"></a></li>
    </div>
    <div style="float: right">
        <li><a id="menu-contact-url" href="/about"></a></li>
    </div>
    <div style="float: right">
        <li><a id="menu-logout-url" href="/about"></a></li>
    </div>
</ul>

</body>
</html>

</html>