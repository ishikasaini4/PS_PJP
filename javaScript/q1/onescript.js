function getResult(){
    var op = getRadioValue();
    var a = parseInt(document.getElementById("n1").value);
    var b = parseInt(document.getElementById("n2").value);
    var result = -1;
   
    if(op==1){
        result = a+b;
    }else if(op==2){
        result = a-b;
    }else if(op==3){
        result = a*b;
    }else{
        result = a/b;
    }   
    document.getElementById("res").innerHTML = result;
}

 function getRadioValue(){
    var radios = document.getElementsByName("operation");
    for( var i = 0; i<radios.length; i++){
        if(radios[i].checked){
            return radios[i].value;
        }
    }
}