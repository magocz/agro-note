<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8" %>
<html>
<head>
    <script src="<c:url value="/resources/js/welcome/register/register.js" />"></script>
</head>
<div class="modal-dialog">
    <!-- Modal content-->
    <div class="modal-content">

        <div class="modal-header">
            <h4 class="modal-title" id="register-modal-header"></h4>
            <div class="input-error" id="register-error"></div>
        </div>

        <div class="modal-body" style="text-align: left">
            <label class="small-input_label" for="username" id="register-modal-username-label"></label>
            <input type="text" class="small-input" id="username" maxlength="100">

            <label class="small-input_label" for="password" id="register-modal-password-label"></label>
            <input type="password" class="small-input" id="password" maxlength="100">

            <label class="small-input_label" for="password-repeat" id="register-modal-password-repeat-label"></label>
            <input type="password" class="small-input" id="password-repeat">

            <label class="small-input_label" for="mail" id="register-modal-mail-label"></label>
            <input type="text" class="small-input" id="mail" maxlength="200">

            <label class="small-input_label" for="first-name" id="register-modal-first-name-label"></label>
            <input type="text" class="small-input" id="first-name" maxlength="100">

            <label class="small-input_label" for="last-name" id="register-modal-last-name-label"></label>
            <input type="text" class="small-input" id="last-name" maxlength="100">

            <label class="small-input_label" for="country-select" id="register-modal-country-label"></label>
            <select class="small-input" onchange="onCountrieSelect()" style="width: 100%" id='country-select'/>

            <label class="small-input_label" for="state-select" id="register-modal-state-label"></label>
            <select class="small-input" style="width: 100%" id='state-select'/>
        </div>
        <div class="modal-footer">
            <button type="submit" class="btn btn-success" style="width: 100%"
                    id="register-modal-button-register" onclick="register()"></button>
        </div>
    </div>
</div>

</html>