public class Empleado {
    private String nombre;
    private Integer salario;

    public Empleado(String nombre, Integer salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }
    public double calcularSalario(){
        return getSalario();
    }
}

