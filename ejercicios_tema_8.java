public class ejercicios_tema_8 {
    public static void main(String[] args) {
        int numeroIf = 100;
        int numeroWhile = 2;

        if (numeroIf == 0) {
            System.out.println(numeroIf+" es un numero igual a 0");            
        } else if (numeroIf < 0) {
            System.out.println(numeroIf+" es un numero negativo");           
        } else if (numeroIf > 0) {
            System.out.println(numeroIf+" es un numero positivo");;
        }



        Coche coche = new Coche();
        System.out.println(coche.numeroDePuertas);

    }
}

class Coche {
    int numeroDePuertas;
    int velocidadMaxima;

    public Coche(){
        numeroDePuertas =5;
    }

    public void acelerar(){
        velocidadMaxima=+15;
    }

}