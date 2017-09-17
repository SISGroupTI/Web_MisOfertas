<!doctype html>
<html class="no-js" lang="">
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
    <link rel="stylesheet" href="css/footer.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/sweetalert2.css"/>
    <style>
        .error-template {padding: 40px 15px;text-align: center;}
        .error-actions {margin-top:15px;margin-bottom:15px;}

        div img{
            align-content: center;
        }
    </style>


</head>
<body>
<!--[if lte IE 9]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
<![endif]-->

<jsp:include page="_header.jsp"></jsp:include>




<div class="container">
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <div class="error-template ">
                <img src="img/logos/MisOfertas-Letras.png" alt="" class="img-responsive img404 center-block" >
                <h1>Error 404 - página no encontrada</h1>
                <div class="error-details">
                   <p>Lo sentimos, pero la página que estas buscando no existe o se ha eliminado.</p>
                    <p>Por favor comprueba la dirección que has introducido.</p>
                </div>
                <div class="error-actions">
                    <a href="#">Volver a la pagina anterior</a>
                </div>
            </div>
        </div>
    </div>
</div>


<footer>
    <div class="footer" id="footer">
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-6 col-sm-4 col-xs-12">
                    <h3> Mis Ofertas </h3>
                    <ul>
                        <li>
                            Mis Ofertas es una forma fácil de obtener grandes ofertas y
                            de descubrir nuevas oportunidades que las tiendas ofrecen. Entre nuestras
                            ofertas puedes encontrar avisos de ropa, linea blanca, deporte, musica y
                            muchos más
                        </li>

                    </ul>
                </div>

                <div class="col-lg-4 col-md-6 col-sm-6 col-xs-12 pull-right">
                    <h3 class=""> Contacto </h3>
                    <ul>
                        <li> <a href="#"> <i class="fa fa-phone">  </i> 2245123412</a> </li>
                        <li> <a href="#"> <i class="fa fa-envelope-o">  </i> misofertas@facontacto.cl  </a> </li>
                        <li> <a href="#"> <i class="fa fa-map-marker">   </i> DuocUC - Sede Puente Alto, Santiago, Chile  </a> </li>
                    </ul>
                </div>
            </div>
            <!--/.row-->
        </div>
        <!--/.container-->
    </div>
    <!--/.footer-->

    <div class="footer-bottom">
        <div class="container">
            <p class="pull-left"> © 2017. Mis Ofertas. Todos los derechos reservados </p>
            <div class="pull-right">
                <ul class="nav nav-pills">
                    <li role="separator"><a href="index.jsp">Inicio</a></li>
                    <li role="separator"><a href="ayuda.jsp">Ayuda</a></li>
                    <li role="separator"><a href="ingresar.jsp">Ingresar</a></li>
                    <li role="separator"><a href="crear_cuenta.jsp">Registrar</a></li>
                </ul>
            </div>
        </div>
    </div>
    <!--/.footer-bottom-->
</footer>




<script src="js/vendor/modernizr-3.5.0.min.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="js/vendor/jquery-3.2.1.min.js"><\/script>')</script>
<script src="js/plugins.js"></script>
<script src="js/main.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/vendor/sweetalert2.min.js"></script>


</body>
</html>
