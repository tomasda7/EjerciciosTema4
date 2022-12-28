public class Main {
    public static void main(String[] args) {

        //condicionales
        int numeroif = -1;

        if (numeroif > 0) {
            System.out.println("numeroif es positivo");
        } else if (numeroif < 0) {
            System.out.println("numeroif es negativo");
        } else {
            System.out.println("numeroif es 0");
        }

        //bucle while
        int numeroWhile = 0;

        while(numeroWhile < 3) {
           System.out.println(numeroWhile);
           numeroWhile++;
        }

        //bucle do while
        int numeroDowhile = 0;

        do {
            System.out.println(numeroDowhile);
            numeroDowhile++;
        } while(numeroDowhile < 1);

        //bucle for
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //switch case
        String estacion = "otoño";

        switch (estacion) {
            case "verano":
                System.out.println("Estamos en verano!");
                break;
            case "invierno":
                System.out.println("Estamos en invierno!");
                break;
            case "otoño":
                System.out.println("Estamos en otoño!");
                break;
            case "primavera":
                System.out.println("Estamos en primavera!");
                break;
            default:
                System.out.println("Eso no es una estación del año!");
                break;
        }
    }
}