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
    <script src="<c:url value="/resources/js/register/register.js" />"></script>
</head>
<body onload='document.registerForm.username.focus();'>

<!--register modal dialog-->
<div class="modal fade" id="register-modal" role="dialog" data-backdrop="static"
     data-keyboard="false">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">

            <div class="modal-header">
                <h4 class="modal-title" id="register-modal-header"></h4>
            </div>

            <div class="modal-body">
                <table>
                    <tr class="small-input">
                        <td colspan="2" id="register-modal-input-error" class="small-input"></td>
                    </tr>
                    <tr class="small-input">
                        <td id="register-modal-username-label" class="small-input"></td>
                        <td class="small-input"><input type='text' id='username' style="width: 100%"></td>
                    </tr>
                    <tr>
                        <td id="register-modal-password-label" class="small-input"></td>
                        <td class="small-input"><input type='password' style="width: 100%" id='password'/></td>
                    </tr>
                    <tr>
                        <td id="register-modal-password-repeat-label" class="small-input"></td>
                        <td class="small-input"><input type='password' style="width: 100%" id='password-repeat'/></td>
                    </tr>
                    <tr>
                        <td id="register-modal-mail-label" class="small-input"></td>
                        <td class="small-input"><input type='email' style="width: 100%" id='mail'/></td>
                    </tr>
                    <tr>
                        <td id="register-modal-first-name-label" class="small-input"></td>
                        <td class="small-input"><input type='text' style="width: 100%" id='first-name'/></td>
                    </tr>
                    <tr>
                        <td id="register-modal-last-name-label" class="small-input"></td>
                        <td class="small-input"><input type='text' style="width: 100%" id='last-name'/></td>
                    </tr>
                    <tr>
                        <td id="register-modal-country-label" class="small-input"></td>
                        <td class="small-input"><select onchange="onCountrieSelect()" style="width: 100%"
                                                        id='country-select'/></td>
                    </tr>
                    <tr>
                        <td id="register-modal-state-label" class="small-input"></td>
                        <td class="small-input"><select style="width: 100%" id='state-select' disabled="true"/></td>
                    </tr>
                </table>
                <input type="hidden" name="${_csrf.parameterName}"
                       value="${_csrf.token}"/>
            </div>
            <div class="modal-footer">
                <button input type="submit" class="btn btn-success"
                        id="register-modal-button-register"></button>
                <button type="button" class="btn btn-default" data-dismiss="modal"
                        id="register-modal-button-cancel"></button>
            </div>
        </div>
    </div>
</div>
</body>
</html>