function getNameBox() {
    var checkBox = document.getElementById("checkbox");
    var name = document.getElementById("showName");
    if (checkBox.checked == true){
      name.style.display = "block";
      name.focus();
    } else {
       name.style.display = "none";
    }
  }

  function getData(){
    var checkBox = document.getElementById("checkbox");
    var name;
    if (checkBox.checked == true){
        name = document.getElementById("showName").value;
        getInfoByName(name);
      } else {
          getAllInfo();
      }
  }

  var Employees = [
    {
        "Id": "123",
        "Name": "Keshav",
        "City": "Delhi"
    },
    {
        "Id": "187",
        "Name": "Nidhi",
        "City": "Bangalore"
    },
    {
        "Id": "211",
        "Name": "Mehak",
        "City": "Delhi"
    },
    {
        "Id": "246",
        "Name": "Tanisha",
        "City": "Mumbai"
    },
    {
        "Id": "111",
        "Name": "Faizal",
        "City": "Mumbai"
    },
    {
        "Id": "137",
        "Name": "Krish",
        "City": "Delhi"
    },
    {
        "Id": "345",
        "Name": "Anirudh",
        "City": "Bangalore"
    },
    {
        "Id": "155",
        "Name": "Cheshtha",
        "City": "Delhi"
    },
    {
        "Id": "160",
        "Name": "Kiara",
        "City": "Bangalore"
    },
    {
        "Id": "177",
        "Name": "Ziva",
        "City": "Bangalore"
    }
]

function getAllInfo(){
    var col = [];
    for (var i = 0; i<Employees.length; i++) {
        for (var colHead in Employees[i]) {
            if (col.indexOf(colHead) === -1) {
                col.push(colHead);
            }
        }
    }
    var table = document.createElement("table");  // Create table
    var tr = table.insertRow(-1);                 //Row

    for (var i = 0; i < col.length; i++) {
        var th = document.createElement("th");      // Header
        th.innerHTML = col[i];
        tr.appendChild(th);
    }

    for (var i = 0; i < Employees.length; i++) {
        tr = table.insertRow(-1);
        for (var j = 0; j < col.length; j++) {      //Add json data to rows
            var tabCell = tr.insertCell(-1);   
            tabCell.innerHTML = Employees[i][col[j]];
        }
    }

    var tableContainer = document.getElementById("showData");  //Add table to p
    table.className="table table-bordered table-striped";
    table.style.textAlign="center";
    tableContainer.innerHTML = "";
    tableContainer.appendChild(table);
}


function getInfoByName(name){
    var col = [];
    for (var i = 0; i<Employees.length; i++) {
        for (var colHead in Employees[i]) {
            if (col.indexOf(colHead) === -1) {
                col.push(colHead);
            }
        }
    }
    var table = document.createElement("table");  // Create table
    var tr = table.insertRow(-1);                 //Row

    for (var i = 0; i < col.length; i++) {
        var th = document.createElement("th");      // Header
        th.innerHTML = col[i];
        tr.appendChild(th);
    }

    for (var i = 0; i < Employees.length; i++) {
        if(Employees[i][col[1]].localeCompare(name)==0){
            tr = table.insertRow(-1);

            for (var j = 0; j < col.length; j++) {      //Add json data to rows
                var tabCell = tr.insertCell(-1);   
                tabCell.innerHTML = Employees[i][col[j]];
            }
        }
    }

    var tableContainer = document.getElementById("showData");  //Add table to p
    table.className="table table-bordered table-striped";
    table.style.textAlign="center";
    tableContainer.innerHTML = "";
    
    if(table.rows.length>1){
        tableContainer.appendChild(table);
    }else{
        tableContainer.innerHTML = "No data exists under the name <b>"+ name+"<b>";
    }
}