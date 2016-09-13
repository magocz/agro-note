function I18n() {
}

I18n.data = {
    common: {},

    info: {
        page: {
            not_implemented: {
                pl: "Strona jest w trakcie implementacji.",
                en: "This page is under implementation."
            }
        }
    },

    footer: {
        copyright: {
            pl: "Copyright© Neldam Software Solutions",
            en: "Copyright© Neldam Software Solutions"
        }
    },

    menu: {
        home: {
            pl: "Home",
            en: "Home"
        },
        seasons: {
            pl: "Sezony",
            en: "Seasons"
        },
        user: {
            pl: "Użytkownik",
            en: "User"
        },
        logout: {
            pl: "Wyloguj",
            en: "Logout"
        },
        login: {
            pl: "Zaloguj",
            en: "Wyloguj"
        },
        register: {
            pl: "Zarejestruj",
            en: "Register"
        },
        contact: {
            pl: "Kontakt",
            en: "Contact"
        },
        offer: {
            pl: "Oferta",
            en: "Offer"
        }
    }
};

// suported languages
I18n.languages = {
    pl: true,
    en: true
}

// default language
I18n.defaultLanguage = "en";

// user/browser language
I18n.userLanguage = navigator.language || navigator.userLanguage;


/**
 * Method to get the explicit word for the key. The key don't contains the language shorcut.
 * @param key
 */
I18n.get = function (key) {
    var subKeys = [], result = I18n.data;
    if (I18n.languages[I18n.userLanguage]) {
        key += "." + I18n.userLanguage;
    } else {
        key += "." + I18n.languages["en"];
    }

    subKeys = key.split(".");

    subKeys.forEach(function (k) {
        result = result[k];
        if (result) {
        } else {
            return key;
        }
    });

    return result;
}
