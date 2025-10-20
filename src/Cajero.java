import java.util.List;

public class Cajero extends Thread {
    private int id;
    private String nombre;
    private List<Cliente> clientes;

    public Cajero(int id, String nombre, List<Cliente> clientes) {
        this.id = id;
        this.nombre = nombre;
        this.clientes = clientes;
    }

    @Override
    public void run() {
        System.out.println("Cajero " + id + " empieza a atender a los clientes");
        for (Cliente cliente : clientes) {
            System.out.println("Cajero " + id + " atiende a " + cliente.getNombre());
            cliente.start();

            try {
                cliente.join();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Cajero " + id + " ha terminado de atender a todos sus clientes");
    }
}
