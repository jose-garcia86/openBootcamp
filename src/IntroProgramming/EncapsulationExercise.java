package IntroProgramming;

public class EncapsulationExercise {
    public static void main(String[] args){

        Persona persona = new Persona();

        persona.setNombre("Jose");
        persona.setEdad("36");
        persona.setTelefono("157892199");
        System.out.printf("Nombre: %s\n", persona.getNombre());
        System.out.printf("Edad: %s\n", persona.getEdad());
        System.out.printf("Telefono: %s\n", persona.getTelefono());
    }
}

class Persona{
    private String edad, nombre, telefono;

    // Edad
    public String getEdad(){
        return this.edad;
    };
    public void setEdad(String edad){
        this.edad = edad;
    };
    // Nombre
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    // Telefono
    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}