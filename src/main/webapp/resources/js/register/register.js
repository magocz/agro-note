$(document).ready(function () {

    $("#register-modal-header").text(I18n.get("modals.register.title"));
    $("#register-modal-username-label").text(I18n.get("common.username") + ":");
    $("#register-modal-password-label").text(I18n.get("common.password") + ":");
    $("#register-modal-password-repeat-label").text(I18n.get("common.password") + ":");
    $("#register-modal-mail-label").text(I18n.get("common.mail") + ":");
    $("#register-modal-first-name-label").text(I18n.get("common.firstname") + ":");
    $("#register-modal-last-name-label").text(I18n.get("common.lastname") + ":");
    $("#register-modal-country-label").text(I18n.get("common.country") + ":");
    $("#register-modal-state-label").text(I18n.get("common.state") + ":");

    $("#register-modal-button-register").text(I18n.get("buttons.register"));
    $("#register-modal-button-cancel").text(I18n.get("buttons.cancel"));

    $.each(I18n.getCountries(), function (key, value) {
        $("#country-select").append('<option value=' + value.key + '>' + value.val + '</option>');
    });

});

function showRegisterModal() {
    $("#register-modal").modal();
}

function onCountrieSelect() {
    var selVal = $("#country-select").val();
    $("#state-select").attr("disabled", false);
    $("#state-select").empty();
    $.each(I18n.getStates(selVal), function (key, value) {
        $("#state-select").append('<option value=' + value.key + '>' + value.val + '</option>');
    });
}
