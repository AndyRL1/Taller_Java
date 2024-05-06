public class rectangulo extends figuraGeometrica {
    private Integer longitud;
    private Integer ancho;

    public rectangulo(String nombre, String color, Integer longitud, Integer ancho) {
        super(nombre, color);
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public void calcularArea(){
        System.out.println("El area de este rectangulo es de: \n" + (this.longitud*this.ancho) + "cm^2");
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro de este rectangulo es de: \n" + (this.longitud*2+this.ancho*2) + "cm");
    }
}
