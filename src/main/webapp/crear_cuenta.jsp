<!doctype html>
<html>
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
            <h3>Crear Cuenta</h3>
            <hr>
        </div>

    </div>

    <div class="row">
        <div class="col-lg-4 col-md-4 col-sm-8 col-xs-12">
            <form data-toggle="validator" role="form">
                <div class="form-group">
                    <label for="txtCrearNombre">Nombre*</label>
                    <input type="text" class="form-control" id="txtCrearNombre" placeholder="Pedro" required>
                </div>
                <div class="form-group">
                    <label for="txtCrearApellidos">Apellidos*</label>
                    <input type="text" class="form-control" id="txtCrearApellidos" placeholder="Piedra" required>
                </div>
                <div class="form-group">
                    <label for="txtRut">Rut*</label>
                    <input type="text" class="form-control" id="txtRut" placeholder="18607283-9" required>
                </div>
                <div class="form-group">
                    <label for="txtIngresoCorreo">Correo*</label>
                    <input type="email" class="form-control" id="txtIngresoCorreo" placeholder="misofertas@mf.cl" required> 
                </div>
                <div class="form-group">
                    <label for="txtCrearContrasena">Contraseña*</label>
                    <input type="password" class="form-control" id="txtCrearContrasena" placeholder="*************" required>
                </div>
                <div class="form-group">
                    <label for="txtCrearVerificar">Verificar contraseña*</label>
                    <input type="password" class="form-control" id="txtCrearVerificar" placeholder="*************" required>
                </div>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" id="chkRecibirOfertas" > Deseo recibir notificaciones de ofertas a mi correo
                    </label>
                </div>
                
                <button type="button" class="btn btn-success pull-right btningresar" onclick="crea_cuenta()">Crear cuenta</button>
            </form>
        </div>
    </div>
</div>
<br>









<script src="js/vendor/modernizr-3.5.0.min.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="js/vendor/jquery-3.2.1.min.js"><\/script>');</script>
<script src="js/plugins.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/main.js"></script>
<script src="js/vendor/sweetalert2.min.js"></script>
<script src="js/Validator.js"></script>



</body>
</html>
