public class ejercicios_tema_10{
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.edad = 20;
        cliente.nombre = "Felipe";
        cliente.telefono =75485468;
        cliente.credito = 100;

        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();

        trabajador.edad = 30;
        trabajador.nombre = "Julio";
        trabajador.telefono = 88515468;
        trabajador.salario = 10000;

        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}
