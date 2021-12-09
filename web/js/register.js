var usernameValidate=false;
function checkName() {
    var username=document.getElementById("username").value;
    if (username!=null&&""!=username){
    ajax("POST","CheckNameController?username="+username,
        function (){
    if (xhttp.readyState == 4 && xhttp.status == 200) {
        txt=xhttp.responseText;
        if (txt=="true"){
            document.getElementById("havingname").innerText ="该用户名已被注册，请重新输入";
            document.getElementById("havingname").style.color="red";
        }
        else {
            document.getElementById("havingname").innerText ="";
        }
    }
})
}
    else{
    }
}
function validateSubmit(){
    var username=document.getElementById("username").value;
    if (username != null && "" != username) {
        /*      ajax("POST", "CheckNameController?username=" + username,
                  function () {
                      if (xhttp.readyState == 4 && xhttp.status == 200) {
                          txt = xhttp.responseText;
                          console.log(txt);
                          if (txt == "true") {
                              usernameValidate = true;
                          } else {
                              usernameValidate =false ;
                          }
                      }
                  }, false)
          }*/
        var xmlhttp
        if (window.XMLHttpRequest) {
            xmlhttp = new XMLHttpRequest();
        } else {
            // 针对 IE6、IE5 的代码
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        xmlhttp.open("GET", "CheckNameController?username=" + username, false);
        xmlhttp.send();
        txt = xmlhttp.responseText;
        console.log(txt);
        if (txt == "true") {
            usernameValidate = false;
        } else {
            usernameValidate = true;
        }
        console.log(usernameValidate);
    }
    if (usernameValidate==false){
        alert("注册失败！！");
    }
    return usernameValidate;
}