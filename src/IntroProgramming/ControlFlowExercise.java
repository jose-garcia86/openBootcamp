package IntroProgramming;

public class ControlFlowExercise {
    public static void main(String[] args){
        // If Statement
        int numeroIf = 12;
        if(numeroIf > 0){
            System.out.printf("Numero '%d' es positivo\n", numeroIf);
        } else if (numeroIf < 0){
            System.out.printf("Numero '%d' es negativo\n", numeroIf);
        } else {
            System.out.printf("Numero '%d' es cero\n", numeroIf);
        }

        // While Loop
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        // Do While Loop
        do {
            System.out.println(numeroWhile);
        } while (numeroWhile == 0);

        // For Loop
        for(int numeroFor=0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        // Switch Statement
        String estacion = "Otoño";
        switch (estacion){
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Estacion incorrecta.");
        }
    }
}
