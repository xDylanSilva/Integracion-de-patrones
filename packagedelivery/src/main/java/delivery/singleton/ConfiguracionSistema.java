package delivery.singleton;

public class ConfiguracionSistema {
    // Declaración singleton
    private static ConfiguracionSistema instancia;

    private double impuesto;
    private String moneda;
    private double descuentoGlobal;

    // Constructor privado 
    private ConfiguracionSistema() {
        this.impuesto = 0.15; 
        this.moneda = "USD";
        this.descuentoGlobal = 0.0;
    }

    // Método público estático para obtener la instancia única 
    public static ConfiguracionSistema getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    // Getters y Setters 
    public double getImpuesto() { 
        return impuesto; 
    }
    public void setImpuesto(double impuesto) { 
        this.impuesto = impuesto;
    }

    public String getMoneda() { 
        return moneda; 
    }
    public void setMoneda(String moneda) { 
        this.moneda = moneda; 
    }
}