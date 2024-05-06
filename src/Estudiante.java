public class Estudiante extends Persona{

    private String grado;

    @Override
    public void mensaje(){
        super.mensaje();
        System.out.print(" , Mi grado es: " + this.grado);
    }
}
