package oop2.tp3.ejercicio1;

public class CopiaLibro {
    private Libro libro;

    public CopiaLibro(Libro libro) {
        this.libro = libro;
    }

    public Libro libro() {
        return libro;
    }

    public Double calcularMonto(int diasAlquilados) {
        return libro.calcularMonto(diasAlquilados);
    }
}