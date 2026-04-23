package delivery.decorator;

public class LoggingDecorator extends NotificacionDecorator {
    public LoggingDecorator(InterfaceNotificacion componente) {
        super(componente);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("[LOG]: Registrando notificación en base de datos...");
        super.enviar(mensaje);
    }
}
