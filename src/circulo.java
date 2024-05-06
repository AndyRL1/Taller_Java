public class circulo extends figuraGeometrica{
    private String radio;

    public circulo(String nombre, String color, String radio) {
        super(nombre, color);
        this.radio = radio;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }
}
