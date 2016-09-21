<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
    <script src="<c:url value="/resources/js/welcome/login/login.js" />"></script>
</head>
<body>

<!--login modal dialog-->
<div class="modal-dialog  modal-sm">
    <!-- Modal content-->
    <div class="modal-content">
        <form name='loginForm'
              action="<c:url value='/j_spring_security_check' />" method='POST'>

            <div class="modal-header">
                <h4 class="modal-title" id="login-modal-header"></h4>
                <div class="input-error" id="login-error"></div>
            </div>

            <div class="modal-body">
                <label class="small-input_label" for="fname" id="login-modal-username-label"></label>
                <input type="text" class="small-input" id="fname" name="username">
                <label class="small-input_label" for="lname" id="login-modal-password-label"></label>
                <input type="password" class="small-input" id="fname" name="password">

                <input type="hidden" name="${_csrf.parameterName}"
                       value="${_csrf.token}"/>
            </div>
            <div class="modal-footer">
                <button input name="submit" type="submit" class="btn btn-success" style="width: 100%"
                        id="login-modal-button-login"></button>
            </div>
        </form>

    </div>
</div>
</body>
</html>