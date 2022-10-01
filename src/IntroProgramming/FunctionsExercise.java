package IntroProgramming;

public class FunctionsExercise {
    public static void main (String[] args) {
        // Calcula la suma de tres numeros e imprime el resultado
        int resultado = sumar(5, 2, 6);
        System.out.println(resultado);

        // Crea un nuevo coche
        Coche miCoche = new Coche();

        // Añade una puerta e imprime el valor
        miCoche.incNumPuertas();
        System.out.println(miCoche.numeroPuertas);
    }

    // Crea la funcion Suma
    public static int sumar(int a, int b, int c){
        return a + b + c;
    }

}
class Coche {
    public int numeroPuertas = 0;

    public void incNumPuertas(){
        this.numeroPuertas++;
    }
}
