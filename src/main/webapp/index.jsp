<%@ page session="true" %>
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
            <div class="row">
                <div class="col-md-4 col-sm-4">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-4 col-sm-4 ">
                                <h4>Mis Destacados</h4>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-4 col-sm-4 ">
                                <div class="list-group">
                                    <button type="button" class="list-group-item" onclick="location.href='rubros.jsp';" ><span class="badge">14</span> Linea blanca</button>
                                    <button type="button" class="list-group-item" onclick="location.href='rubros.jsp';"><span class="badge">2</span> Alimentos</button>
                                    <button type="button" class="list-group-item" onclick="location.href='rubros.jsp';"><span class="badge">4</span> Servicios</button>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="container">
                        <div class="row">
                            <div class="col-md-4 col-sm-4 ">
                                <div class="list-group">
                                    <button type="button" class="list-group-item" onclick="location.href='rubros.jsp';"><span class="badge">14</span> Linea blanca</button>
                                    <button type="button" class="list-group-item" onclick="location.href='rubros.jsp';"><span class="badge">2</span> Alimentos</button>
                                    <button type="button" class="list-group-item" onclick="location.href='rubros.jsp';"><span class="badge">4</span> Servicios</button>
                                    <button type="button" class="list-group-item" onclick="location.href='rubros.jsp';"><span class="badge">2</span> Tecnologia</button>
                                    <button type="button" class="list-group-item" onclick="location.href='rubros.jsp';"><span class="badge">6</span> Deportes</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-8 col-sm-8">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title"><b>Oferta destacada</b></h3>
                        </div>
                        <div class="panel-body">
                            <div class="container-fluid">
                                <div clas="row">
                                    <div class="col-md-12 col-sm-8 col-xs-12">
                                        <h4>Hasta 30% de descuento en tu segunda compra de ropa en la marca Adidas</h4>
                                    </div>
                                </div>
                                <div class="row" >
                                    <div class=" col-lg-8 col-md-8 col-sm-8 col-xs-12">
                                        <img src="img/empty.png" alt="" class="img-responsive">
                                    </div>
                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 ">
                                        <h4> Desde $20.900</h4>
                                        <button type="button" class="btn btn-success" onclick="location.href='valorar_oferta.jsp';">Ver Oferta</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs 12">
                    <hr class="style3">
                    <hr class="style3">
                </div>
            </div>

        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-6 col-sm-12">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="container-fluid">
                                <div clas="row">
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <h4>Hasta 30% de descuento en tu segunda compra de ropa en la marca Adidas</h4>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-8 col-sm-8 col-xs-12">
                                        <img src="img/empty.png" alt="" class="img-responsive">
                                    </div>
                                    <div class="col-md-4 col-sm-4 col-xs-12">
                                        <h4> Desde $20.900</h4>
                                        <button type="button" class="btn btn-success">Ver Oferta</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-sm-12">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="container-fluid">
                                <div clas="row">
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <h4>Hasta 30% de descuento en tu segunda compra de ropa en la marca Adidas</h4>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-8 col-sm-8 col-xs-8">
                                        <img src="img/empty.png" alt="" class="img-responsive">
                                    </div>
                                    <div class="col-md-4 col-sm-4 col-xs-4 bottom-align-text">
                                        <button type="button" class="btn btn-success">Ver Oferta</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-6 col-sm-12">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="container-fluid">
                                <div clas="row">
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <h4>Hasta 30% de descuento en tu segunda compra de ropa en la marca Adidas</h4>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-8 col-sm-8 col-xs-8">
                                        <img src="img/empty.png" alt="" class="img-responsive">
                                    </div>
                                    <div class="col-md-4 col-sm-4 col-xs-4 bottom-align-text">
                                        <button type="button" class="btn btn-success">Ver Oferta</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-sm-12">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="container-fluid">
                                <div clas="row">
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <h4>Hasta 30% de descuento en tu segunda compra de ropa en la marca Adidas</h4>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-8 col-sm-8 col-xs-8">
                                        <img src="img/empty.png" alt="" class="img-responsive">
                                    </div>
                                    <div class="col-md-4 col-sm-4 col-xs-4 bottom-align-text">
                                        <button type="button" class="btn btn-success">Ver Oferta</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-6 col-sm-12">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="container-fluid">
                                <div clas="row">
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <h4>Hasta 30% de descuento en tu segunda compra de ropa en la marca Adidas</h4>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-8 col-sm-8 col-xs-8">
                                        <img src="img/empty.png" alt="" class="img-responsive">
                                    </div>
                                    <div class="col-md-4 col-sm-4 col-xs-4 bottom-align-text">
                                        <button type="button" class="btn btn-success">Ver Oferta</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 col-sm-12">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="container-fluid">
                                <div clas="row">
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                        <h4>Hasta 30% de descuento en tu segunda compra de ropa en la marca Adidas</h4>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-8 col-sm-8 col-xs-8">
                                        <img src="img/empty.png" alt="" class="img-responsive">
                                    </div>
                                    <div class="col-md-4 col-sm-4 col-xs-4 bottom-align-text">
                                        <button type="button" class="btn btn-success">Ver Oferta</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-2 col-sm-4 col-xs-12 pull-right">
                    <a href="ofertas.html"> Ver todos...</a>

                </div>
            </div>
        </div>
        <br>


        

<jsp:include page="_footer.jsp"></jsp:include>



        <script src="js/vendor/modernizr-3.5.0.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-3.2.1.min.js"><\/script>');</script>
        <script src="js/plugins.js"></script>
        <script src="js/main.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/vendor/sweetalert2.min.js"></script>


    </body>
</html>
