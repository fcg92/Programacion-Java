public class ejercicios_tema_4 {
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

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);    
        }

        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (false);

        for (int numeroFor = 0; numeroFor <= 3 ; numeroFor++) {
            System.out.println(numeroFor);
        }

        var estacion = "julio";
        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            default:
                System.out.println("no es una estacion");
                break;
        }   
    }
}