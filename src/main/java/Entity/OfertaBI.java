
package Entity;


public class OfertaBI {
    private String empresa;
    private int numero_local;
    private String rubro;
    private int id_oferta;
    private String titulo_oferta;
    private int precio_oferta;
    private String fecha_creacion;
    private String fecha_publicacion;
    private String fecha_finalizacion;
    private int valoraciones_negativas;
    private int valoraciones_medias;
    private int valoraciones_positivas;
    private int valoraciones_totales;
    private String Producto;
    private int cantidad_visitas;

    public OfertaBI() {
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNumero_local() {
        return numero_local;
    }

    public void setNumero_local(int numero_local) {
        this.numero_local = numero_local;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public int getId_oferta() {
        return id_oferta;
    }

    public void setId_oferta(int id_oferta) {
        this.id_oferta = id_oferta;
    }

    public String getTitulo_oferta() {
        return titulo_oferta;
    }

    public void setTitulo_oferta(String titulo_oferta) {
        this.titulo_oferta = titulo_oferta;
    }

    public int getPrecio_oferta() {
        return precio_oferta;
    }

    public void setPrecio_oferta(int precio_oferta) {
        this.precio_oferta = precio_oferta;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public String getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(String fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public int getValoraciones_negativas() {
        return valoraciones_negativas;
    }

    public void setValoraciones_negativas(int valoraciones_negativas) {
        this.valoraciones_negativas = valoraciones_negativas;
    }

    public int getValoraciones_medias() {
        return valoraciones_medias;
    }

    public void setValoraciones_medias(int valoraciones_medias) {
        this.valoraciones_medias = valoraciones_medias;
    }

    public int getValoraciones_positivas() {
        return valoraciones_positivas;
    }

    public void setValoraciones_positivas(int valoraciones_positivas) {
        this.valoraciones_positivas = valoraciones_positivas;
    }

    public int getValoraciones_totales() {
        return valoraciones_totales;
    }

    public void setValoraciones_totales(int valoraciones_totales) {
        this.valoraciones_totales = valoraciones_totales;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getCantidad_visitas() {
        return cantidad_visitas;
    }

    public void setCantidad_visitas(int cantidad_visitas) {
        this.cantidad_visitas = cantidad_visitas;
    }

    @Override
    public String toString() {
        return empresa + "," 
                + numero_local + ","
                + rubro + ","
                + Producto + ","
                + id_oferta + ","
                + titulo_oferta + ","
                + precio_oferta + ","
                + fecha_creacion + ","
                + fecha_publicacion + "," 
                + fecha_finalizacion + "," 
                + valoraciones_negativas + ","
                + valoraciones_medias + ","
                + valoraciones_positivas + ","
                + valoraciones_totales + ","
                + cantidad_visitas;
    }
    
    
    
}
