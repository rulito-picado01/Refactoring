package oop2.tp3.ejercicio3;

abstract class Gasto {

    protected int monto;

    public Gasto(int monto) {
        this.monto = monto;
    }

    public abstract String nombre();

    public int monto() {
        return this.monto;
    }

    protected abstract int montoComida();

    protected abstract boolean esExesoComidas();
}
