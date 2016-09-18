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
    <script src="<c:url value="/resources/js/login/login-error.js" />"></script>


</head>
<body>
</body>
</html>
<table align="center">
    <tr>
        <td>
            <jsp:include page="menus/not-loged-in-menu.jsp"/>
        </td>
    </tr>

    <tr>
        <td style="text-align: center">
            <h2 id="login-error-header"></h2>
            <div id="login-error-content"></div>
        </td>
    </tr>

    <tr>
        <td>
            <div class=" footer
            " id="footer"></div>
        </td>
    </tr>
</table>

<div id="login-modal-contener">
    <jsp:include page="modals/login-modal.jsp"/>
</div>

</html>