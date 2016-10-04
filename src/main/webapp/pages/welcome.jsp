<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
    <link href="<c:url value="/resources/css/common/jquery-ui.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/common/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/menu/menu.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/common/input.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/common/msg.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/common/loader.css" />" rel="stylesheet">

    <script src="<c:url value="/resources/js/common/jquery-2.2.3.js" />"></script>
    <script src="<c:url value="/resources/js/common/jquery-ui.js" />"></script>
    <script src="<c:url value="/resources/js/common/bootstrap/bootstrap.js" />"></script>

    <script src="<c:url value="/resources/js/i18n/I18n.js" />"></script>
    <script src="<c:url value="/resources/js/url/UrlUtil.js" />"></script>
    <script src="<c:url value="/resources/js/common/util/LoaderUtil.js" />"></script>

    <script src="<c:url value="/resources/js/welcome/Main.js" />"></script>
    <script src="<c:url value="/resources/js/welcome/Menu.js" />"></script>

</head>
<body>
<table align="center" style="height:100%; text-align: center">
    <tr>
        <td>
            <jsp:include page="menus/not-loged-in-menu.jsp"/>
        </td>
    </tr>

    <tr>
        <td>
            <div id="main-content-loader" class="small-loader" align="center"></div>
            <div id="main-content" style="margin-bottom: 20px;" hidden="true"></div>
        </td>
    </tr>

    <tr style="height:100%">
        <td>
            <div class="footer" id="footer"></div>
        </td>
    </tr>
</table>
</body>
</html>