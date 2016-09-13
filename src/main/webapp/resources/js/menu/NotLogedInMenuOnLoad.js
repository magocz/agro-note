$(document).ready(function () {
    $("#menu-home-url").text(I18n.get("menu.home"));
    $("#menu-home-url").attr("href", UrlUtil.get("path.welcome"));

    $("#menu-offer-url").text(I18n.get("menu.offer"));
    $("#menu-offer-url").attr("href", UrlUtil.get("path.offer"));

    $("#menu-contact-url").text(I18n.get("menu.contact"));
    $("#menu-contact-url").attr("href", UrlUtil.get("path.contact"));

    $("#menu-register-url").text(I18n.get("menu.register"));
    $("#menu-register-url").attr("href", UrlUtil.get("path.register"));

    $("#menu-login-url").text(I18n.get("menu.login"));
    $("#menu-login-url").attr("href", UrlUtil.get("path.login"));

    $("#footer").text(I18n.get("footer.copyright"));

    $("#offer-main-content").text(I18n.get("info.page.not_implemented"));
    
});