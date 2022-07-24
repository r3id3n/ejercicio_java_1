
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
