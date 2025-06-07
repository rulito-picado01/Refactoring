package oop2.tp3.ejercicio2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Recaudacion {

    private LectorCsv lectorCsv;
    private List<String[]> data;

    public Recaudacion(LectorCsv lectorCsv) {
        this.lectorCsv = lectorCsv;
    }

    public List<Map<String, String>> where(Map<String, String> options)
            throws IOException {
        data = this.lectorCsv.createList();

        if (options.containsKey("company_name")) {
            data = filter((fila) -> fila[1].equals(options.get("company_name")));
        }

        if (options.containsKey("city")) {
            data = filter((fila) -> fila[4].equals(options.get("city")));
        }

        if (options.containsKey("state")) {
            data = filter((fila) -> fila[5].equals(options.get("state")));
        }

        if (options.containsKey("round")) {
            data = filter((fila) -> fila[9].equals(options.get("round")));
        }

        List<Map<String, String>> output = transformToListOfHashMap();
        return output;
    }

    private List<Map<String, String>> transformToListOfHashMap() {
        List<Map<String, String>> output = new ArrayList<Map<String, String>>();

        output = data.stream()
                .map(fila -> {
                    Map<String, String> mapped = new HashMap<String, String>();
                    mapped.put("permalink", fila[0]);
                    mapped.put("company_name", fila[1]);
                    mapped.put("number_employees", fila[2]);
                    mapped.put("category", fila[3]);
                    mapped.put("city", fila[4]);
                    mapped.put("state", fila[5]);
                    mapped.put("funded_date", fila[6]);
                    mapped.put("raised_amount", fila[7]);
                    mapped.put("raised_currency", fila[8]);
                    mapped.put("round", fila[9]);
                    return mapped;
                })
                .collect(Collectors.toList());
        return output;
    }

    private List<String[]> filter(Predicate<String[]> predicate) {
        List<String[]> results = data.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        return results;
    }
}
