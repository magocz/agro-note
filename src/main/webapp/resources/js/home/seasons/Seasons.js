$(document).ready(function () {
    $("#seasons-header").text(I18n.get("seasons.header.title"));

    $("#add-season-button").val(I18n.get("seasons.buttons.add"));

    loadSeasonTable();

});

function loadSeasonTable() {
/*    $('#season-table-content').fadeOut(100, function () {
        $('#season-table-content-loader').fadeIn(100, function () {
            $('#seasons-table').empty();
            $.ajax({
                type: "GET",
                url: UrlUtil.get('rest.seasons'),
                contentType: "application/json",
                dataType: "json",
                success: function (response) {
                    new SeasonsTable($('#seasons-table'), response).generateSimpleTable();
                    $('#season-table-content-loader').fadeOut(100, function () {
                        $('#season-table-content').fadeIn(100);
                    });
                },
                error: function (response) {
                    console.log(response);
                }
            });
        });
    });*/

    $.ajax({
        type: "GET",
        url: UrlUtil.get('rest.seasons'),
        contentType: "application/json",
        dataType: "json",
        success: function (response) {
            new SeasonsTable($('#seasons-table'), response).generateSimpleTable();
            $('#main-content-loader').fadeOut(100, function () {
                $('#main-content').fadeIn(100);
            });
        },
        error: function (response) {
            console.log(response);
        }
    });
}