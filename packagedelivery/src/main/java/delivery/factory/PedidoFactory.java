package delivery.factory;

public class PedidoFactory {
    
    /**
     * Crea un pedido basado en el tipo solicitado.
     * Oculta la lógica de creación según los datos de entrada.
     */
    public static Pedido crearPedido(String tipo, String id) {
        if (tipo.equalsIgnoreCase("nacional")) {
            return new PedidoNacional(id);
        } else if (tipo.equalsIgnoreCase("internacional")) {
            return new PedidoInternacional(id);
        }
        throw new IllegalArgumentException("Tipo de pedido no reconocido: " + tipo);
    }
}
