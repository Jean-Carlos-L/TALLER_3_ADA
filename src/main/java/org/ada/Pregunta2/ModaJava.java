package org.ada.Pregunta2;

import java.util.*;

public class ModaJava {
    public List<Integer> encontrarModas(int[] array) {

        Arrays.sort(array);

        Map<Integer, Integer> frecuenciaMap = new HashMap<>();

        for (int elemento : array) {
            frecuenciaMap.put(elemento, frecuenciaMap.getOrDefault(elemento, 0) + 1);
        }

        int maxFrecuencia = 0;
        for (int frecuencia : frecuenciaMap.values()) {
            maxFrecuencia = Math.max(maxFrecuencia, frecuencia);
        }

        List<Integer> modas = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frecuenciaMap.entrySet()) {
            int elemento = entry.getKey();
            int frecuencia = entry.getValue();

            if (frecuencia == maxFrecuencia) {
                modas.add(elemento);
            }
        }
        return modas;
    }
}
