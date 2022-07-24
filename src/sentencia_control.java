import java.time.MonthDay;

public class sentencia_control {
    public static void main(String[] args) {
        //if - else - else if
        String estacion = "verano";
        if (estacion == "primavera"){
            System.out.println("Es primavera");
        }else if (estacion == "verano"){
            System.out.println("Es verano");
        }else {
            System.out.println("Es otra estacion");
        }
        //While
        /**
        *WHILE
         * HAZ
         * RESTA UNO AL CONTADOR
         * MIENTRAS (CONTADOR SEA MAYOR QUE 10)
         *DO - WHILE
         * MIENTRA (CONTADOR SEA MAYOR QUE 10)
         * RESTA UNO AL CONTADOR
         */
        int contador = 10;
        /**
        while (contador > 0) {
            System.out.println(contador);
            //contador = contador-1;
            contador--;
        }
         */
        do {
            System.out.println("Ciclo do - while " + contador);
            contador--;
        }while (contador > 0);
        /**
         * Ciclo FOR
         *"PARA" (INICIALIZACION; COMPARACION; ACCION)
         *"PARA" (CONTADOR MAYOR QUE 0; CONTADOR IGUAL A CONTADOR MENOS 1)
         * IMPRIMIR EL VALOR DE LA VARIABLE CONTADOR
         */
        for (contador = 1; contador <= 10; contador = contador +1){
            System.out.println("Ciclo for " + contador);
        }
        /**int lista[] = new int[5];*/
        int lista[] = {10,20,30,40,50};
        for (int i = 0; i < lista.length;i++){
            System.out.println(lista[i]);
        }
        /**
         * SWITCH(ESTACION)
         * CASO 'VERANO'
         * IMPRIME "ES VERANO"
         * CASO 'INVIERNO'
         * IMPRIME "ES INVIERNO"
         * */
        estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            default:
                System.out.println(estacion);
        }
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

