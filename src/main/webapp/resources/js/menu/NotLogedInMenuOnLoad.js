$(document).ready(function () {
    $("#menu-home-url").text(I18n.get("menu.home"));
    $("#menu-home-url").attr("hash", UrlUtil.get("path.welcome"));

    $("#menu-offer-url").text(I18n.get("menu.offer"));
    $("#menu-offer-url").attr("hash", UrlUtil.get("path.offer"));

    $("#menu-contact-url").text(I18n.get("menu.contact"));
    $("#menu-contact-url").attr("hash", UrlUtil.get("path.contact"));

    $("#menu-register-url").text(I18n.get("menu.register"));

    $("#menu-login-url").text(I18n.get("menu.login"));

    $("#footer").text(I18n.get("footer.copyright"));

    $("#offer-main-content").text(I18n.get("info.page.not_implemented"));

    setSelectedMenuItemBackgroundColor();
});

setSelectedMenuItemBackgroundColor = function () {
    // clearing the menu items backgrund color
    $('.not-loget-in-menu-item').each(function (i, obj) {
        $(obj).css('background-color', '#333');
        if ($(obj).attr('hash') === UrlUtil.getHash()) {
            $(obj).css('background-color', '#ff8c1a');
        }
    });
}

contactTabSelected = function () {
    window.location.hash = UrlUtil.get("path.contact");
    setSelectedMenuItemBackgroundColor();

    $("#main-content").fadeOut(200, function () {
        $('#main-content-load').fadeIn(0, function () {
            $('#main-content').load('/pages/contact.jsp', function () {
                $("#main-content-load").fadeOut(200, function () {
                    $("#main-content").fadeIn(100);
                });
            });
        });
    });
}

welcomeTabSelected = function () {
    window.location.hash = UrlUtil.get("path.welcome");
    setSelectedMenuItemBackgroundColor();
}

offerTabSelected = function () {
    window.location.hash = UrlUtil.get("path.offer");
    setSelectedMenuItemBackgroundColor();
}
