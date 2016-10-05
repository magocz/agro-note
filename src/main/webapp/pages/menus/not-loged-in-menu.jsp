<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
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
