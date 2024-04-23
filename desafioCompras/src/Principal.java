import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el limite de la tarjeta: ");
        double limite = scanner.nextInt();

        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);

        int salir = 1;
        while (salir != 0) {
            System.out.println("Agregue la descripción del producto: ");
            String descripcion = scanner.next();

            System.out.println("Ingrese el valor del producto: ");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(descripcion, valor);
            boolean compraRealziada = tarjeta.lanzarCompra(compra);

            if (compraRealziada) {
                System.out.println("Compra realizada!");
                System.out.println("Escriba 0 para salir o 1 para continuar");
                salir = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente");
                salir = 0;
            }
            System.out.println("***********************");
            System.out.println("Compras realizadas:\n");
            Collections.sort(tarjeta.getListaDeCompra());
            for (Compra compras: tarjeta.getListaDeCompra()) {
                System.out.println(compras.getDescripcion() + " - " + compras.getValor());
            }
            System.out.println("***********************");
            System.out.println("\nSaldo de la tarjeta: " + tarjeta.getSaldo());
        }
    }
}
