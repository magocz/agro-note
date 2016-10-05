$(document).ready(function () {
    $("#menu-home-url").text(I18n.get("menu.home"));
    $("#menu-home-url").attr("hash", UrlUtil.get("path.home"));

    $("#menu-seasons-url").text(I18n.get("menu.seasons"));
    $("#menu-seasons-url").attr("hash", UrlUtil.get("path.seasons"));

    $("#menu-fields-url").text(I18n.get("menu.fields"));
    $("#menu-fields-url").attr("hash", UrlUtil.get("path.fields"));

    $("#menu-user-url").text(I18n.get("menu.user"));
    $("#menu-user-url").attr("hash", UrlUtil.get("path.user"));

    $("#menu-contact-url").text(I18n.get("menu.contact"));
    $("#menu-contact-url").attr("hash", UrlUtil.get("path.contact"));

    $("#menu-logout-url").text(I18n.get("menu.logout"));
    $("#menu-logout-url").attr("hash", UrlUtil.get("path.logout"));

    $("#footer").text(I18n.get("footer.copyright"));

    $("#offer-main-content").text(I18n.get("info.page.not_implemented"));

    if (UrlUtil.getHash() === '') {
        window.location.hash = UrlUtil.get('path.home')
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
}

loadMainContent = function (page) {
    $('#main-content').fadeOut(100, function () {
        $('#main-content-loader').fadeIn(100, function () {
            $('#main-content').empty();
            $('#main-content').load(page, function (responseTxt, statusTxt, xhr) {
                $('#main-content-loader').fadeOut(100, function () {
                    $('#main-content').fadeIn(100);
                });
            });
        });
    });
}
