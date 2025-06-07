package oop2.tp3.ejercicio3;

public class GastoCena extends Gasto {

    public GastoCena(int monto) {
        super(monto);
    }

    @Override
    public String nombre() {
        return "Cena";
    }

    @Override
    protected int montoComida() {
        return monto;
    }

    @Override
    protected boolean esExesoComidas() {
        if (this.monto() > 5000) {
            return true;
        }
        return false;

    }

}
