<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<%@page pageEncoding="UTF-8" %>
<head>
    <script src="<c:url value="/resources/js/home/seasons/SeasonsTable.js" />"></script>
    <script src="<c:url value="/resources/js/home/seasons/Seasons.js" />"></script>
</head>
<body>
<div>
    <h3 class="table-header" id="seasons-header"></h3>
    <div id="seasons-buttons" style="text-align: right">
        <input type="button" id="add-season-button" class="btn btn-success">
    </div>
    <div id="season-table-content">
        <table id="seasons-table">
        </table>
    </div>
</div>
</body>