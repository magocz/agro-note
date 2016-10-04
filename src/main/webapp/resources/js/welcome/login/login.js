$(document).ready(function () {
    $("#login-modal-header").text(I18n.get("modals.login.title"));
    $("#login-modal-username-label").text(I18n.get("common.username"));
    $("#login-modal-password-label").text(I18n.get("common.password"));
    $("#login-modal-button-login").text(I18n.get("buttons.login"));
    $("#login-modal-button-cancel").text(I18n.get("buttons.cancel"));

    $("#register-modal-succes-header").text(I18n.get("info.register.success"));
    $("#register-modal-success-button-ok").text(I18n.get("buttons.ok"));


    // check if login error
    if ((UrlUtil.getFullPathname() === UrlUtil.get('path.loginerrorFullPath'))) {
        $('#login-error').text(I18n.get('error.login.faild'));
    } else {
        $('#login-error').empty();
    }

    // check if is send by register
    if ((UrlUtil.getFullPathname() === UrlUtil.get('path.registersuccessFullPath'))) {
        $('#register-success-modal').modal();
    }

});