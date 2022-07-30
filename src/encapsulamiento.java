/**
 * Propiedades publicas y privadas
 * Privada solamente y unicamenta se puede implementar dentro de la clase
 * publica como dentor de la clase como fuera de la clase
 * */

public class encapsulamiento {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo();
        coche.setTipo("Coche");
        coche.setVelocidadMaxima(120);
        coche.setRapido(true);

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Moto");
        moto.setVelocidadMaxima(70);
        moto.setRapido(false);

        System.out.println(coche.getTipo() + " " + coche.getVelocidadMaxima() + " " + coche.isRapido());
        System.out.println(moto.getTipo() + " " + moto.getVelocidadMaxima() + " " + moto.isRapido());
        /**
        String tipo = coche.getTipo();
        System.out.println(tipo);*/
    }
}
class Vehiculo{
    private String tipo;
    private int velocidadMaxima;
    private int estado;
    private boolean rapido;
    private String sonido;
    public void setSonido(String sonido){
        this.sonido =sonido;
    }
    public String getSonido(){
        return this.sonido;
    }
    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }

    public boolean isRapido() {
        return this.rapido;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    public void setTipo(String tipo){
        if (this.estado == 0){
            this.tipo = tipo;
        }
    }
    public String getTipo(){
        return this.tipo;
    }
    /**
    * En el caso de los booleanos la consulta es la siguiente
    * en vez de get se llamara como in ejemplo
    * public void inEstado(){ return this.estado; }
    * */
}
