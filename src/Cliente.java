public class Cliente extends Thread {
    private long id;
    private String nombre;

    public Cliente(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
        int tiempo = (int) ((Math.random() + 1) * 3000);
        Thread.sleep(tiempo);
        System.out.println(nombre + " ha terminado su turno");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public long getId() {
        return id;
    }
}
