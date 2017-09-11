if(localStorage.getItem("logueado") === null){
    localStorage.setItem("logueado", 0);
}


function ingresar(){
    var correo = document.getElementById("txtIngresoCorreo").value;
    var password = document.getElementById("txtIngresoContrasena").value;

    if(correo === "test@gmail.com" && password === "test"){
        window.location.href = 'index.html';
        localStorage.setItem("logueado", 1);
    }else{
        alert("Credenciales incorrectas");
    }

}

function cerrar_sesion(){
    localStorage.setItem("logueado", 0);
    window.location.href = 'index.html';
}

//SE OCULTAN
if(localStorage.getItem("logueado") == 1){
    document.getElementById("liIngresar").style.display="none";
    document.getElementById("liCrearCuenta").style.display="none";
}

//SE MUESTRAN
if(localStorage.getItem("logueado") == 0){
    document.getElementById("liDescuentos").style.display="none";
    document.getElementById("liMiCuenta").style.display="none";
}
