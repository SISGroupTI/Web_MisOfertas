<%@ page session="true" %>
<!doctype html>
<html class="no-js" lang="">
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
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 autosized text-center">
            <h2>Mis Cupones</h2>
        </div>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center">
            <h3>
                Cada valoración de oferta te genera 10 puntos acumulables por mes,
                que podrás cambiar en cupones de descuentos en rubros de las tiendas disponibles
                <br>
                <br>
                <button type="button" class="btn btn-success btncupon">Descargar cupón</button>
                <br>
                <h4>Disponible para el mes de Agosto de 2017</h4>
                <hr>
            </h3>
        </div>

    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 autosized text-center">
            <h2>Ultimos cupones</h2>
        </div>
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="table-responsive">
                <table id="datatable" class="table table-striped table-bordered" cellspacing="0" width="100%">
                    <thead>
                    <tr>
                        <th>Mes de emisión</th>
                        <th>Rubros disponibles</th>
                        <th>Puntos generados</th>
                        <th>Descuento</th>
                        <th>Tope</th>
                        <th>Ver</th>
                    </tr>
                    </thead>

                    <tfoot>
                    <tr>
                        <th>Mes de emisión</th>
                        <th>Rubros disponibles</th>
                        <th>Puntos generados</th>
                        <th>Descuento</th>
                        <th>Tope</th>
                        <th>Ver</th>
                    </tr>
                    </tfoot>

                    <tbody>
                    <tr>
                        <td>29 de Junio 2017</td>
                        <td>Alimentos</td>
                        <td>90</td>
                        <td>5%</td>
                        <td>$10.000</td>

                        <td><p data-placement="top" data-toggle="tooltip" title="Edit"><button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-search"></span></button></p></td>
                    </tr>

                    <tr>
                        <td>30 de Julio 2017</td>
                        <td>Alimentos, Electronica, Linea Blanca</td>
                        <td>500</td>
                        <td>10%</td>
                        <td>$15.000</td>

                        <td><p data-placement="top" data-toggle="tooltip" title="Edit"><button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-search"></span></button></p></td>
                    </tr>
                    </tbody>
                </table>
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
