<!doctype html>
<%@ page session="true" %>

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
        <link rel="stylesheet" href="css/styles.css">
        <link rel="stylesheet" href="css/footer.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/sweetalert2.css"/>
        <link rel="stylesheet" href="css/fileinput-rtl.min.css"/>
        <link rel="stylesheet" href="css/fileinput.min.css"/>
        <link rel="stylesheet" href="css/star-rating.min.css"/>
    </head>
    <body>
        <!--[if lte IE 9]>
        <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
        <![endif]-->

        <jsp:include page="_header.jsp"></jsp:include>



            <div class="container">
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title"><b>Valora esta oferta</b></h3>
                            </div>
                            <div class="panel-body">
                                <div class="container-fluid">
                                    <div clas="row">
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-10">
                                            <h3 class="titleOferta">
                                                <!--Pack de 3 o 6 botellas de 1,9 litros de Ariel concentrado Power Liquid. Incluye despacho-->
                                            </h3>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
                                            <!--<img src="img/empty.png" alt="" class="img-responsive">-->
                                            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                                                <!-- Indicators -->
                                                <ol class="carousel-indicators">
                                                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                                                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                                                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                                                </ol>

                                                <!-- Wrapper for slides -->
                                                <div class="carousel-inner" role="listbox">
                                                    <div class="item active">
                                                        <img src="img/empty.png" class="img-responsive">
                                                    </div>
                                                    <div class="item">
                                                        <img src="img/empty.png" class="img-responsive">
                                                    </div>
                                                </div>

                                                <!-- Controls -->
                                                <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                                                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>

                                                </a>
                                                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                                                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>

                                                </a>
                                            </div>


                                        </div>
                                        <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 col-xs-offset-0 text-center" align="center">
                                            <h4 class="priceOferta"> <!--$5.990--></h4>
                                            <div class="panel panel-default panelDetalleOferta ">
                                                <div class="panel-body titleDetalleOferta">
                                                    Oferta disponible hasta el <h5 class="fechaTermino"></h5>
                                                </div>
                                            </div>
                                            <div>
                                                <h4><b>Valora esta oferta</b></h4>
                                                <input id="input-1" name="input-1" class="rating rating-loading" data-min="0" data-max="3" data-step="1">
                                                <!--<img src="img/3-star-rating.jpg" alt="" class="img-responsive imgEstrellas center-block" onclick="mostrarModal()">   
                                            --></div>

                                        </div>
                                    </div>
                                </div>
                                <br>
                                <div class="container-fluid">
                                    <div class="row">
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                            <div class="panel panel-default">
                                                <div class="panel-body panelDetalleOferta">
                                                    <p> <b>Caracteristicas:</b></p>
                                                    <p>
                                                    <ul>
                                                        <li><h5 class="descripcion"></h5></li>
                                                    </ul>
                                                    </p>
                                                    <p> <b>Letra Chica</b></p>
                                                    <p>
                                                    <ul>
                                                        <li><h5 class="condiciones"></h5></li>
                                                    </ul>
                                                    </p>
                                                </div>
                                            </div>
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
                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
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
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 titleOferta">
                                            <h4>Hasta 30% de descuento en tu segunda compra de ropa en la marca Adidas</h4>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-8 col-sm-8 col-xs-12 imgOferta">
                                            <img src="img/empty.png" alt="" class="img-responsive imgOfertaMenu">
                                        </div>
                                        <div class="col-md-4 col-sm-4 col-xs-12 priceOferta">
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
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 titleOferta">
                                            <h4>Hasta 30% de descuento en tu segunda compra de ropa en la marca Adidas</h4>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-8 col-sm-8 col-xs-12 imgOferta">
                                            <img src="img/empty.png" alt="" class="img-responsive imgOfertaMenu">
                                        </div>
                                        <div class="col-md-4 col-sm-4 col-xs-12 priceOferta">
                                            <h4> Desde $20.900</h4>
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
                        <a href="#"> Ver más...</a>

                    </div>
                </div>
            </div>
            <br>


            <!-- MODAL CONTENT !-->
            <div class="modal fade" tabindex="-1" role="dialog" id="myModal">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title">
                                <h4 class="idOferta" hidden="true"></h4>
                                <h4 class="idPuntuacion"  hidden="true"></h4>
                            </h4>
                        </div>
                        <div class="modal-body">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="col-lg-4 col-md-4 col-sm-8 col-xs-12 file-loading">
                                        <input type="file" id="upload" class="btn btn-primary" accept="image/*"/>
                                    </div>
                                </div>
                                <br>
                                <!--<div class="row">
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" >
                                        <img src="img/empty.png" alt="" class="img-responsive center-block" id="imgBoleta">
                                    </div>
                                </div>-->
                                <br>
                                <div class="row">
                                    <%
                                       if(session.getAttribute("idConsumidor")!=null){ 
                                    %>
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 ">
                                        <button type="button" class="btn btn-primary pull-right" onclick="sendValoracion()">Subir</button>
                                    </div>
                                    <%
                                        }else{
                                    %>
                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 ">
                                        <button type="button" class="btn btn-primary pull-right" onclick="sendValoracion()" disabled="true">Subir</button>
                                        <h5>Se requiere iniciar Sesion</h5>
                                    </div>
                                    <%
                                        }
                                    %>
                                </div>
                            </div>

                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
                            <!--<button type="button" class="btn btn-primary">Save changes</button>-->
                        </div>
                    </div>
                </div>
            </div>

        <jsp:include page="_footer.jsp"></jsp:include>



        <script src="js/vendor/modernizr-3.5.0.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-3.2.1.min.js"><\/script>');</script>
        <script src="js/plugins.js"></script>
        <script src="js/main.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/vendor/sweetalert2.min.js"></script>
        <script src="js/Helpers.js"></script>
        <script src="js/fileinput.min.js"></script>
        <script src="js/star-rating.min.js"></script>
        <script>
            function mostrarModal(selected) {
                const idPuntuacion = document.getElementsByClassName("idPuntuacion");
                idPuntuacion[0].textContent = selected;
                //console.log("selected-->"+selected);
                //const idOferta = document.getElementsByClassName("idOferta"); 
                //console.log("idOferta-->"+idOferta[0].textContent);
                //console.log("idConsumidor-->"+<%--<%=session.getAttribute("idConsumidor")%>--%>);
                $('#myModal').modal('show');
            }

            function sendValoracion()
            {
                var files = $('#upload').fileinput('getFileStack')[0]; // returns file list selected
                const idOferta = document.getElementsByClassName("idOferta");
                const idPuntuacion = document.getElementsByClassName("idPuntuacion");
                var idConsumidor = <%=session.getAttribute("idConsumidor")%>;
                var data = new FormData(),
                    xhr = new XMLHttpRequest();

                xhr.onloadstart = function () {
                  console.log('Empieza la subida de: ', files.name);
                };

                xhr.onerror = function (e) {
                  console.log( 'Algo fue mal en la subida :(' );
                };

                data.append('file', files, files.name);
                data.append('idOferta',idOferta[0].textContent);
                data.append('idConsumidor',idConsumidor);
                data.append('idPuntuacion',idPuntuacion[0].textContent);
                xhr.open('POST', './RegistrarValoracionServelet');
                xhr.send(data);
                console.log(files);
            }

            $(document).ready(function () {
                const oferta = findGetParameter("Oferta");
                $.post("SelectOfertaPorIdServlet", {
                    idOferta: oferta
                }, function (data) {
                    console.log(data);

                    if (data.length > 0) {
                        const titulo = document.getElementsByClassName("titleOferta");
                        const precio = document.getElementsByClassName("priceOferta");
                        const modaltitle = document.getElementsByClassName("modal-title");
                        const descripcion = document.getElementsByClassName("descripcion");
                        const idOferta = document.getElementsByClassName("idOferta");                            
                        const fechaTermino = document.getElementsByClassName("fechaTermino");
                        const condiciones = document.getElementsByClassName("condiciones");
                        modaltitle[0].textContent = data[0]["TITULO_OFERTA"];
                        titulo[0].textContent = data[0]["TITULO_OFERTA"];
                        precio[0].textContent = separarMiles(data[0]["PRECIO"]);
                        fechaTermino[0].textContent = data[0]["FECHA_FINALZACION"];
                        condiciones[0].textContent = data[0]["CONDICIONES"];
                        descripcion[0].textContent = data[0]["DESCRIPCION_OFERTA"];
                        idOferta[0].textContent = data[0]["ID_OFERTA"];
                    }
                });
            });
            $("#upload").fileinput({
                previewFileType: "image",
                browseClass: "btn btn-primary",
                browseLabel: "Seleccione Boleta",
                browseIcon: "<i class=\"glyphicon glyphicon-picture\"></i> ",
                removeClass: "btn btn-danger",
                removeLabel: "Delete",
                removeIcon: "<i class=\"glyphicon glyphicon-trash\"></i> ",
                uploadClass: "btn btn-info",
                uploadLabel: "Upload",
                uploadIcon: "<i class=\"glyphicon glyphicon-upload\"></i> ",
                showUpload: false,
                minFileCount: 1,
                maxFileCount: 1,
                uploadAsync: true,
                //allowedFileTypes: ['*.jpg']
            });
            $(document).ready(function () {
                $.post("SelectOfertasServlet", {}, function (data) {
                    const titles = document.getElementsByClassName("titleOferta");
                    const imgOferta = document.getElementsByClassName("imgOferta");
                    const priceOferta = document.getElementsByClassName("priceOferta");

                    console.log(data);
                    //MEJORAR CONDICION
                    const aux = (titles.length === data.length) ? data.length : data.length;
                    //console.log(aux);

                    for (var i = 0; i < aux; i++) {
                        let idOferta = data[i]["ID_OFERTA"];
                        titles[i].innerHTML = "<h4>" + data[i]["TITULO_OFERTA"] + "</h4>";
                        var imagen = imgOferta[i].children;
                        imagen[0].src = "img/DHhl9jtWsAQLzFt.jpg";
                        var price = priceOferta[i].children;
                        price[0].innerHTML = "<h4>" + separarMiles(data[i]["PRECIO"]) + "</h4>";
                        price[1].addEventListener("click", function () {
                            //alert(idOferta);
                            window.location.href = 'valorar_oferta.jsp?Oferta=' + idOferta;

                        }, false);
                    }

                });
            });
            $('.rating,.kv-gly-star,.kv-gly-heart,.kv-uni-star,.kv-uni-rook,.kv-fa,.kv-fa-heart,.kv-svg,.kv-svg-heart').on('change', function () {
                //console.log('Rating selected: ' + $(this).val());
                var idSelected =$(this).val();
                mostrarModal(idSelected);
            });
        </script>
    </body>
</html>
