function LoaderUtil() {
}

LoaderUtil.fadeOutFast = function (component, loader) {
    $(component).fadeOut(100, function () {
        $(loader).fadeIn(100);
    });
}

LoaderUtil.fadeOutMedium = function (component, loader) {
    $(component).fadeOut(300, function () {
        $(loader).fadeIn(300);
    });
}

LoaderUtil.fadeInFast = function (component, loader) {
    $(loader).fadeOut(100, function () {
        $(component).fadeIn(100);
    });
}

