package org.ada.Pregunta2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QuickSortModa {
    public List<Integer> quicksort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        } else {
            int pivot = arr.get(arr.size() / 2);
            List<Integer> left = arr.stream().filter(x -> x < pivot).collect(Collectors.toList());
            List<Integer> middle = arr.stream().filter(x -> x == pivot).toList();
            List<Integer> right = arr.stream().filter(x -> x > pivot).collect(Collectors.toList());
            List<Integer> sortedLeft = quicksort(left);
            List<Integer> sortedRight = quicksort(right);
            List<Integer> result = new ArrayList<>();
            result.addAll(sortedLeft);
            result.addAll(middle);
            result.addAll(sortedRight);
            return result;
        }
    }

    public List<Integer> encontrarModa(List<Integer> arr) {
        // Crear un mapa para almacenar la frecuencia de cada elemento
        Map<Integer, Integer> frecuencias = new HashMap<>();

        // Calcular la frecuencia de cada elemento en el arreglo
        for (int num : arr) {
            frecuencias.put(num, frecuencias.getOrDefault(num, 0) + 1);
        }


        List<Integer> moda = new ArrayList<>();
        int maxFrecuencia = 0;

        for (Map.Entry<Integer, Integer> entry : frecuencias.entrySet()) {
            int num = entry.getKey();
            int frecuencia = entry.getValue();

            if (frecuencia > maxFrecuencia) {
                moda.clear();
                moda.add(num);
                maxFrecuencia = frecuencia;
            } else if (frecuencia == maxFrecuencia) {
                moda.add(num);
            }
        }
        return moda;
    }

}
