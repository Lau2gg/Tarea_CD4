package tareacd4;

import banco.CtaCorriente;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CtaCorriente miCuenta;
        double saldoActual;

        operativa_cuenta();
    }

    public static void operativa_cuenta() {
        CtaCorriente miCuenta;
        miCuenta = new CtaCorriente("Koldo García Ábalos", "0001-2345-07-1234567890", 5000, 0);
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea retirar?");
            double importe = entrada.nextDouble();
            miCuenta.retirar(importe);
            
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea ingresar en su cuenta?");
            double importe = entrada.nextDouble();
            miCuenta.ingresar(importe);
            
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
