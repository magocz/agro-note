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
    var isHashOk = false;
    // clearing the menu items backgrund color
    $('.not-loget-in-menu-item').each(function (i, obj) {
        $(obj).css('background-color', '#333');
        if ($(obj).attr('hash') === UrlUtil.getHash()) {
            $(obj).css('background-color', '#ff8c1a');
            loadMainContent(UrlUtil.getPagePath());
            isHashOk = true;
        }
    });

    if (!isHashOk) {
        window.location.hash = UrlUtil.get('path.welcome');
    }
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

loadMaintable = function () {
    console.log($.cookie('username'));
    $.cookie('username', "Dupa222");
    console.log($.cookie('username'));
    var mainTable = new TableUtil(
        $('#welcome-table'),
        [
            {
                title: 'ID',
                sortable: false,
                dataIndex: 'id',
                width: '50'
            },
            {
                title: 'NAME',
                sortable: true,
                dataIndex: 'name',
                width: '100'
            }
        ],
        [
            {
                'name': "dupa",
                'id': "2"
            },
            {
                'name': "dupa",
                'id': "2"
            }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        },
        ],
        true,
        true
    );
    mainTable.generateSimpleTable();

    var mainTable2 = new TableUtil(
        $('#welcome-table2'),
        [
            {
                title: 'ID',
                sortable: false,
                dataIndex: 'id',
                width: '50'
            },
            {
                title: 'NAME',
                sortable: true,
                dataIndex: 'name',
                width: '100'
            }
        ],
        [
            {
                'name': "dupa",
                'id': "2"
            },
            {
                'name': "dupa",
                'id': "2"
            }, {
            'name': "du0pa",
            'id': "22"
        }, {
            'name': "dup2a",
            'id': "2"
        }, {
            'name': "du3pa",
            'id': "2"
        }, {
            'name': "dupa3",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "du4pa",
            'id': "2"
        }, {
            'name': "d423upa",
            'id': "3"
        }, {
            'name': "dupa",
            'id': "21"
        }, {
            'name': "dupa",
            'id': "22"
        }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        }, {
            'name': "dupa",
            'id': "2"
        },
        ],
        true,
        true
    );
    mainTable2.generateSimpleTable();
}
