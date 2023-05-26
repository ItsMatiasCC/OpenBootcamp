public class Main {
    public static void main(String[] args) {
        //numeroIf
        int numeroIf = 10;

        if (numeroIf == 0) {
            System.out.println("El numero es 0");
        } else if (numeroIf >= 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
        //numeroWhile
        int numeroWhile = 0;
        while (numeroWhile <3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //DoWhile
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile <3);

        //numeroFor
        int numeroFor;
        for (numeroFor = 0; numeroFor <=3; numeroFor++){
            System.out.println(numeroFor);
        }

        //Switch case
        var estacion = "Primavera";
        switch (estacion){
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("¡No es una estacion!");
        }
    }
}