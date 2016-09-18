function I18n() {
}

I18n.data = {

    states: {
        pl: [
            "Dolnośląskie",
            "Kujawsko-pomorskie",
            "Lubelskie",
            "Lubuskie",
            "Łódzkie",
            "Małopolskie",
            "Mazowieckie",
            "Opolskie",
            "Podkarpackie",
            "Podlaskie",
            "Pomorskie",
            "Śląskie",
            "Świętokrzyskie",
            "Warmińsko-mazurskie",
            "Wielkopolskie",
            "Zachodniopomorskie"
        ],
        en: ["Alabama",
            "Alaska",
            "Arizona",
            "Arkansas",
            "California",
            "Colorado",
            "Connecticut",
            "Delaware",
            "Florida",
            "Georgia",
            "Hawaii",
            "Idaho",
            "Illinois",
            "Indiana",
            "Iowa",
            "Kansas",
            "Kentucky",
            "Louisiana",
            "Maine",
            "Maryland",
            "Massachusetts",
            "Michigan",
            "Minnesota",
            "Mississippi",
            "Missouri",
            "Montana",
            "Nebraska",
            "Nevada",
            "New Hampshire",
            "New Jersey",
            "New Mexico",
            "New York",
            "North Carolina",
            "North Dakota",
            "Ohio",
            "Oklahoma",
            "Oregon",
            "Pennsylvania",
            "Rhode Island",
            "South Carolina",
            "South Dakota",
            "Tennessee",
            "Texas",
            "Utah",
            "Vermont",
            "Virginia",
            "Washington",
            "West Virginia",
            "Wisconsin",
            "Wyoming"
        ]
    },

    countries: [
        {
            key: "none",
            val: "-"
        },
        {
            key: "pl",
            val: "Polska"
        },
        {
            key: "en",
            val: "USA"
        }
    ],

    common: {
        username: {
            pl: "Użytkownik",
            en: "Username"
        },
        password: {
            pl: "Hasło",
            en: "Password"
        },
        firstname: {
            pl: "Imię",
            en: "First name"
        },
        lastname: {
            pl: "Nazwisko",
            en: "Second name"
        },
        mail: {
            pl: "E-Mail",
            en: "E-Mail"
        },
        country: {
            pl: "Kraj",
            en: "Country"
        },
        state: {
            pl: "Województwo",
            en: "State"
        },
        community: {
            pl: "Gmina",
            en: "Community"
        },
        sufrace: {
            pl: "Powierzchnia",
            en: "Surface"
        }
    },

    info: {
        page: {
            not_implemented: {
                pl: "Strona jest w trakcie implementacji.",
                en: "This page is under implementation."
            }
        },
        notselected: {
            pl: "nie wybrano",
            en: "not selected"
        }
    },

    error: {
        login: {
            header: {
                pl: "Błąd podczas logowania...",
                en: "Login error..."
            },
            msg: {
                pl: "Niestety podany login lub hasło jest błędne, spróbuj jeszcze raz.",
                en: "Login or password is wrong, try again."
            }
        }
    },

    footer: {
        copyright: {
            pl: "Copyright© Neldam Software Solutions",
            en: "Copyright© Neldam Software Solutions"
        }
    },

    buttons: {
        login: {
            pl: "Zaloguj!",
            en: "Login!"
        },
        cancel: {
            pl: "Anuluj",
            en: "Cancel"
        },
        register: {
            pl: "Zarejestruj",
            en: "Register"
        }
    },

    modals: {
        login: {
            title: {
                pl: "Palen logowania",
                en: "Login panel"
            }
        },
        register: {
            title: {
                pl: "Palen rejestracji",
                en: "Register panel"
            }
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


/**
 * Method to get all app countries.
 */
I18n.getCountries = function () {
    return I18n.data.countries;
}

/**
 *  Method to get all selected country states.
 * @param key
 */
I18n.getStates = function (country) {
    return I18n.data.states[country];
}