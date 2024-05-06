public class circulo extends figuraGeometrica{
    private Integer radio;

    public circulo(String nombre, String color, Integer radio) {
        super(nombre, color);
        this.radio = radio;
    }

    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }

    public void calcularPerimetro(){
        System.out.println("El perimetro de este rectangulo es de: \n" + (2*3.14*this.radio) + "cm");
    }
}
