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
</head>
<body >
<!--[if lte IE 9]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
<![endif]-->


<jsp:include page="_header.jsp"></jsp:include>


<div class="container">
    <ol class="breadcrumb">
        <li class="breadcrumb-item active"><a href="index.jsp">Home</a></li>
        <li class="breadcrumb-item active">Rubros</li>
    </ol>
    <div class="row">
        <div class="col-lg-4 col-md-4 col-sm-4">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 col-sm-4 ">
                        <h4>Valorados</h4>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 col-sm-4 ">
                        <div class="list-group">
                            <button type="button" class="list-group-item" onclick="filtrarPorValoracion(3)">Excelentes</button>
                            <button type="button" class="list-group-item" onclick="filtrarPorValoracion(2)">Buenos</button>
                            <button type="button" class="list-group-item" onclick="filtrarPorValoracion(1)">Malos</button>
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <div class="col-lg-8 col-md-8 col-sm-8">
            <br>
            <br>

            <select class="form-control selectClasificacion" style="alignment: right" onchange="filtrarPorValoracion(value);">
                <option>Clasificacion</option>
                <option value="3" >Excelentes</option>
                <option value="2">Buenos</option>
                <option value="1">Malos</option>
            </select>
            <br>
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
            <!--<a href="#"> Ver todos...</a>-->

        </div>
    </div>
</div>
<br>


<jsp:include page="_footer.jsp"></jsp:include>





<script src="js/vendor/modernizr-3.5.0.min.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="js/vendor/jquery-3.2.1.min.js"><\/script>')</script>
<script src="js/plugins.js"></script>
<script src="js/main.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/vendor/sweetalert2.min.js"></script>
<script src="js/Helpers.js"></script>
<script>
    $( document ).ready(function() {
        const rubro = findGetParameter("Id");
        var tituloDestacado = document.getElementById("tituloDestacado");
        var precioDestacado = document.getElementById("precioDestacado");
        var btnValorarDestacado = document.getElementById("btnValorarDestacado");
        var imgDestacada = document.getElementById("imgDestacada");
        //alert(rubro);
        $.post("SelectOfertasPorRubroServelet",{
            idRubro:rubro
        },function(data){
            console.log(data);
            const titles = document.getElementsByClassName("titleOferta");
            const imgOferta= document.getElementsByClassName("imgOferta");
            const priceOferta = document.getElementsByClassName("priceOferta");
            
            //MEJORAR CONDICION
            const aux =(titles.length === data.length)? data.length : data.length;
            console.log(aux);

            for(var i = 0; i<aux ;i++){
                let idOferta = data[i]["ID_OFERTA"];
                titles[i].innerHTML = "<h4>"+data[i]["TITULO_OFERTA"]+"</h4>";
                var imagen = imgOferta[i].children;
                imagen[0].src = "MostrarImagenServlet?imageId="+data[i]["IMAGEN"];
                var price = priceOferta[i].children;
                    price[0].innerHTML = "<h4>"+separarMiles(data[i]["PRECIO"])+"</h4>";
        <%
            if(session.getAttribute("idConsumidor")!=null){
        %>
            price[1].addEventListener("click", function(){
                        var id =<%=session.getAttribute("idConsumidor")%>
                        $.post("TrackOfertaServlet",{
                          idOferta: idOferta,//data[i]["ID_OFERTA"],
                          idConsumidor:id,
                          idRubro:data[i]["ID_RUBRO"]
                        },function(data){
                            console.log(data);
                        });   
                        window.location.href = 'valorar_oferta.jsp?Oferta='+idOferta;
               }, false);  
        <%
            }else{
        %>                
            price[1].addEventListener("click", function(){
                   window.location.href = 'valorar_oferta.jsp?Oferta='+idOferta;
               }, false);
        <%
            }
        %>                   
            }

        });       
        $.post("RubrosCantOfertasServlet",{},function(data){
                var listRubros = document.getElementById("listRubros");
                //<button type="button" class="list-group-item" onclick="location.href='rubros.jsp';"><span class="badge">14</span> Linea blanca</button>
                $.each(data,function(key,value){
                    var button = "<button type='button' class='list-group-item' onclick="+"toRubros("+value["ID_RUBRO"]+")"+"><span class='badge'>"+value["CANTIDAD_OFERTAS"]+"</span>"+value["DESCRIPCION_RUBRO"]+"</button>";
                    listRubros.innerHTML += button;
                });
            });
        <%
            if(session.getAttribute("idConsumidor")!=null){
        %>
            $.post("SelectOfertaDestacadaRubroConsServlet",{
                idConsumidor:<%=session.getAttribute("idConsumidor")%>,
                idRubro:rubro
            },function(data){
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
        <%
            }else{
        %>
            $.post("SelectOfertaDestacadaRubroGenServlet",{
                idRubro:rubro
            },function(data){
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
        <%
            }
        %>
    });
    function filtrarPorValoracion(id)
    {
        const rubro = findGetParameter("Id");
        <% if(session.getAttribute("idConsumidor")!=null){ %>
        $.post("SelectOfertasRubroValConsServlet",{
            idRubro:rubro,
            idValoracion:id,
            idConsumidor:<%=session.getAttribute("idConsumidor")%>
        },function(data){
            console.log(data);
            const titles = document.getElementsByClassName("titleOferta");
            const imgOferta= document.getElementsByClassName("imgOferta");
            const priceOferta = document.getElementsByClassName("priceOferta");
            
            //MEJORAR CONDICION
            const aux =(titles.length === data.length)? data.length : data.length;
            console.log(aux);

            for(var i = 0; i<aux ;i++){
                var idOferta = data[i]["ID_OFERTA"];
                titles[i].innerHTML = "<h4>"+data[i]["TITULO_OFERTA"]+"</h4>";
                var imagen = imgOferta[i].children;
                imagen[0].src = "MostrarImagenServlet?imageId="+data[i]["IMAGEN"];
                var price = priceOferta[i].children;
                    price[0].innerHTML = "<h4>"+separarMiles(data[i]["PRECIO"])+"</h4>";
                    price[1].addEventListener("click", function(){
                        //alert(idOferta);
                        window.location.href = 'valorar_oferta.jsp?Oferta='+idOferta;

                    }, false);
            }

        });
        <%}else{ %>
        $.post("SelectOfertasRubroValGenServlet",{
            idRubro:rubro,
            idValoracion:id
        },function(data){
            console.log(data);
            const titles = document.getElementsByClassName("titleOferta");
            const imgOferta= document.getElementsByClassName("imgOferta");
            const priceOferta = document.getElementsByClassName("priceOferta");
            
            //MEJORAR CONDICION
            const aux =(titles.length === data.length)? data.length : data.length;
            console.log(aux);

            for(var i = 0; i<=aux ;i++){
                var idOferta = data[i]["ID_OFERTA"];
                titles[i].innerHTML = "<h4>"+data[i]["TITULO_OFERTA"]+"</h4>";
                var imagen = imgOferta[i].children;
                imagen[0].src = "MostrarImagenServlet?imageId="+data[i]["IMAGEN"];
                var price = priceOferta[i].children;
                    price[0].innerHTML = "<h4>"+separarMiles(data[i]["PRECIO"])+"</h4>";
                    price[1].addEventListener("click", function(){
                        //alert(idOferta);
                        window.location.href = 'valorar_oferta.jsp?Oferta='+idOferta;

                    }, false);
            }

        });
        <% }%>
    }
</script>

</body>
</html>
