package delivery.decorator;

// Implementación básica (el objeto que será envuelto)
public class NotificacionBase implements InterfaceNotificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje: " + mensaje);
    }
}