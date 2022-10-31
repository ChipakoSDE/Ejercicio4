public class Main {
    public static void main(String[] args) {
        var numeroIf = 4;
        var numeroWhile = -2;
        var estacion = "Sandalias";
        if (numeroIf > 0) {
            System.out.println("El número del If es positivo");
        } else if (numeroIf < 0) {
                System.out.println("El número del If es negativo");
            } else {
                System.out.println("El número del If es igual a 0");
            }
        while (numeroWhile<3) {
            System.out.println("El número del While es: " + numeroWhile);
            numeroWhile++;
            }
        do {
            numeroWhile++;
            System.out.println("El numero del Do-While es: " + numeroWhile);
            } while (numeroWhile<3);
        for (int numeroFor = 0;numeroFor <= 3; numeroFor++){
            System.out.println("El número del For es: " + numeroFor);
            }
        switch (estacion){
            case "Verano":
                System.out.println("Estamos en Verano");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;
            case "Primavera":
                System.out.println("Estamos en Primavera");
                break;
            default:
                System.out.println(estacion + " no es una estación, por favor verifique los datos");
        }
        }
    }
