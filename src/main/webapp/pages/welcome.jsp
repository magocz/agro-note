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
</head>
<body>
</body>
</html>
<table align="center" style="height:100%;">
    <tr>
        <td>
            <jsp:include page="menus/not-loged-in-menu.jsp"/>
        </td>
    </tr>

    <tr style="height:100%">
        <td style="white-space: nowrap;">
            <div style="height:100% ; background-color: #333" id="main-content-load">Loanding ...</div>
            <div id="main-content"></div>
        </td>
    </tr>

    <tr style="height:100%">
        <td>
            <div class="footer" id="footer"></div>
        </td>
    </tr>
</table>

<div id="login-modal-contener">
    <jsp:include page="modals/login-modal.jsp"/>
</div>

<div id="login-modal-contener">
    <jsp:include page="modals/register-modal.jsp"/>
</div>

</html>