package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {
    public String imprimir(List<Gasto> gastos, LocalDate fechaDeReporte) {
        String reporte = "";
        int total = 0;
        int gastosDeComida = 0;

        reporte = ("Expenses " + fechaDeReporte) + System.lineSeparator();

        for (Gasto gasto : gastos) {

            gastosDeComida += gasto.montoComida();

            reporte += (gasto.nombre()
                    + "\t" + gasto.monto()
                    + "\t" + esExeso(gasto))
                    + System.lineSeparator();

            total += gasto.monto();
        }

        reporte += ("Gastos de comida: " + gastosDeComida) + System.lineSeparator();
        reporte += ("Total de gastos: " + total) + System.lineSeparator();
        return reporte;
    }

    private String esExeso(Gasto gasto) {
        return gasto.esExesoComidas() ? "X" : " ";
    }
}
