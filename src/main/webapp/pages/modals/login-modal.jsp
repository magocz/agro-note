<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
    <link href="<c:url value="/resources/css/common/jquery-ui.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/common/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/common/input.css" />" rel="stylesheet">

    <script src="<c:url value="/resources/js/common/jquery-2.2.3.js" />"></script>
    <script src="<c:url value="/resources/js/common/jquery-ui.js" />"></script>
    <script src="<c:url value="/resources/js/common/bootstrap/bootstrap.js" />"></script>
    <script src="<c:url value="/resources/js/i18n/I18n.js" />"></script>
    <script src="<c:url value="/resources/js/welcome/login/login.js" />"></script>
</head>
<body onload='document.loginForm.username.focus();'>

<!--login modal dialog-->
<div class="modal fade" id="register-modal" role="dialog" data-backdrop="static"
     data-keyboard="false">
    <div class="modal-dialog  modal-sm">

        <!-- Modal content-->
        <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="login-modal-header"></h4>
                </div>

                <div class="modal-body">
                    <table>
                        <tr class="small-input">
                            <td id="login-modal-username-label" class="small-input"></td>
                            <td class="small-input"><input type='text' name='username' style="width: 100%"></td>
                        </tr>
                        <tr>
                            <td id="login-modal-password-label" class="small-input"></td>
                            <td class="small-input"><input type='password' style="width: 100%" name='password'/></td>
                        </tr>
                    </table>
                    <input type="hidden" name="${_csrf.parameterName}"
                           value="${_csrf.token}"/>
                </div>
                <div class="modal-footer">
                    <button input name="submit" type="submit" class="btn btn-success"
                            id="login-modal-button-login"></button>
                    <button type="button" class="btn btn-default" data-dismiss="modal"
                            id="login-modal-button-cancel"></button>
                </div>
        </div>
    </div>
</div>
</body>
</html>