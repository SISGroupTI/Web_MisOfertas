<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Mis Ofertas</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="manifest" href="site.webmanifest">
    <link rel="apple-touch-icon" href="img/logos/MisOfertas-sinLetras.png">
    <!-- Place favicon.ico in the root directory -->

    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="css/styles.css">
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
    <ol class="breadcrumb">
                    <li class="breadcrumb-item active"><a href="index.jsp">Home</a></li>
                    <li class="breadcrumb-item active">Ayuda</li>
                </ol>
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 autosized text-center">
            <h2>Mis Ofertas</h2>
            <h3><i class="fa fa-info" aria-hidden="true"></i>  Ayuda</h3>
        </div>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center">
            <h3>
                En este sitio encontrarás información sobre nuestra plataforma y más.
            </h3>
                <br>
               <p>
                   Mis Ofertas es una plataforma web en la que podrás encontrar miles de ofertas en nuestras tiendas asociadas.
                   Te entregaremos recomendaciones de productos según tus preferencias, te recomendamos que actives la opción de
                   recibir correos desde nuestra dirección al crear tu cuenta, te haremos saber la publicación de nuevas y mejores ofertas para ti
               </p>
        </div>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 autosized text-center">
            <h2 onclick="location.href='index.jsp';"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Volver al inicio</h2>

        </div>
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <p class="panel-title autosized"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Cuentas</p>
                </div>
                <div class="panel-body">
                    <div class="list-group">
                        <button type="button" class="list-group-item" onclick="location.href='ingresar.jsp';">Ingresar</button>
                        <button type="button" class="list-group-item" onclick="location.href='crear_cuenta.jsp';">Crear Cuenta</button>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <p class="panel-title autosized"><span class="glyphicon glyphicon-gift" aria-hidden="true"></span> Ofertas</p>
                </div>
                <div class="panel-body">
                    <div class="list-group">
                        <button type="button" class="list-group-item" onclick="location.href='index.jsp';">Ofertas</button>
                        <!--<button type="button" class="list-group-item" onclick="location.href='ofertas.jsp';">Destacadas</button>
                        <button type="button" class="list-group-item" onclick="location.href='rubros.jsp';">Rubros disponibles</button>
                    --></div>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="_footer.jsp"></jsp:include>





<script src="js/vendor/modernizr-3.5.0.min.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="js/vendor/jquery-3.2.1.min.js"><\/script>')</script>
<script src="js/plugins.js"></script>
<script src="js/main.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/vendor/sweetalert2.min.js"></script>


</body>
</html>
