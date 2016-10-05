<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>

</head>
<body>

<ul>
    <div onclick="tabSelected('path.home')">
        <li><a class="not-loget-in-menu-item" id="menu-home-url"></a></li>
    </div>
    <div onclick="tabSelected('path.seasons')">
        <li><a class="not-loget-in-menu-item" id="menu-seasons-url"></a></li>
    </div>
    <div onclick="tabSelected('path.fields')">
        <li><a class="not-loget-in-menu-item" id="menu-fields-url"></a></li>
    </div>
    <div style="float: right" onclick="tabSelected('path.logout')">
        <li><a class="not-loget-in-menu-item" id="menu-logout-url"></a></li>
    </div>
    <div style="float: right" onclick="tabSelected('path.contact')">
        <li><a class="not-loget-in-menu-item" id="menu-contact-url"></a></li>
    </div>
    <div style="float: right" onclick="tabSelected('path.user')">
        <li><a class="not-loget-in-menu-item" id="menu-user-url"></a></li>
    </div>
</ul>

</body>
</html>

</html>
