package ejercicio_tema_4_smart.Clase;

import ejercicio_tema_4_smart.herencia.SmartPhone;
import ejercicio_tema_4_smart.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartWatch sw = new SmartWatch("Samsung", "SmartWatch Galaxy 4", "wifi", 2022);
        System.out.println(sw);
        SmartPhone sp = new SmartPhone("Samsung", "S22 PRO", "wifi",2022);
        System.out.println(sp);
    }
}
