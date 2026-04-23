package delivery.strategy;

import delivery.factory.Pedido;

public class EnvioProgramado implements InterfaceEnvio {
    @Override
    public double calcular(Pedido pedido) {
        return 8.0; 
    }
}