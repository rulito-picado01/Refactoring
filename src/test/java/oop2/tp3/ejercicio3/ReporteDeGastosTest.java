package oop2.tp3.ejercicio3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReporteDeGastosTest {

    @Test
    public void gastosDesayunoMayorA1000() {
        var g1 = new GastoDesayuno(1000);

        // g1.monto = 1000;
        var reporte = new ReporteDeGastos();
        assertEquals("Expenses 2024-04-23\n" +
                "Desayuno	1000	 \n" +
                "Gastos de comida: 1000\n" +
                "Total de gastos: 1000\n", reporte.imprimir(List.of(g1), LocalDate.of(2024, 04, 23)));
    }

    @Test
    public void gastosMultiplesCenaYAlquilerAuto() {
        var g1 = new GastoAlquilerAuto(10001);

        // g1.monto = 10001;
        var g2 = new GastoCena(5000);

        // g2.monto = 5000;
        var reporte = new ReporteDeGastos();
        var salida = reporte.imprimir(List.of(g1, g2), LocalDate.of(2024, 10, 10));
        // System.out.println(salida);
        assertEquals("Expenses 2024-10-10\n" +
                "Alquiler de Autos	10001	 \n" +
                "Cena	5000	 \n" +
                "Gastos de comida: 5000\n" +
                "Total de gastos: 15001\n", salida);
    }

    @Test
    public void gastosCenaMayorA500() {
        var g1 = new GastoCena(501);

        // g1.monto = 501;
        var reporte = new ReporteDeGastos();
        assertEquals("Expenses 2024-04-23\n" +
                "Cena	501	 \n" +
                "Gastos de comida: 501\n" +
                "Total de gastos: 501\n", reporte.imprimir(List.of(g1), LocalDate.now()));
    }

    @Test
    public void gastosMultiples() {
        var g1 = new GastoCena(501);

        // g1.monto = 501;
        var g2 = new GastoDesayuno(1000);

        // g2.monto = 1000;
        var g3 = new GastoAlquilerAuto(10001);

        // g3.monto = 10001;
        var reporte = new ReporteDeGastos();
        var salida = reporte.imprimir(List.of(g1, g2, g3), LocalDate.of(2024, 10, 10));
        System.out.println(salida);
        assertEquals("Expenses 2024-10-10\n" +
                "Cena	501	 \n" +
                "Desayuno	1000	 \n" +
                "Alquiler de Autos	10001	 \n" +
                "Gastos de comida: 1501\n" +
                "Total de gastos: 11502\n", salida);
    }
}