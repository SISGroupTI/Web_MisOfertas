function validaCorreo(value){
    let correo = document.getElementById(value).value;
    if(correo.length > 0){
        $.post("/MisOfertas/VerificarCorreoConsumidorServlet",{
            correo:correo
        },function(data){
            if(data ===  "invalidate"){
                document.getElementsByClassName("btningresar")[0].disabled=true;
                swal(
                    'Ya existe una cuenta vinculada a este correo electronico',
                    'solo es posible una cuenta por correo',
                    'warning'
                  );
            }else if(data === "validate"){
                document.getElementsByClassName("btningresar")[0].disabled=false;
            }
        });
    }
}

function ingresar(){
    let correo = document.getElementById("txtIngresoCorreo").value;
    let password = document.getElementById("txtIngresoContrasena").value;
    if(correo.length > 0 && password.length > 0){
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
            document.getElementById("txtIngresoContrasena").value = "";
           }else if(data==="success"){
              window.location.href = "index.jsp";   
           }

       });   
    }
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
       
    validaCorreo("txtIngresoCorreo");
   
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
        swal(
            'Su cuenta se ha creado satisfactoriamente',
            '',
            'success'
        );
    });
    
}


function toRubros(idRubro){
    var id = idRubro;
   
    window.location.href='rubros.jsp?Id='+id;
     
}

function toRubrosRegistrarTrack(idRubro,idConsumidor)
{
    var id = idRubro;
    var idCons = idConsumidor;
    //alert("idRubro: "+id+" idCons"+idCons);
    $.post("/MisOfertas/TrackRubroServlet",{
        idRubro:id,
        idConsumidor:idCons
    },function(data){
        console.log(data);
    });
    window.location.href='rubros.jsp?Id='+id;
}

function mostrarDescuento(idCertificado)
{
    //alert(""+idCertificado);
    $.post("/MisOfertas/MostrarDescuentoServlet",{
        idCertificado:idCertificado
    },function(data){
        
        console.log("esta es mi data "+ data);
        //window.open('data:C:/Users/Ian Cardenas/AppData/Local/Temp/descuento20171019014424.pdf','_blank');
        //window.open("sourceMappingURL='C:/Users/Ian Cardenas/AppData/Local/Temp/descuento20171019014424.pdf'",'_blank');
    });
}
