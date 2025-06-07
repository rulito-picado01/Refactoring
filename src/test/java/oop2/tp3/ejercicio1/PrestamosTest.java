package oop2.tp3.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class PrestamosTest {

    @Test
    public void prestamoLibRegular() {
        Libro elTunel = new LibroRegular("El Túnel regular");
        CopiaLibro elTunelRegCopia = new CopiaLibro(elTunel);
        Alquiler alquilerElTunel = new Alquiler(elTunelRegCopia, 5);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(6.5, resultado[0]);
        assertEquals(1, resultado[1]);
        System.out.println(elTunel.nombre());

    }

    @Test
    public void prestamoLibInfantil() {
        Libro elTunel = new LibroInfantiles("El Túnel infantil");
        CopiaLibro elTunelInfCopia = new CopiaLibro(elTunel);
        Alquiler alquilerElTunel = new Alquiler(elTunelInfCopia, 5);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(6.0, resultado[0]);
        assertEquals(1, resultado[1]);

    }

    @Test
    public void prestamoLibNuevoLanzamiento() {
        Libro elTunel = new LibroNuevoLanzamiento("El Túnel nuevo lanzamiento");
        CopiaLibro elTunelNLCopia = new CopiaLibro(elTunel);
        Alquiler alquilerElTunel = new Alquiler(elTunelNLCopia, 5);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(15.0, resultado[0]);
        assertEquals(2, resultado[1]);

    }

    @Test
    public void prestamosMultiples() {
        Libro elTunel = new LibroRegular("El Túnel");
        Libro antesDelFin = new LibroRegular("Antes del Fin");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(10.0, resultado[0]);
        assertEquals(2, resultado[1]);

    }

}
