var xhttp;
function ajax(method,url,Function) {
    if (window.XMLHttpRequest) {
        // 针对现代浏览器的代码
        xhttp = new  XMLHttpRequest();
    } else {
        // 针对 IE6、IE5 的代码
        xhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xhttp.onreadystatechange = Function;
    xhttp.open(method,url, true);
    xhttp.send();
}

