public class ejercicio_tema_9 {
    public static void main(String[] args) {

        System.out.println("Cliente");
        Cliente client = new Cliente();
        client.setNombre("Felipe Valencia");
        client.setEdad(31);
        client.setTelefono("+56967203745");
        client.setCredito("Sin credito");
        System.out.println("Nombre: "+ client.getNombre() + " " + " Edad " + client.getEdad() + " " + " Telefono " + client.getTelefono() + " " + " Cretido: " + client.getCredito());

        System.out.println("Empleado");
        Trabajador employees = new Trabajador();
        employees.setNombre("Felipe Valencia");
        employees.setEdad(31);
        employees.setTelefono("+56967203745");
        employees.setSalario(2500.34);
        System.out.println("Nombre: "+ employees.getNombre() + " " + " Edad " + employees.getEdad() + " " + " Telefono " + employees.getTelefono() + " " + " Salario: " + employees.getSalario());

    }
}
class Personas{
    public int edad;
    public String nombre;
    public String telefono;
    //Getter and Setter

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
class Cliente extends Personas{
    public String credito;

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }
}
class Trabajador extends Personas{
    public double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}


