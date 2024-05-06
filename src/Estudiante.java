public class Estudiante extends Persona implements Trabajador{

    private String grado;

    public Estudiante(String nombre, Integer edad, String fechaNacimiento, String grado) {

        super(nombre, edad, fechaNacimiento);

        this.grado = grado;
    }

    @Override
    public void mensaje(){
        super.mensaje();
        System.out.print(" , Mi grado es: " + this.grado);
    }
    public void realizarTarea(){
        System.out.println("Realizando tarea escolar");
    }
}
