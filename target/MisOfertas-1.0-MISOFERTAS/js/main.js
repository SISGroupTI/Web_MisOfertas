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
            swal({
                title: 'Verifica tus crendenciales',
                text: 'Intenta nuevamente'
            });
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
       
   if(nombre!=="" && apellido!=="" && correo!=="" && contrasena!=="" && verificarContrasena!=="" && rut!==""){
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
             swal({
                 title: 'Cuenta Creada',
                 text: 'Redireccionando a la pagina de ingreso',
                 timer: 1000
               }).then(
                 function () {},
                 // handling the promise rejection
                 function (dismiss) {
                   if (dismiss === 'timer') {
                     window.location.href="ingresar.jsp";
                   }
                 }
            );
        });
   }    
}
function modificarCuenta(idConsumidor){
    if(validarDatosModificarCuenta()){
        var nombre = document.getElementById("txtCrearNombre").value;
        var apellido = document.getElementById("txtCrearApellidos").value;
        var contrasena = document.getElementById("txtCrearContrasena").value;
        var recibirOferta = document.getElementById("chkRecibirOfertas");
        var recibeOferta = 0;
        if(recibirOferta.checked){
               recibeOferta = 1;
        }
        $.post("/MisOfertas/ModificarConsumidorServlet",{
               idConsumidor:idConsumidor,
                nombre:nombre,
                apellido:apellido,
                contrasena:contrasena,
                recibeOferta:recibeOferta
        },function(data){
               console.log(data);
               swal({
                   title: 'Cuenta Modificada',
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
        });
    }
}
function toRubros(idRubro){
    window.location.href='rubros.jsp?Id='+idRubro; 
}
function toRubrosRegistrarTrack(idRubro,idConsumidor){
    var id = idRubro;
    var idCons = idConsumidor;
  
    $.post("/MisOfertas/TrackRubroServlet",{
        idRubro:id,
        idConsumidor:idCons
    },function(data){
        
    });
    window.location.href='rubros.jsp?Id='+id;
}
function mostrarDescuento(idCertificado){
    $.post("/MisOfertas/MostrarDescuentoServlet",{
        idCertificado:idCertificado
    },function(data){
    });
}

function verificarCuponGenerado(idCertificado){
    $.post("/MisOfertas/VerificarCuponGeneradoServlet",{
        idCertificado:idCertificado
    },function(data){
        var estado = data; 
        if(data==="disponible"){
            mostrarDescuento(idCertificado);
        }else if(data==="generado"){
            swal(
            'Solo es posible generar un cup&oacute;n de descuento por mes',
            '',
            'error'
          );
        }
        else if(data==="nohaycupon"){
            swal(
            'No tienes puntos para generar un cup&oacute;n de descuento',
            'Compra productos con nuestras ofertas y valoralas para generar puntos',
            'info'
          );
        }
    });
    
}
//------------------------------VALIDAR RUT-----------------------------------
function checkRut(rut) {
    // Despejar Puntos
    var valor = rut.value.replace('.','');
    // Despejar Guión
    valor = valor.replace('-','');
    
    // Aislar Cuerpo y Dígito Verificador
    cuerpo = valor.slice(0,-1);
    dv = valor.slice(-1).toUpperCase();
    
    // Formatear RUN
    rut.value = cuerpo + '-'+ dv
    
    // Si no cumple con el mínimo ej. (n.nnn.nnn)
    if(cuerpo.length < 7) { rut.setCustomValidity("RUT Incompleto"); return false;}
    
    // Calcular Dígito Verificador
    suma = 0;
    multiplo = 2;
    
    // Para cada dígito del Cuerpo
    for(i=1;i<=cuerpo.length;i++) {
    
        // Obtener su Producto con el Múltiplo Correspondiente
        index = multiplo * valor.charAt(cuerpo.length - i);
        
        // Sumar al Contador General
        suma = suma + index;
        
        // Consolidar Múltiplo dentro del rango [2,7]
        if(multiplo < 7) { multiplo = multiplo + 1; } else { multiplo = 2; }
  
    }
    
    // Calcular Dígito Verificador en base al Módulo 11
    dvEsperado = 11 - (suma % 11);
    
    // Casos Especiales (0 y K)
    dv = (dv == 'K')?10:dv;
    dv = (dv == 0)?11:dv;
    
    // Validar que el Cuerpo coincide con su Dígito Verificador
    if(dvEsperado != dv) { rut.setCustomValidity("RUT Invalido"); return false; }
    
    // Si todo sale bien, eliminar errores (decretar que es válido)
    rut.setCustomValidity('');
}

function Valida_Rut( Objeto )
{
	var tmpstr = "";
	var intlargo = Objeto.value
	if (intlargo.length> 0)
	{
		crut = Objeto.value
		largo = crut.length;
		if ( largo <2 )
		{
			
			return false;
		}
		for ( i=0; i <crut.length ; i++ )
		if ( crut.charAt(i) !== ' ' && crut.charAt(i) !== '.' && crut.charAt(i) !== '-' )
		{
			tmpstr = tmpstr + crut.charAt(i);
		}
		rut = tmpstr;
		crut=tmpstr;
		largo = crut.length;
 
		if ( largo> 2 )
			rut = crut.substring(0, largo - 1);
		else
			rut = crut.charAt(0);
 
		dv = crut.charAt(largo-1);
 
		if ( rut === null || dv === null )
		return 0;
 
		var dvr = '0';
		suma = 0;
		mul  = 2;
 
		for (i= rut.length-1 ; i>= 0; i--)
		{
			suma = suma + rut.charAt(i) * mul;
			if (mul === 7)
				mul = 2;
			else
				mul++;
		}
 
		res = suma % 11;
		if (res===1)
			dvr = 'k';
		else if (res===0)
			dvr = '0';
		else
		{
			dvi = 11-res;
			dvr = dvi + "";
		}
 
		if ( dvr !== dv.toLowerCase() )
		{
			
			return false;
		}
		
		return true;
	}
}


function validarDatosCrearCuenta(){
    var regOnlyLetters=new RegExp("^[a-zA-Z_áéíóúñ\s]*$");
    var regEmail = new RegExp("^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$");
    var regRut=new RegExp("^([0-9]+-[0-9K])$");
    var myRegexp = /^(?=(?:.*\d){1})(?=(?:.*[A-Z]){1})(?=(?:.*[a-z]){1})(?=(?:.*[0-9]){1})\S{6,}$/g;
    var myRegexp1 = /^(?=(?:.*\d){1})(?=(?:.*[A-Z]){1})(?=(?:.*[a-z]){1})(?=(?:.*[0-9]){1})\S{6,}$/g;
    var regPassword = new RegExp("^(?=(?:.*\d){1})(?=(?:.*[A-Z]){1})(?=(?:.*[a-z]){1})(?=(?:.*[0-9]){1})\S{6,}$");
    
    
    var nombre = document.getElementById("txtCrearNombre").value;
    var apellido = document.getElementById("txtCrearApellidos").value;
    var correo = document.getElementById("txtIngresoCorreo").value;
    var contrasena = document.getElementById("txtCrearContrasena").value;
    var verificarContrasena = document.getElementById("txtCrearVerificar").value;
    var rut = document.getElementById("txtRut").value;
    
    var cont = 0;
    if(!regOnlyLetters.test(nombre)){
        cont+=1;
    }
    if(!regOnlyLetters.test(apellido)){
        cont+=1;
    }
    if(!regEmail.test(correo)){
        cont+=1;
    }
    if(contrasena==="" || verificarContrasena===""){
        cont+=1;
    }else{
        if(contrasena!==verificarContrasena){ 
            cont+=1;
        }else{
            if(!myRegexp.exec(contrasena)){
                cont+=1;
            }
            if(!myRegexp1.exec(verificarContrasena)){
                cont+=1;
            }  
        }
    }  
    if(!regRut.test(rut)){
            cont+=1;
    }else{
        if(!Valida_Rut(document.getElementById("txtRut"))){   
            cont+=1;
        }
    }
    return (cont===0);
}

function validarDatosIngresarCuenta(){
    var regEmail = new RegExp("^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$");
    var regPassword = new RegExp("^(?=(?:.*\d){1})(?=(?:.*[A-Z]){1})(?=(?:.*[a-z]){1})(?=(?:.*[0-9]){1})\S{6,}$");
    var correo = document.getElementById("txtIngresoCorreo").value;
    var password = document.getElementById("txtIngresoContrasena").value;
    
    var myRegexp = /^(?=(?:.*\d){1})(?=(?:.*[A-Z]){1})(?=(?:.*[a-z]){1})(?=(?:.*[0-9]){1})\S{6,}$/g;
    
    var cont = 0;
    if(!regEmail.test(correo)){
        cont+=1;
    }
    if(password===""){
        cont+=1;
    }else{
        if(!myRegexp.exec(password)){
            cont+=1;
        }
       
    }
    return (cont===0);
}

function validarDatosModificarCuenta(){
    var regOnlyLetters=new RegExp("^[a-zA-Z_áéíóúñ\s]*$");
    
    
    var nombre = document.getElementById("txtCrearNombre").value;
    var apellido = document.getElementById("txtCrearApellidos").value;
    var contrasena = document.getElementById("txtCrearContrasena").value;
    var verificarContrasena = document.getElementById("txtCrearVerificar").value;
    
    var cont = 0;
    if(!regOnlyLetters.test(nombre)){
        
        cont+=1;
    }
    if(!regOnlyLetters.test(apellido)){
        
        cont+=1;
    }
    if(contrasena==="" || verificarContrasena===""){
        cont+=1;
    }else{
        if(contrasena!==verificarContrasena){ 
            cont+=1;
        }
    } 
    return (cont===0);
}