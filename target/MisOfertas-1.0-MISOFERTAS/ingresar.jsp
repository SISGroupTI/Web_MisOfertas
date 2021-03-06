<!doctype html>
<html lang="">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Mis Ofertas - Ingresar</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="manifest" href="site.webmanifest">
    <link rel="apple-touch-icon" href="img/logos/MisOfertas-sinLetras.png">
    <!-- Place favicon.ico in the root directory -->

    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="css/footer.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/sweetalert2.css"/>
</head>
<body>
<!--[if lte IE 9]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
<![endif]-->

<jsp:include page="_header.jsp"></jsp:include>


<div class="container">
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 autosized">
             <h3 class="labelIngresar">Ingresar</h3> o <a href="crear_cuenta.jsp">crea una cuenta</a>
            <hr>
        </div>

    </div>

    <div class="row">
        <div class="col-lg-4 col-md-4 col-sm-8 col-xs-12">
            <form id="formIngreso" role="form" data-toggle="validator">
                <div class="form-group">
                    <label for="txtIngresoCorreo">Correo</label>
                    <input type="email" class="form-control" id="txtIngresoCorreo" pattern="^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,3})$" 
                           placeholder="misofertas@mf.cl" data-pattern-error="Verifica el correo ingresado" required
                           data-required-error="Completa este campo">
                    <div class="help-block with-errors"></div>
                </div>
                <div class="form-group">
                    <label for="txtIngresoContrasena">Contrase�a</label>
                    <input type="password" class="form-control" id="txtIngresoContrasena" pattern="^(?=(?:.*\d){1})(?=(?:.*[A-Z]){1})(?=(?:.*[a-z]){1})(?=(?:.*[0-9]){1})\S{6,}$"
                           placeholder="*************" data-minlength="6" data-required-error="Completa este campo" required
                           data-pattern-error="La contrase�a debe estar compuesta de al menos : 1 letra mayuscula, 1 numero y de minimo 6 caracteres" 
                           data-error="M�nimo 6 caracteres">
                    <div class="help-block with-errors"></div>
                </div>
                <button type="button" id="btnIngresar" class="btn btn-success pull-right btningresar">Ingresar</button>
            </form>
        </div>
    </div>
</div>
<br>









<script src="js/vendor/modernizr-3.5.0.min.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="js/vendor/jquery-3.2.1.min.js"><\/script>');</script>
<script src="js/plugins.js"></script>
<script src="js/main.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/vendor/sweetalert2.min.js"></script>
<script src="js/Validator.js"></script>
<script>
    $(document).ready(function () {
        $("#btnIngresar").click(function(e){      
            if(validarDatosIngresarCuenta()){
                ingresar();
            }            
        });
    });
    
</script>
</body>



</html>
