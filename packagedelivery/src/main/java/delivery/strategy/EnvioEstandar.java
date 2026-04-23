package delivery.strategy;

import delivery.factory.Pedido;
import delivery.singleton.ConfiguracionSistema;

public class EnvioEstandar implements InterfaceEnvio {

    @Override
    public double calcular(Pedido pedido) {
        double impuesto = ConfiguracionSistema.getInstance().getImpuesto();
        return 5.0 + (5.0 * impuesto); 
    }
}
