<%@ page session="true" %>


<%
        try {
            if (session.getAttribute("SesionNombre") == null) {
%>

<nav class="navbar navbar-inverse ">
    <div class="container">
        <div class="navbar-header">
            <br>
            <br>
            <a href="index.jsp"><img src="img/logos/MisOfertas-sinLetras.png" alt="" class="imgLogo" align="left"></a>
            <a href="index.jsp" class="navbar-brand navbar-link">Mis Ofertas </a>
            <button data-toggle="collapse" data-target="#navbar-collapse" class="navbar-toggle collapsed"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>

        </div>
        <div class="collapse navbar-collapse" id="navbar-collapse">
            <br>
            <br>
            <ul class="nav navbar-nav navbar-right links">
                <li class="divider-vertical" role="presentation" id="liIngresar"><a href="ingresar.jsp">Ingresar </a></li>
                <li role="presentation" id="liCrearCuenta"><a href="crear_cuenta.jsp">Crear cuenta</a></li>
                <li role="presentation"><a href="ayuda.jsp" class="custom-navbar">Ayuda</a></li>          
            </ul>

        </div>
    </div>
</nav>


<%
            } else {
    %>
    
<nav class="navbar navbar-inverse ">
    <div class="container">
        <div class="navbar-header">
            <br>
            <br>
            <img src="img/logos/MisOfertas-sinLetras.png" alt="" class="imgLogo" align="left">
            <a href="index.jsp" class="navbar-brand navbar-link">Mis Ofertas </a>
            <button data-toggle="collapse" data-target="#navbar-collapse" class="navbar-toggle collapsed"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>

        </div>
        <div class="collapse navbar-collapse" id="navbar-collapse">
            <br>
            <br>
            <ul class="nav navbar-nav navbar-right links">
                <li role="presentation" id="liDescuentos"><a href="descuentos.jsp">Descuentos</a></li>
                <li role="presentation"><a href="ayuda.jsp" class="custom-navbar">Ayuda</a></li>
                <li class="dropdown" id="liMiCuenta">
                    <a data-toggle="dropdown" aria-expanded="false" href="#" class="dropdown-toggle"> Mi Cuenta<span class="caret"></span></a>
                    <ul role="menu" class="dropdown-menu dropdown-menu-right">
                        <li role="presentation"><a href="mi_cuenta.jsp">Mi cuenta</a></li>
                        <li role="presentation"><a onclick="cerrar_sesion()">Cerrar sesión </a></li>
                    </ul>
                </li>
            </ul>

        </div>
    </div>
</nav>    
    
    
    <%
            }
        } catch (Exception e) {

        }
    %>


