function UrlUtil() {
}

UrlUtil.prefix = "";

UrlUtil.urls = {
    path: {
        home: "/",
        welcome: "/welcome",
        seasons: "/seasons",
        field: "/field",
        fields: "/fields",
        contact: "/contact",
        offer: "/offer",
        login: "#login",
        register: "#register",
        logout: "/j_spring_security_logout",
    },

    rest: {
        field: "/rest/field/",
        user: "/rest/user/",
        fields: "/rest/fields/",
        seasons: "/rest/seasons/"
    }
};

/**
 * Method to get the explicit url for the key.
 * @param key
 */
UrlUtil.get = function (key) {
    var subKeys = [], url = UrlUtil.urls;

    subKeys = key.split(".");

    subKeys.forEach(function (k) {
        url = url[k];
        if (!url) {
            return key;
        }
    });
    url = (UrlUtil.prefix + url)
    return url;
}