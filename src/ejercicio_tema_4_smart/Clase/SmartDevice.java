package ejercicio_tema_4_smart.Clase;

public class SmartDevice {
    protected String Marca;
    protected String Modelo;
    protected String Conexion;
    protected int year;

    public SmartDevice(){

    }
    public SmartDevice(String Marca, String Modelo, String Conexion, int year){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Conexion = Conexion;
        this.year = year;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Conexion='" + Conexion + '\'' +
                ", year=" + year +
                '}';
    }

}
