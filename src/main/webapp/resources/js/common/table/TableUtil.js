function TableUtil() {

}

TableUtil.generateSimpleTable = function (table, headers, data) {
    // headers = [{title: 'Id', width: '10px', sortable: true}, {title: 'Name', width: '100px', sortable: false}];
    // data = [ {content: [1,'Jacek'], style: 'class=bold'}, {content: [2,'Borys'], style: 'class=bold'}]

    // empty the div
    table.empty();
    table.addClass('simple-table');
    // loop to draw the data
    var row = $('<tr></tr>'),
        sortedHeaders = {}, theadStr = $('<thead></thead>'),
        tbodyStr = $('<tbody></tbody>'),
        colSize = '';
    for (var i = 0; i < headers.length; i++) {
        row.append($('<th></th>').text(headers[i].title));
        row.addClass('simple-th');
        sortedHeaders[i] = headers[i].sortable;
        colSize = "<col width = \"" + headers[i].width + "\">";
        table.append(colSize);
    }
    table.append(theadStr.append(row));

    // loop to draw the data
    for (var i = 0; i < data.length; i++) {
        var row = $("<tr></tr>");
        for (var j = 0; j < data.length; j++) {
            row.append($('<td></td>').text(data[i].content[j]));
        }
        tbodyStr.append(row);
    }
    table.append(tbodyStr);

    // addind sorter fn
    table.tablesorter({headers: sortedHeaders});

}
