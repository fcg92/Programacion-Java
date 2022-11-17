public class ejercicios_tema_8{
    public static void main(String[] args) {

        Persona persona1 = new Persona();

        persona1.setEdad(20);;
        persona1.setNombre("Felip");;
        persona1.setTelefono(75485468);

        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
}