import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        ConsultarMoneda consulta = new ConsultarMoneda();
        int opcion=0;
        while (opcion!=8){

        System.out.println("""
               
               ****************************************
               Sea bienvenido/a al Conversor de Monedas
               Ingrese la conversi]on que desea realizar
               
                1) Dólar  =>>  Peso Chileno
                2) Peso Chileno  =>>  Dólar
                3) Dólar =>> Peso Argentino
                4) Peso Argentino =>> Dólar
                5) Dólar =>> Real Brasileño
                6) Real Brasileño =>> Dólar
                7) Convertir otra moneda
                8) Salir
               
               Elija una opción válida
               ****************************************""");

            opcion = lectura.nextInt();
            lectura.nextLine();


            switch (opcion){

                case 1:
                ConvertirMoneda.convertir("USD","CLP", consulta,lectura);
                break;

                case 2:
                ConvertirMoneda.convertir("CLP","USD", consulta,lectura);
                break;

                case 3:
                ConvertirMoneda.convertir("USD","ARS", consulta,lectura);
                break;

                case 4:
                ConvertirMoneda.convertir("ARS","USD", consulta,lectura);
                break;

                case 5:
                ConvertirMoneda.convertir("USD","BRL", consulta,lectura);
                break;

                case 6:
                ConvertirMoneda.convertir("BRL","USD", consulta,lectura);
                break;

                case 7:
                ConvertirMoneda.convertirOtraMoneda(consulta,lectura);
                break;

                case 8:
                System.out.println("Saliendo...");
                break;

                default:
                System.out.println("Opción no válida");
                break;
            }


        }

    }


}
