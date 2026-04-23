package delivery.observer;

public interface Observer {
    // Método que se ejecutará cuando el pedido cambie su estado
    void actualizar(String idPedido, String nuevoEstado);
}