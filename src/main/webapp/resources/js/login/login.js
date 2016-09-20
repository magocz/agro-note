$(document).ready(function () {

    $("#login-modal-header").text(I18n.get("modals.login.title"));
    $("#login-modal-username-label").text(I18n.get("common.username") + ":");
    $("#login-modal-password-label").text(I18n.get("common.password") + ":");
    $("#login-modal-button-login").text(I18n.get("buttons.login"));
    $("#login-modal-button-cancel").text(I18n.get("buttons.cancel"));

});

function showLoginModal() {
    $("#login-modal").modal();
}

function onload() {
    console.log("fdfdfd");
}