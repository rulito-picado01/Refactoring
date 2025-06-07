package oop2.tp3.ejercicio1;

public class LibroNuevoLanzamiento extends Libro {

    public LibroNuevoLanzamiento(String nombre) {
        super(nombre, Libro.NUEVO_LANZAMIENTO);

    }

    @Override
    public double calcularMonto(int diasAlquilados) {
        int monto = 0;
        monto += diasAlquilados * 3;
        return monto;
    }

    @Override
    public int plusNuevoLanzamiento(int diasAlquilados) {
        if (diasAlquilados > 1) {
            return 1;
        }

        return 0;
    }

}
