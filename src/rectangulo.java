public class rectangulo extends figuraGeometrica {
    private String longitud;
    private String ancho;

    public rectangulo(String nombre, String color, String longitud, String ancho) {
        super(nombre, color);
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }
}
