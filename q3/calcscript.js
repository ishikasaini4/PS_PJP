function display(x) {
    var dis = document.getElementById("result").value;
    if(x==''){
        dis = dis.substring(0,dis.length-1);
    }
    else{
        dis += x;
    }
    document.getElementById("result").value = dis;
}

function clearscreen() {
    var dis = "";
    document.getElementById("result").value = dis;
}

function getresult() {
    var dis = document.getElementById("result").value;
    document.getElementById("result").value = eval(dis);
}