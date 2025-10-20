import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio de programa");

        Cliente cliente1 = new Cliente(1, "Ana");
        Cliente cliente2 = new Cliente(2, "Pedro");
        Cliente cliente3 = new Cliente(3, "María");
        Cliente cliente4 = new Cliente(4, "Juan");
        Cliente cliente5 = new Cliente(5, "Sofía");
        Cliente cliente6 = new Cliente(6, "Carlos");
        Cliente cliente7 = new Cliente(7, "Laura");
        Cliente cliente8 = new Cliente(8, "Miguel");

        List<Cliente> clientesCajero1 = Arrays.asList(cliente1, cliente2, cliente3, cliente4);
        List<Cliente> clientesCajero2 = Arrays.asList(cliente5, cliente6, cliente7, cliente8);

        Cajero cajero1 = new Cajero(1, "Cajero1", clientesCajero1);
        Cajero cajero2 = new Cajero(2, "Cajero2", clientesCajero2);

        cajero1.start();
        cajero2.start();

        try {
            cajero1.join();
            cajero2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin de programa");
    }
}