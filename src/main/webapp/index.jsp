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

        <jsp:include page="_header.jsp"></jsp:include>

        
            <div class="container">
                <ol class="breadcrumb">
                    <li class="breadcrumb-item active"><a href="index.jsp">Home</a></li>
                </ol>
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
                                    <div class="list-group" id="listRubrosDestacado">
                                        <!--<button type="button" class="list-group-item" onclick="location.href = 'rubros.jsp';" ><span class="badge lineaBlanca">14</span> Linea blanca</button>
                                        <button type="button" class="list-group-item" onclick="location.href = 'rubros.jsp';"><span class="badge alimentos">2</span> Alimentos</button>
                                        <button type="button" class="list-group-item" onclick="location.href = 'rubros.jsp';"><span class="badge servicios">4</span> Servicios</button>
                                    --></div>
                                </div>
                            </div>
                        </div>

                        <div class="container">
                            <div class="row">
                                <div class="col-md-4 col-sm-4 ">
                                    <div class="list-group" id="listRubros">

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-8 col-sm-8">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title"><b >Oferta destacada</b></h3>
                            </div>
                            <div class="panel-body">
                                <div class="container-fluid">
                                    <div clas="row">
                                        <div class="col-md-12 col-sm-8 col-xs-12">
                                            <h4 id="tituloDestacado">Hasta 30% de descuento en tu segunda compra de ropa en la marca Adidas</h4>
                                        </div>
                                    </div>
                                    <div class="row" >
                                        <div class=" col-lg-8 col-md-8 col-sm-8 col-xs-12">
                                            <img src="img/empty.png" alt="" class="img-responsive" id="imgDestacada">
                                        </div>
                                        <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 ">
                                            <h4 id="precioDestacado"> Desde $20.900</h4>
                                            <button id="btnValorarDestacado" type="button" class="btn btn-success" onclick="location.href = 'valorar_oferta.jsp';">Ver Oferta</button>
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
                            <div class="panel-body" id="divPanelBodyOferta1">
                                <div class="container-fluid">
                                    <div clas="row">
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 titleOferta">
                                            <h4>Hasta 30% de descuento en tu segunda compra de ropa en la marca Adidas</h4>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-8 col-sm-8 col-xs-12 imgOferta">
                                            <img alt="" class="img-responsive imgOfertaMenu">
                                        </div>
                                        <div class="col-md-4 col-sm-4 col-xs-12 priceOferta">
                                            <h4> Desde $20.900</h4>
                                            <button type="button" class="btn btn-success detailOferta">Ver Oferta</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-12">
                        <div class="panel panel-default">
                            <div class="panel-body" id="divPanelBodyOferta2">
                                <div class="container-fluid">
                                    <div clas="row">
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 titleOferta">
                                            <h4>Hasta 30% de descuento en tu segunda compra de ropa en la marca Adidas</h4>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-8 col-sm-8 col-xs-12 imgOferta">
                                            <img  alt="" class="img-responsive imgOfertaMenu">
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
                                            <img alt="" class="img-responsive imgOfertaMenu">
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
                                            <img alt="" class="img-responsive imgOfertaMenu">
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
                                            <img  alt="" class="img-responsive imgOfertaMenu">
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
                                            <img alt="" class="img-responsive imgOfertaMenu">
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
                        <!--<a href="ofertas.html"> Ver todos...</a>-->
                    </div>
                </div>
            </div>
        <br>




        <jsp:include page="_footer.jsp"></jsp:include>



        <script src="js/vendor/modernizr-3.5.0.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-3.2.1.min.js"><\/script>');</script>
        <script src="js/Helpers.js"></script>
        <script src="js/plugins.js"></script>
        <script src="js/main.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/vendor/sweetalert2.min.js"></script>
        <script>


            $(document).ready(function () {
                <%
                    if(session.getAttribute("idConsumidor")!=null){
                %>
                    $.post("SelectOfertasServletConsumidor", {
                        idConsumidor:<%=session.getAttribute("idConsumidor")%>
                    }, function (data) {
                    const titles = document.getElementsByClassName("titleOferta");
                    const imgOferta = document.getElementsByClassName("imgOferta");
                    const priceOferta = document.getElementsByClassName("priceOferta");

                    console.log(data);
                    //MEJORAR CONDICION
                    const aux = (titles.length === data.length) ? data.length : data.length;
                    //console.log(aux);

                    for (var i = 0; i <= aux; i++) {
                        let idRubro = data[i]["ID_RUBRO"];
                        let idOferta = data[i]["ID_OFERTA"];
                        titles[i].innerHTML = "<h4>" + data[i]["TITULO_OFERTA"] + "</h4>";
                        var imagen = imgOferta[i].children;
                        
                        imagen[0].src = "MostrarImagenServlet?imageId="+data[i]["IMAGEN"];
                        var price = priceOferta[i].children;
                        price[0].innerHTML = "<h4>Desde: " + separarMiles(data[i]["PRECIO"]) + "</h4>";
                        <%
                            if(session.getAttribute("idConsumidor")==null){
                        %>
                            price[1].addEventListener("click", function () {
                                window.location.href = 'valorar_oferta.jsp?Oferta=' + idOferta;
                            }, false);
                        <%
                            }else{
                        %>
                            price[1].addEventListener("click",function(){
                                var id =<%=session.getAttribute("idConsumidor")%>
                                $.post("TrackOfertaServlet",{
                                  idOferta: idOferta,
                                  idConsumidor:id,
                                  idRubro: idRubro
                                },function(data){
                                   console.log(data);
                                });
                            },false);
                            price[1].addEventListener("click", function () {
                                window.location.href = 'valorar_oferta.jsp?Oferta=' + idOferta;
                            }, false);
                        <%
                            }
                        %>
                    }
                });    
                        
                        
                    var tituloDestacado = document.getElementById("tituloDestacado");
                    var precioDestacado = document.getElementById("precioDestacado");
                    var btnValorarDestacado = document.getElementById("btnValorarDestacado");
                    var imgDestacada = document.getElementById("imgDestacada");
                    $.post("SelectOfertaDestacadaServlet", {
                        idConsumidor:<%=session.getAttribute("idConsumidor")%>
                    }, function (data) {
                        let idOferta = data[0]["ID_OFERTA"];
                        let idRubro = data[0]["ID_RUBRO"];
                        console.log(data);
                        imgDestacada.src = "MostrarImagenServlet?imageId="+data[0]["IMAGEN"];
                        tituloDestacado.innerHTML=data[0]["TITULO_OFERTA"];
                        precioDestacado.innerHTML="Desde: "+separarMiles(data[0]["PRECIO"]);
                        btnValorarDestacado.addEventListener("click",function(){
                                var id =<%=session.getAttribute("idConsumidor")%>
                                $.post("TrackOfertaServlet",{
                                  idOferta: idOferta,
                                  idConsumidor:id,
                                  idRubro: idRubro
                                },function(data){
                                   console.log(data);
                                });
                            },false);
                        btnValorarDestacado.addEventListener("click", function () {
                                window.location.href = 'valorar_oferta.jsp?Oferta=' + idOferta;
                            }, false);
                    });
                    $.post("RubrosCantOfertasDestacadoConsumidorServlet", {
                        idConsumidor:<%=session.getAttribute("idConsumidor")%>
                        }, function (data) {
                        var listRubros = document.getElementById("listRubrosDestacado");
                        $.each(data, function (key, value) {
                            var idConsumidor= <%=session.getAttribute("idConsumidor")%>;
                            var button = "<button type='button' class='list-group-item' onclick=" + "toRubrosRegistrarTrack("+value["ID_RUBRO"]+","+idConsumidor+")" + "><span class='badge'>" + value["CANTIDAD_OFERTAS"] + "</span>" + value["DESCRIPCION"] + "</button>";
                            listRubros.innerHTML += button;
                        });
                    });          
                    
                <%
                    }else{
                %>
                    $.post("SelectOfertaDestacadaGeneralServlet", {
                    }, function (data) {
                        let idOferta = data[0]["ID_OFERTA"];
                        let idRubro = data[0]["ID_RUBRO"];
                        console.log(data);
                        imgDestacada.src = "MostrarImagenServlet?imageId="+data[0]["IMAGEN"];
                        tituloDestacado.innerHTML=data[0]["TITULO_OFERTA"];
                        precioDestacado.innerHTML="Desde: "+separarMiles(data[0]["PRECIO"]);
                        btnValorarDestacado.addEventListener("click", function () {
                                window.location.href = 'valorar_oferta.jsp?Oferta=' + idOferta;
                            }, false);
                    }); 
                    $.post("RubrosCantOfertasDestacadoGeneralServlet", {
                        }, function (data) {
                        var listRubros = document.getElementById("listRubrosDestacado");
                        $.each(data, function (key, value) {
                            var button = "<button type='button' class='list-group-item' onclick=" + "toRubros(" + value["ID_RUBRO"] + ")" + "><span class='badge'>" + value["CANTIDAD_OFERTAS"] + "</span>" + value["DESCRIPCION"] + "</button>";
                            listRubros.innerHTML += button;
                        });
                    });
                    
                    $.post("SelectOfertasServlet", {}, function (data) {
                    const titles = document.getElementsByClassName("titleOferta");
                    const imgOferta = document.getElementsByClassName("imgOferta");
                    const priceOferta = document.getElementsByClassName("priceOferta");

                    console.log(data);
                    //MEJORAR CONDICION
                    const aux = (titles.length === data.length) ? data.length : data.length;
                    //console.log(aux);

                    for (var i = 0; i <= aux; i++) {
                        let idRubro = data[i]["ID_RUBRO"];
                        let idOferta = data[i]["ID_OFERTA"];
                        titles[i].innerHTML = "<h4>" + data[i]["TITULO_OFERTA"] + "</h4>";
                        var imagen = imgOferta[i].children;
                        
                        imagen[0].src = "MostrarImagenServlet?imageId="+data[i]["IMAGEN"];
                        var price = priceOferta[i].children;
                        price[0].innerHTML = "<h4>Desde: " + separarMiles(data[i]["PRECIO"]) + "</h4>";
                        <%
                            if(session.getAttribute("idConsumidor")==null){
                        %>
                            price[1].addEventListener("click", function () {
                                window.location.href = 'valorar_oferta.jsp?Oferta=' + idOferta;
                            }, false);
                        <%
                            }else{
                        %>
                            price[1].addEventListener("click",function(){
                                var id =<%=session.getAttribute("idConsumidor")%>
                                $.post("TrackOfertaServlet",{
                                  idOferta: idOferta,
                                  idConsumidor:id,
                                  idRubro: idRubro
                                },function(data){
                                   console.log(data);
                                });
                            },false);
                            price[1].addEventListener("click", function () {
                                window.location.href = 'valorar_oferta.jsp?Oferta=' + idOferta;
                            }, false);
                        <%
                            }
                        %>
                    }
                });
                    
                <%
                    }
                %>
                
                
                $.post("RubrosCantOfertasServlet", {}, function (data) {
                    var listRubros = document.getElementById("listRubros");
                    $.each(data, function (key, value) {
                        <% if (session.getAttribute("idConsumidor")==null){%>
                            var button = "<button type='button' class='list-group-item' onclick=" + "toRubros(" + value["ID_RUBRO"] + ")" + "><span class='badge'>" + value["CANTIDAD_OFERTAS"] + "</span>" + value["DESCRIPCION_RUBRO"] + "</button>";
                            listRubros.innerHTML += button;
                        <% 
                            }else{
                        %>
                            var idConsumidor= <%=session.getAttribute("idConsumidor")%>;
                            var button = "<button type='button' class='list-group-item' onclick=" + "toRubrosRegistrarTrack("+value["ID_RUBRO"]+","+idConsumidor+")" + "><span class='badge'>" + value["CANTIDAD_OFERTAS"] + "</span>" + value["DESCRIPCION_RUBRO"] + "</button>";
                            listRubros.innerHTML += button;
                        <%
                            }
                        %>
                    });
                });             
            });
            
        </script>
    </body>
</html>
