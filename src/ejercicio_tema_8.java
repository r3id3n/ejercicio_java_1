public class ejercicio_tema_8 {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(31);
        persona1.setNombre("Felipe Valencia Sanchez");
        persona1.setTelefono("+56967203745");

        Persona persona2 = new Persona();
        persona2.setEdad(6);
        persona2.setNombre("Elizabeth Valencia");
        persona2.setTelefono("967203745");

        System.out.println("Edad: " + persona1.getEdad() + " Nombre: " + persona1.getNombre() + " Telefono: " + persona1.getTelefono() );
        System.out.println("Edad: " + persona2.getEdad() + " Nombre: " + persona2.getNombre() + " Telefono: " + persona2.getTelefono() );
    }
}
class Persona{
    public int edad;
    public String nombre;
    public String telefono;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
