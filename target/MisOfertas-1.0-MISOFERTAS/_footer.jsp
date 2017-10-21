<%@ page session="true" %>
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
                                <li> <a href="https://www.google.cl/maps/place/Duoc+UC:+Sede+Puente+Alto/@-33.5983925,-70.5807816,17z/data=!3m1!4b1!4m5!3m4!1s0x9662d7037854df81:0x893f58a1479b8f82!8m2!3d-33.5983925!4d-70.5785929?hl=es-419" target="_blank"> <i class="fa fa-map-marker">   </i> DuocUC - Sede Puente Alto, Santiago, Chile  </a> </li>
                            </ul>
                        </div>
                    </div>
                    <!--/.row-->
                </div>
                <!--/.container-->
            </div>
            <!--/.footer-->

            <%
                if(session.getAttribute("SesionNombre") == null){
                    %>
            <div class="footer-bottom">
                <div class="container">
                    <p class="pull-left">  2017. Mis Ofertas. Todos los derechos reservados </p>
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
                    
                            <%
                }else{
                    %>
            <div class="footer-bottom center-block">
                <div class="container">
                    <p class="pull-left">  2017. Mis Ofertas. Todos los derechos reservados </p>
                    <div class="pull-right">
                        <ul class="nav nav-pills">
                            <li role="separator"><a href="index.jsp">Inicio</a></li>
                            <li role="separator"><a href="ayuda.jsp">Ayuda</a></li>
                        </ul>
                    </div>
                </div>
            </div>        
                    
                            <%
                }

                %>
            
            
            <!--/.footer-bottom-->
        </footer>
