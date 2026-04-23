package delivery.factory;

import java.util.ArrayList;
import java.util.List;

import delivery.observer.Observer;
import delivery.strategy.InterfaceEnvio;

public abstract class Pedido {
    private String id;
    private String estado;
    private List<Observer> observers = new ArrayList<>();
    private InterfaceEnvio strategy;

    public Pedido(String id) {
        this.id = id;
        this.estado = "CREADO";
    }

    // Métodos para el patrón Strategy 
    public void setstrategy(InterfaceEnvio strategy) {
        this.strategy = strategy;
    }

     public double obtenerCostoFinal() {
        if (strategy == null) {
            throw new IllegalStateException("Debe seleccionar una estrategia de envío");
        }
        return strategy.calcular(this);
    }


    // Métodos para el patrón Observer 
    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificar();
    }

    public void agregarObserver(Observer o) {
        observers.add(o);
    }

    private void notificar() {
        for (Observer o : observers) {
            o.actualizar(this.id, this.estado);
        }
    }

    public String getId() { 
        return id; 
    }
    public String getEstado() { 
        return estado; 
    }
}