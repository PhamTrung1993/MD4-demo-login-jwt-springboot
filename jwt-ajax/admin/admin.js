let ob = localStorage.getItem("ob");
let token = "";
console.log(ob);
if (ob == null){
    window.location.href = "dangnhap/dangnhap.html"
}
else {
// phan tich lai ma object
console.log("dang nhap roi");
    // lay ra token -> gui request
let object = JSON.parse(ob);
token = object.accessToken;
console.log(token);
}

function dangxuat(){
    localStorage.removeItem("ob");
    //goi API login
}