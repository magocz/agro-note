$(document).ready(function () {
    $("#menu-home-url").text(I18n.get("menu.home"));
    $("#menu-home-url").attr("hash", UrlUtil.get("path.welcome"));

    $("#menu-offer-url").text(I18n.get("menu.offer"));
    $("#menu-offer-url").attr("hash", UrlUtil.get("path.offer"));

    $("#menu-contact-url").text(I18n.get("menu.contact"));
    $("#menu-contact-url").attr("hash", UrlUtil.get("path.contact"));

    $("#menu-register-url").text(I18n.get("menu.register"));
    $("#menu-register-url").attr("hash", UrlUtil.get("path.register"));

    $("#menu-login-url").text(I18n.get("menu.login"));
    $("#menu-login-url").attr("hash", UrlUtil.get("path.login"));

    $("#footer").text(I18n.get("footer.copyright"));

    $("#offer-main-content").text(I18n.get("info.page.not_implemented"));

    if (UrlUtil.getHash() === '') {
        window.location.hash = UrlUtil.get('path.welcome')
    }

    setSelectedMenuItemBackgroundColor();

    // if a back or forward button is clicked
    window.addEventListener("popstate", function (e) {
        setSelectedMenuItemBackgroundColor();
    });
});

setSelectedMenuItemBackgroundColor = function () {
    // clearing the menu items backgrund color
    $('.not-loget-in-menu-item').each(function (i, obj) {
        $(obj).css('background-color', '#333');
        if ($(obj).attr('hash') === UrlUtil.getHash()) {
            $(obj).css('background-color', '#ff8c1a');
            loadMainContent(UrlUtil.getPagePath());
        }
    });
}

tabSelected = function (path) {
    window.location.hash = UrlUtil.get(path);
    setSelectedMenuItemBackgroundColor();
    loadMainContent(UrlUtil.getPagePath());
}

loadMainContent = function (page) {
    $('#main-content').empty();
    $('#main-content').load(page);
}
