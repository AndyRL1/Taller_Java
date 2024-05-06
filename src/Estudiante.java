public class Estudiante extends Persona{

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
}
