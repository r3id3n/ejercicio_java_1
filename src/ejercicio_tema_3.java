public class ejercicio_tema_3 {
    public static void main(String[] args) {
        String nombresx[] = {"Felipe", "Elizabeth"};
        String saludos = "Welcome";
        int i = 0;
        for (String nombre : nombresx){
            System.out.println(++i + " " + saludos.concat(" " + nombre) );
        }
    }
}
