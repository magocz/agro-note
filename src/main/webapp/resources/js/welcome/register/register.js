$(document).ready(function () {

    $("#register-modal-header").text(I18n.get("modals.register.title"));
    $("#register-modal-username-label").text(I18n.get("common.username"));
    $("#register-modal-password-label").text(I18n.get("common.password"));
    $("#register-modal-password-repeat-label").text(I18n.get("common.password"));
    $("#register-modal-mail-label").text(I18n.get("common.mail"));
    $("#register-modal-first-name-label").text(I18n.get("common.firstname"));
    $("#register-modal-last-name-label").text(I18n.get("common.lastname"));
    $("#register-modal-country-label").text(I18n.get("common.country"));
    $("#register-modal-state-label").text(I18n.get("common.state"));
    $("#register-modal-button-register").text(I18n.get("buttons.register"));

    $.each(I18n.getCountries(), function (key, value) {
        $("#country-select").append('<option value=' + value.key + '>' + value.val + '</option>');
    });

});

function onCountrieSelect() {
    var selVal = $("#country-select").val();
    $("#state-select").attr("disabled", false);
    $("#state-select").empty();
    $.each(I18n.getStates(selVal), function (key, state) {
        $("#state-select").append('<option value=' + state.key + '>' + state.val + '</option>');
    });
}

function register() {
    if (checkUserData()) {
        LoaderUtil.fadeOutMedium($('#main-content'), $('#main-content-loader'));
        $.ajax({
            type: "PUT",
            url: UrlUtil.get('rest.user'),
            data: getUserData(),
            contentType: "application/json",
            dataType: "json",
            statusCode: {
                409: function (response) {
                    markInputAsOk($('#username'));
                    markInputAsOk($('#mail'));
                    LoaderUtil.fadeInFast($('#main-content'), $('#main-content-loader'));
                    if (response.responseJSON == "USERNAME_USED") {
                        setErrorMsg('error.register.username.used');
                        markInputAsWrong($('#username'));
                    } else if (response.responseJSON == "MAIL_USED") {
                        setErrorMsg('error.register.mail.used');
                        markInputAsWrong($('#mail'));
                    }
                }, 200: function () {
                    window.location.hash = UrlUtil.get('path.registersuccess');
                }
            }
        });
    }
}

function getUserData() {
    return JSON.stringify(user = {
        userName: $('#username').val(),
        password: $('#password').val(),
        mail: $('#mail').val(),
        firstName: $('#first-name').val(),
        lastName: $('#last-name').val(),
        country: $('#country-select').val(),
        state: $('#state-select').val()
    });
}


function checkUserData() {
    // clear error msg
    $("#register-error").empty();

    if (checkIsEmpty($('#username'))) {
        setErrorMsg('error.register.username.empty');
    } else if (checkIsEmpty($('#password') || checkIsEmpty($('#password-repeat')))) {
        setErrorMsg('error.register.password.empty');
    } else if (!arePasswordsEqual()) {
        setErrorMsg('error.register.password.notequal');
    } else if (checkIsEmpty($('#mail'))) {
        setErrorMsg('error.register.mail.empty');
    } else if (!isMailCorrect($('#mail'))) {
        setErrorMsg('error.register.mail.wrongtyp');
    } else {
        return true;
    }
}

function checkIsEmpty(input) {
    if (input.val().length === 0) {
        markInputAsWrong(input);
        return true;
    } else {
        markInputAsOk(input);
        return false;
    }
}
function markInputAsWrong(input) {
    input.css('border-bottom', '3px solid red');
}

function markInputAsOk(input) {
    input.css('border-bottom', '1px solid #ff8c1a');
    $("#register-error").empty();
}

function arePasswordsEqual() {
    if ($('#password').val() === $('#password-repeat').val()) {
        markInputAsOk($('#password'));
        markInputAsOk($('#password-repeat'));
        return true;
    }
    markInputAsWrong($('#password'));
    markInputAsWrong($('#password-repeat'));
    return false;
}

function isMailCorrect(input) {
    function isEmail(email) {
        var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
        return regex.test(email);
    };

    if (isEmail(input.val())) {
        markInputAsOk(input);
        return true;
    }
    markInputAsWrong(input);
    return false;
}

function setErrorMsg(key) {
    $("#register-error").empty();
    $("#register-error").text(I18n.get(key));
}
