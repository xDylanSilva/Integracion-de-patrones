package delivery.strategy;

import delivery.factory.Pedido;

public interface InterfaceEnvio {
    // Método que cada estrategia implementará según su lógica
    double calcular(Pedido pedido);
}
