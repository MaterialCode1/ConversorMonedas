import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String base_code, String target_code, ConsultarMoneda consulta, Scanner lectura) {
        double cantidadIngresada;
        double cantidadObtenida;

        Monedas monedas = consulta.buscarMoneda (base_code, target_code);
        System.out.println("La tasa de cambio de hoy" + monedas.base_code() + "=" + monedas.conversion_rate() +" "+ monedas.target_code());
        System.out.println("Ingrese la cantidad" +monedas.base_code());
        cantidadIngresada = Double.parseDouble(lectura.nextLine());
        cantidadObtenida = cantidadIngresada * monedas.conversion_rate();
        System.out.println(cantidadIngresada +" "+ monedas.base_code() +" = "+ cantidadObtenida+" "+ monedas.target_code());

    }
    public static void convertirOtraMoneda (ConsultarMoneda consulta, Scanner lectura){
        System.out.println("Ingrese el codigo de la moneda base:");
        String base_code = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda de cambio:");
        String target_code = lectura.nextLine().toUpperCase();
        convertir(base_code, target_code, consulta, lectura);
    }



}
