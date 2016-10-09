var globalTableUtilindex = 1;

function SeasonsTable(table, data) {

    // config
    this.index = 'table-util-' + (globalTableUtilindex++);
    this.data = data; // array of object: {'userId': 12}
    this.headers = [
        {
            title: I18n.get('seasons.table.description'),
            dataIndex: "description",
            width: '20%', sortable: true
        },
        {
            title: I18n.get('seasons.table.operationsNumber'),
            dataIndex: "operationsNumber",
            width: '20%', sortable: true
        },
        {
            title: I18n.get('seasons.table.profit'),
            dataIndex: "profit",
            width: '10%', sortable: true
        },
        {
            title: I18n.get('seasons.table.cost'),
            dataIndex: "cost",
            width: '10%', sortable: true
        },
        {
            title: I18n.get('seasons.table.fieldsNumber'),
            dataIndex: "fieldsNumber",
            width: '20%', sortable: true
        },
        {
            title: I18n.get('seasons.table.fieldsSize'),
            dataIndex: "fieldsSize",
            width: '25%', sortable: true
        }
    ]; // array of object: {title: 'Id', dataIndex: 'userId', width: '100', sortable: true}
    this.table = table; // a html table


    // methods
    this.generateSimpleTable = function () {

        var me = this, row = $('<tr></tr>').addClass('simple-tr'),
            sortedHeaders = {}, theadStr = $('<thead></thead>'),
            tbodyStr = $('<tbody></tbody>'),
            colSize = '', dds = 3;


        this.table.empty(); // clear the given table content
        this.table.addClass('simple-table');

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
            for (var j = 0; j < this.headers.length; j++) {
                row.append($('<td></td>').text(this.data[i][this.headers[j].dataIndex]).addClass('simple-td'));
            }
            tbodyStr.append(row);
        }

        this.table.append(tbodyStr);

        // addind sorter fn
        this.table.tablesorter({headers: sortedHeaders});

    }
}
