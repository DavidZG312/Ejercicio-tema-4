public class Main {
    public static void main(String[] args) {
        System.out.println("- Ejercicio If");
        int numeroIf = -1;
        if(numeroIf > 0){
            System.out.println("El número es positivo: " + numeroIf);
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo: " + numeroIf);
        } else {
            System.out.println("El número es igual a 0");
        }


        System.out.println("- Ejercicio While");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile ++;
            System.out.println("El valor de numeroWhile es: " + numeroWhile);
        }


        System.out.println("- Ejercicio Do While");
        int numeroDoWhile = 0;
        do {
            numeroDoWhile ++;
            System.out.println("El valor de numeroDoWhile es: " + numeroDoWhile);
        } while (numeroDoWhile < 0);


        System.out.println("- Ejercicio For");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("El valor de numeroFor es: " + numeroFor);
        }


        System.out.println("- Ejercicio Switch");
        String estacion = "invierto";
        switch (estacion) {
            case "verano":
                System.out.println("La estacion es verano ");
                break;
            case "primavera":
                System.out.println("La estacion es primavera");
                break;
            case "otoño":
                System.out.println("La estacion es otoño");
                break;
            case "invierto":
                System.out.println("La estacion es invierto");
                break;
            default:
                System.out.println("Esta no es una estación: " + estacion);
                break;
        }
    }
}