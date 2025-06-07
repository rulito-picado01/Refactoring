package oop2.tp3.ejercicio3;

public class GastoDesayuno extends Gasto {

    public GastoDesayuno(int monto) {
        super(monto);
    }

    @Override
    public String nombre() {
        return "Desayuno";
    }

    @Override
    protected int montoComida() {
        return this.monto;
    }

    @Override
    protected boolean esExesoComidas() {
        if (this.monto() > 1000) {
            return true;
        }
        return false;
    }

}
