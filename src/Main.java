import java.util.Scanner;
public class Main {
    static String BOLD ="\033[1m";
    static String UNDERLINE ="\033[4m";
    static String END ="\033[0m";
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0, depositar = 0, retiro = 0;
        float saldo, tope;
        saldo = Float.parseFloat(args[0]);
        tope = Float.parseFloat(args[1]);
        System.out.println("\t\t\t\t" +UNDERLINE +BOLD +"PROGRAMA CAJERO AUTOMÁTICO" +END);
        do {
            System.out.println();
            System.out.println("\t\t\t\t\t" + BOLD + "Menú de Opciones" + END);
            System.out.println("\t\t\t\t\t" + BOLD + "================" + END);
            System.out.println();
            System.out.println("1. Retirada de dinero");
            System.out.println("2. Ingreso de dinero");
            System.out.println("3. Salir");
            System.out.println("¿Qué operación desea realizar?");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es de: " + saldo + "€");
                    System.out.println("Teclee dinero a retirar:");
                    retiro = leer.nextInt();
                    if (retiro <= tope) {
                        System.out.println("Usted retiró " + retiro + "€");
                        saldo = saldo - retiro;
                        tope = tope - retiro;
                    } else {
                        System.out.println("Intenta retirar " + retiro + "€");
                        System.out.println("Tiene establecido ahora un tope de " + tope + "€");
                    }
                    System.out.println("Su saldo actual es de " + saldo + "€");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Su saldo actual es de: " + saldo + "€");
                    System.out.println("Teclee dinero a ingresar:");
                    depositar = leer.nextInt();
                    System.out.println("Usted ingresó " + depositar + "€");
                    saldo = saldo + depositar;
                    System.out.println("Su saldo actual es de " + saldo + "€");
                    System.out.println();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Número no válido");
            }
        } while (opcion < 3);
    }
}