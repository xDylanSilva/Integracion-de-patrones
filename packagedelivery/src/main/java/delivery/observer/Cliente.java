package delivery.observer;

public class Cliente implements Observer {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String idPedido, String nuevoEstado) {
        System.out.println("[Notificación Cliente " + nombre + "]: El pedido " 
                           + idPedido + " ahora está " + nuevoEstado);
    }
}
