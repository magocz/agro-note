var globalTableUtilindex = 1;

function TableUtil(table, headers, data, isCheckcolumn) {

    // config
    this.index = 'table-util-' + (globalTableUtilindex++);
    this.data = data; // array of object: {'userId': 12}
    this.headers = headers; // array of object: {title: 'Id', dataIndex: 'userId', width: '100', sortable: true}
    this.table = table; // a html table
    this.isCheckcolumn = isCheckcolumn; // if true make a checkcolumn
    this.isIndex = false; // is true generate index column
    this.selectedRows = {}; // all selected rows

    /*this.toggleSelected = function (index) {
     console.log(this.selectedRows);
     };*/

    // methods
    this.generateSimpleTable = function () {

        var me = this, row = $('<tr></tr>').addClass('simple-tr'),
            sortedHeaders = {}, theadStr = $('<thead></thead>'),
            tbodyStr = $('<tbody></tbody>'),
            colSize = '', dds = 3;


        this.table.empty(); // clear the given table content
        this.table.addClass('simple-table');

        // checkin the attr
        if (this.isCheckcolumn) {

            var headerChekbox = jQuery('<input/>', {
                type: 'checkbox',
                change: function () {
                    var headerChekboxScope = this;
                    $(('.' + me.index)).each(function (i, elem) {
                        if (headerChekboxScope.checked) {
                            $(elem).closest("tr").addClass('selected-row');
                            elem.firstElementChild.checked = true;
                            if (!me.selectedRows[$(this).attr('id')]) {
                                me.selectedRows[$(elem).attr('id')] = $(elem).attr('rowData');
                            }
                        } else {
                            $(elem).closest("tr").removeClass('selected-row');
                            elem.firstElementChild.checked = false;
                            delete me.selectedRows[$(elem).attr('id')];
                        }
                    });
                }
            });

            row.append($('<td></td>').addClass('simple-th').append(headerChekbox));
            colSize = '<col width = "20">'; // seting the column size
            this.table.append(colSize);
        }
        if (this.isIndex) {
            row.append($('<th></th>').html(I18n.get('common.nr')).addClass('simple-th'));
            colSize = '<col width = "20">'; // seting the column size
            this.table.append(colSize);
        }

        // create headers
        for (var i = 0; i < this.headers.length; i++) {
            row.append($('<th></th>').text(this.headers[i].title).addClass('simple-th')); // adding header text
            sortedHeaders[i] = this.headers[i].sortable; // adding header filter or not
            colSize = "<col width = \"" + this.headers[i].width + "\">"; // seting the column size
            this.table.append(colSize);
        }
        this.table.append(theadStr.append(row));

        // loop to draw the data
        for (var i = 0; i < this.data.length; i++) {
            var row = $("<tr></tr>").addClass('simple-tr');
            if (this.isCheckcolumn) {
                row.append($('<td></td>').html("<input type='checkbox'/>").addClass('simple-th').addClass(this.index).attr('id', i).attr('rowData', JSON.stringify(this.data[i])));
            }
            if (this.isIndex) {
                row.append($('<td></td>').html((i + 1)).addClass('simple-th'));
            }
            for (var j = 0; j < this.headers.length; j++) {
                row.append($('<td></td>').text(this.data[i][this.headers[j].dataIndex]).addClass('simple-td'));
            }
            tbodyStr.append(row);
        }

        this.table.append(tbodyStr);

        // addind sorter fn
        this.table.tablesorter({headers: sortedHeaders});

        // add listener on change
        if (this.isCheckcolumn) {
            $(('.' + this.index)).each(function () {
                $(this).on('change', function () {
                    if (!me.selectedRows[$(this).attr('id')]) {
                        me.selectedRows[$(this).attr('id')] = $(this).attr('rowData');
                        $(this).closest("tr").addClass('selected-row');
                    } else {
                        delete me.selectedRows[$(this).attr('id')];
                        $(this).closest("tr").removeClass('selected-row');
                    }
                });
            });
        }

    }
}
