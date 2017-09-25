

function ingresar(){
    var correo = document.getElementById("txtIngresoCorreo").value;
    var password = document.getElementById("txtIngresoContrasena").value;
    
    $.post('/MisOfertas/LoginConsumidorServlet',{
        correo:correo,
        password:password
    },function(data){
        console.log(data);
        if(data==="error"){
            swal(
                'Verifica tus crendenciales',
                'Intenta nuevamente',
                'error'
            );
        }else{
           window.location.href = "index.jsp";
        }
        
    });
   

}

function cerrar_sesion(){
    $.post("/MisOfertas/LogOutConsumidorServlet",{},function(data){
        console.log(data);
        if(data==="logout"){
            swal({
                title: 'Sesion cerrada',
                text: 'Redireccionando a la pagina principal',
                timer: 1000
              }).then(
                function () {},
                // handling the promise rejection
                function (dismiss) {
                  if (dismiss === 'timer') {
                    window.location.href="index.jsp";
                  }
                }
            );      
        }
    });
    
}

function crea_cuenta(){
    var nombre = document.getElementById("txtCrearNombre").value;
    var apellido = document.getElementById("txtCrearApellidos").value;
    var correo = document.getElementById("txtIngresoCorreo").value;
    var contrasena = document.getElementById("txtCrearContrasena").value;
    var verificarContrasena = document.getElementById("txtCrearVerificar").value;
    var recibirOferta = document.getElementById("chkRecibirOfertas");
    var rut = document.getElementById("txtRut").value.split("-");
    
    var recibeOferta = 0;
    if(recibirOferta.checked){
        recibeOferta = 1;
    }
    
    var run = rut[0];
    var dv = rut[1];
    
    $.post("/MisOfertas/RegisterConsumidorServlet",{
        nombre:nombre,
        apellido:apellido,
        correo:correo,
        contrasena:contrasena,
        recibeOferta:recibeOferta,
        run:run,
        dv:dv
    },function(data){
        console.log(data);
    });
    
}


function toRubros(idRubro){
    alert(idRubro);
}
