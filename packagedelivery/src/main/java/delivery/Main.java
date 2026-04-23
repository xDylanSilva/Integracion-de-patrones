package delivery;

import delivery.decorator.CifradoDecorator;
import delivery.decorator.InterfaceNotificacion;
import delivery.decorator.LoggingDecorator;
import delivery.decorator.NotificacionBase;
import delivery.factory.Pedido;
import delivery.factory.PedidoFactory;
import delivery.observer.AreaLogistica;
import delivery.observer.Cliente;
import delivery.singleton.ConfiguracionSistema;
import delivery.strategy.EnvioEstandar;
import delivery.strategy.EnvioExpress;

public class Main {
    public static void main(String[] args) {
        // Singleton: Configuración global
        ConfiguracionSistema config = ConfiguracionSistema.getInstance();
        config.setImpuesto(0.15);
        
        System.out.println("SISTEMA DE ENTREGAS - Moneda: " + config.getMoneda());

        // Factory: Creación de un pedido internacional
        Pedido pedido = PedidoFactory.crearPedido("internacional", "INT-101");

        // Observer: Suscripción de interesados
        pedido.agregarObserver(new Cliente("Andrés"));
        pedido.agregarObserver(new AreaLogistica());

        // Strategy: Cambio dinámico de cálculo de costo
        System.out.println("\n--- Cálculo de Costos ---");
        
        pedido.setstrategy(new EnvioEstandar());
        System.out.println("Costo Estándar: " + pedido.obtenerCostoFinal());

        pedido.setstrategy(new EnvioExpress());
        System.out.println("Costo Express: " + pedido.obtenerCostoFinal());

        // Cambio de estado (Notifica automáticamente)
        System.out.println("\n--- Actualización de Pedido ---");
        pedido.setEstado("EN PREPARACIÓN");
        pedido.setEstado("ENVIADO");

        // Decorator: Extensión de notificaciones
        System.out.println("\n--- Salida de Notificaciones ---");
        InterfaceNotificacion notify = new NotificacionBase();
        notify = new LoggingDecorator(notify);
        notify = new CifradoDecorator(notify);

        notify.enviar("El pedido " + pedido.getId() + " está en camino.");
    }
}