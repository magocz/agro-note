function UrlUtil() {
}

UrlUtil.prefix = "";

UrlUtil.urls = {
    path: {
        home: "#home",
        welcome: "#welcome",
        seasons: "#seasons",
        field: "/field",
        fields: "#fields",
        contact: "#contact",
        offer: "#offer",
        login: '#login',
        user: '#user',
        loginerrorFullPath: '/agro-note/welcome#login?error',
        logout: "#logout",
        register: '#register',
        registersuccess: '#login?registerSuccess',
        registersuccessFullPath: '/agro-note/welcome#login?registerSuccess',
    },

    service: {
        login: '/agro-note/j_spring_security_check',
        logout: '/agro-note/j_spring_security_logout',
        nohash: ''
    },

    rest: {
        field: "/agro-note/rest/field/",
        user: "/agro-note/rest/user/",
        fields: "/agro-note/rest/fields/",
        seasons: "/agro-note/rest/seasons/"
    },
    page: {
        welcome: 'pages/content/welcome/welcome.jsp',
        offer: 'pages/content/welcome/offer.jsp',
        contact: 'pages/content/welcome/contact.jsp',
        login: 'pages/content/welcome/login.jsp',
        loginerror: 'pages/content/welcome/login.jsp',
        register: 'pages/content/welcome/register.jsp',

        home: 'pages/content/home/home.jsp',
        user: 'pages/content/home/user.jsp',
        seasons: 'pages/content/home/seasons.jsp',
        fields: 'pages/content/home/fields.jsp'
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
/**
 * Method to get the hash from the URL
 * @returns {string}
 */
UrlUtil.getHash = function () {
    return document.location.hash.split("?")[0];
}

/**
 * Method that return the page path that equals the selected url/hash.
 * @param hash
 */
UrlUtil.getPagePath = function (hash) {
    return UrlUtil.get('page.' + UrlUtil.getHash().substring(1));
}

UrlUtil.getFullPathname = function () {
    return (document.location.pathname + document.location.hash);
}
