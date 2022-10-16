public class ejercicio_tema_2 {
    public static void main(String[] args) {
        double total = precio(5);
        System.out.println("Valor con IVA: " + (int) Math.round(total));
    }
    static double precio(double objeto){
        return (objeto * 0.19) + objeto;
    }
}

