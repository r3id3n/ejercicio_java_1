public class ejercicio_tema_4 {
    public static void main(String[] args) {
        /***********EJERCICIOS *******/
        int numeroIf = 4;
        if (numeroIf == 0){
            System.out.println("El valor es cero " + numeroIf);
        }else if (numeroIf >= 0){
            System.out.println("el valor es positivo " + numeroIf);
        }else {
            System.out.println("el valor es negativo " + numeroIf);
        }
        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("El valor desplegado es " + numeroWhile);
        }
        do {
            System.out.println("se declara " + numeroWhile);
            numeroWhile++;
        }while (numeroWhile < 3);
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Valor total de for " + numeroFor);
        }
        int numeroSwitch = 5;
        switch (numeroSwitch){
            case 4:
                System.out.println("Es verano");
                break;
            case 1:
                System.out.println("Es Invierno");
                break;
            case 2:
                System.out.println("Es primavera");
                break;
            case 3:
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("No corresponde a alguna estacion");
        }
    }
}
