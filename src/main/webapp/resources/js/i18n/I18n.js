function I18n() {
}

I18n.data = {

    states: {
        pl: [
            {
                val: "-",
                key: "none"
            },
            {
                val: "Dolnośląskie",
                key: "dśl"
            },
            {
                val: "Kujawsko-pomorskie",
                key: "k-p"
            },
            {
                val: "Lubelskie",
                key: "lbl"
            },
            {
                val: "Lubuskie",
                key: "lbu"
            },
            {
                val: "Łódzkie",
                key: "łdz"
            },
            {
                val: "Małopolskie",
                key: "młp"
            },
            {
                val: "Mazowieckie",
                key: "maz"
            },
            {
                val: "Opolskie",
                key: "opo"
            },
            {
                val: "Podkarpackie",
                key: "pkr"
            },
            {
                val: "Podlaskie",
                key: "pdl"
            },
            {
                val: "Pomorskie",
                key: "pom"
            },
            {
                val: "Śląskie",
                key: "śl"
            },
            {
                val: "Świętokrzyskie",
                key: "św"
            },
            {
                val: "Warmińsko-mazurskie",
                key: "w-m"
            },
            {
                val: "Wielkopolskie",
                key: "wlp"
            },
            {
                val: "Zachodniopomorskie",
                key: "zpm"
            }
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
            en: "Last name"
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
        },
        register: {
            success: {
                pl: "Rejestraca udana! Zaloguj się!",
                en: "Register done! Login!"
            }
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
            },
            faild: {
                pl: "Błedny login lub hasło, logowanie nie udane.",
                en: "Wrong username or password, login faild."
            },
        },
        register: {
            username: {
                empty: {
                    pl: "Nazwa użytkownika jest wymagana.",
                    en: "Username is required."
                },
                used: {
                    pl: "Nazwa użytkownika jest już zajeta, wpisz inną.",
                    en: "Username is used, try another."
                }
            },
            password: {
                empty: {
                    pl: "Hasło jest wymagane.",
                    en: "Password is required."
                },
                notequal: {
                    pl: "Podane hasła się różnią..",
                    en: "Password are not equal."
                }
            },
            mail: {
                empty: {
                    pl: "E-Mail jest wymagany.",
                    en: "E-Mail is required."
                },
                wrongtyp: {
                    pl: "Wpisz poprawnie adres E-Mail.",
                    en: "Set E-Mail correct."
                },
                used: {
                    pl: "E-Mail jest już zajety, wpisz inny.",
                    en: "E-Mail is used, try another."
                }
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
        },
        ok: {
            pl: "Ok",
            en: "Ok"
        }
    },


    modals: {
        login: {
            title: {
                pl: "Palen logowania",
                en: "Login panel"
            }
        }
        ,
        register: {
            title: {
                pl: "Palen rejestracji",
                en: "Register panel"
            }
        }
    }
    ,

    menu: {
        home: {
            pl: "Home",
            en: "Home"
        }
        ,
        seasons: {
            pl: "Sezony",
            en: "Seasons"
        }
        ,
        user: {
            pl: "Użytkownik",
            en: "User"
        }
        ,
        logout: {
            pl: "Wyloguj",
            en: "Logout"
        }
        ,
        login: {
            pl: "Zaloguj",
            en: "Wyloguj"
        }
        ,
        register: {
            pl: "Zarejestruj",
            en: "Register"
        }
        ,
        contact: {
            pl: "Kontakt",
            en: "Contact"
        }
        ,
        offer: {
            pl: "Oferta",
            en: "Offer"
        }
    }
}
;

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