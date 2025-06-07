package oop2.tp3.ejercicio1;

public class LibroRegular extends Libro {

    public LibroRegular(String nombre) {
        super(nombre, Libro.REGULARES);
    }

    @Override
    public double calcularMonto(int diasAlquilados) {
        double monto = 0;
        monto += 2;
        if (diasAlquilados > 2)

            monto += RecargoXDiasAlquilado(diasAlquilados);
        return monto;

    }

    private double RecargoXDiasAlquilado(int diasAlquilados) {
        double cantRecargo = diasAlquilados - 2;
        return (cantRecargo * 1.5);

    }

    @Override
    public int plusNuevoLanzamiento(int diasAlquilados) {
        return 0;
    }

}
