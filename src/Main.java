/**
 * Primera parte:
 * Crear una función con tres parámetros que sean números que se suman entre sí.
 * Llamar a la función en el main y darle valores.
 *
 * Segunda parte:
 * Crear una clase coche.
 * Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
 * Una función que incremente el número de puertas que tiene el coche.
 * Crear un objeto miCoche en el main y añadirle una puerta.
 * Mostrar el número de puertas que tiene el objeto.
*/

public class Main {
    public static void main(String[] args) {
        //Valores de otorgados
        suma(10, 20, 30);
        //Creacion de objeto
        coche miCoche = new coche();
        miCoche.agregarPuerta();
        System.out.println("Numero de puertas de un coche: " + miCoche.puertas);

    }
    public static void suma(int a, int b, int c){
        int resultado;
        //Calculo de valores obtenidos en el metodo main
        resultado = (a + b + c);
        System.out.println("La suma de los 3 valores es: " + resultado);
    }
    static class coche{
        public int puertas = 1;
        public void agregarPuerta(){
            this.puertas++;
        }
    }
}
