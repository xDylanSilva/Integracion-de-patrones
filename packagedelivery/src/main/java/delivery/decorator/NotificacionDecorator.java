package delivery.decorator;

public abstract class NotificacionDecorator implements InterfaceNotificacion {
    protected InterfaceNotificacion componente;

    public NotificacionDecorator(InterfaceNotificacion componente) {
        this.componente = componente;
    }

    @Override
    public void enviar(String mensaje) {
        componente.enviar(mensaje);
    }
}