package delivery.strategy;

import delivery.factory.Pedido;
import delivery.singleton.ConfiguracionSistema;

public class EnvioExpress implements InterfaceEnvio {
    @Override
    public double calcular(Pedido pedido) {
        double impuesto = ConfiguracionSistema.getInstance().getImpuesto();
        return 15.0 + (15.0 * impuesto); // Costo base más alto por rapidez
    }
}
