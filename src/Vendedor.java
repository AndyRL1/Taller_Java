public class Vendedor extends Empleado {
    private double comision;
    public Vendedor(String nombre, Integer salario) {
        super(nombre, salario);
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

}
