<%@ page session="true" %>

<%
    if(session.getAttribute("SesionNombre") == null){
        String redirectURL = "index.jsp";
        response.sendRedirect(redirectURL);
    }
%>
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
    <ol class="breadcrumb">
        <li class="breadcrumb-item active"><a href="index.jsp">Home</a></li>
        <li class="breadcrumb-item active">Descuentos</li>
    </ol>
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
                <button type="button" class="btn btn-success btncupon" id="descargarCupon">Descargar cupón</button>
                <br>
                <h4 id="fechaActual">Disponible para el mes de Agosto de 2017</h4>
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
                <table id="datatableDescuentos" class="table table-striped table-bordered" cellspacing="0" width="100%">
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
                    </tbody>
                </table>
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
<script src="js/main.js"></script>
<script>
    $( document ).ready(function() {
        var monthNames = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                                        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
                                      ];
        var date = new Date();
        var fechaActual = document.getElementById("fechaActual");
        fechaActual.innerHTML="Disponible para el mes de "+monthNames[date.getMonth()]+" de "+date.getUTCFullYear();
        $.post("CuponesGeneradosConsumidorServlet",{
        },function(data){
            if(data !== null){
                console.log(data);
                const tabla = document.getElementById("datatableDescuentos");
                const tbody = tabla.getElementsByTagName("tbody");
                const boton = document.getElementById("descargarCupon");
                boton.addEventListener("click", function () {
                    mostrarDescuento(data[0]["ID_CERTIFICADO"]);
                }, false);
                for(var i = 1; i < data.length; i++){
                    const fila = document.createElement("tr");
                    var date = new Date(data[i]["FECHA_EMISION"]);
                    var idCertificado= data[i]["ID_CERTIFICADO"];
                    //String strDate = sm.format(data[i]["FECHA_EMISION"]);
                    const mesEmision = document.createElement("td");mesEmision.innerHTML="<th>"+monthNames[date.getMonth()]+" de "+date.getUTCFullYear()+"</th>";
                    const rubros = document.createElement("td");rubros.innerHTML="<th>"+data[i]["RUBROS_DISPONIBLES"]+"</th>";
                    const puntos = document.createElement("td");puntos.innerHTML="<th>"+data[i]["PUNTOS"]+"</th>";
                    const descuento = document.createElement("td");descuento.innerHTML="<th>"+data[i]["DESCUENTO"]+"</th>";
                    const tope = document.createElement("td");tope.innerHTML="<th> $ "+data[i]["TOPE"]+"</th>";
                    const boton =document.createElement("td");
                    const ver = document.createElement("td");ver.innerHTML="<p data-placement='top' data-toggle='tooltip' title='Edit'>\n\
                                                                                <button class='btn btn-primary btn-xs' data-title='Edit' data-toggle='modal' data-target='_blank' onclick='mostrarDescuento("+idCertificado+")' >\n\
                                                                                    <span class='glyphicon glyphicon-search'></span>\n\
                                                                                </button>\n\
                                                                            </p>";
                    fila.appendChild(mesEmision);
                    fila.appendChild(rubros);
                    fila.appendChild(puntos);
                    fila.appendChild(descuento);
                    fila.appendChild(tope);
                    fila.appendChild(ver);
                    tbody[0].appendChild(fila);
                }   
            }
            if(data.length===0)
            {
                var btn = document.getElementById("descargarCupon");
                btn.disabled=true;
            }
        }); 
    });
    
</script>

</body>
</html>
