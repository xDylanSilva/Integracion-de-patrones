package delivery.decorator;

// Decorador para agregar Cifrado
public class CifradoDecorator extends NotificacionDecorator {
    public CifradoDecorator(InterfaceNotificacion componente) {
        super(componente);
    }

    @Override
    public void enviar(String mensaje) {
        String mensajeCifrado = "[CIFRADO] " + mensaje + " [CIFRADO]";
        super.enviar(mensajeCifrado);
    }
}