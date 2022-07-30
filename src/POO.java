public class POO {
    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println(coche.velocidadActual);
        coche.acelerar();
        System.out.println(coche.velocidadActual);
        coche.decelerar();
        System.out.println(coche.velocidadActual);
        System.out.println(coche.numeroDePuertas);
        System.out.println(coche.velocidadMaxima);

        Coche coche1 = new Coche(4, 90);
        System.out.println(coche1.numeroDePuertas);
        System.out.println(coche1.velocidadMaxima);
    }
}
class Coche{
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;
    public Coche(){
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("estoy en el contructor SIN PARAMETROS");
    }
    public Coche(int puerta, int velocidad){
        this.numeroDePuertas = puerta;
        this.velocidadMaxima = velocidad;
        System.out.println("estoy en el contructor CON PARAMETROS");
    }
    public void acelerar(){
        velocidadActual+= 15;
    }
    public void decelerar(){
        velocidadActual-= 5;
    }
}
