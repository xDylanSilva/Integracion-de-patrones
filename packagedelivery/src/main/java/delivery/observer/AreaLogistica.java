package delivery.observer;

public class AreaLogistica implements Observer {
    @Override
    public void actualizar(String idPedido, String nuevoEstado) {
        System.out.println("[Logística]: Actualizando hoja de ruta para pedido " 
                           + idPedido + ". Nuevo estado: " + nuevoEstado);
    }
}
