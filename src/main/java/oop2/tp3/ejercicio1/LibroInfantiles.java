package oop2.tp3.ejercicio1;

public class LibroInfantiles extends Libro {

    public LibroInfantiles(String nombre) {
        super(nombre, Libro.INFANTILES);
    }

    @Override
    public double calcularMonto(int diasAlquilados) {
        int monto = 0;
        monto += 2;
        if (diasAlquilados > 2)
            monto += (diasAlquilados - 2) * 1.5;
        return monto;
    }

    @Override
    public int plusNuevoLanzamiento(int diasAlquilados) {
        return 0;
    }

}
