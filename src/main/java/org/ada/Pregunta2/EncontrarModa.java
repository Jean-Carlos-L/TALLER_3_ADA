package org.ada.Pregunta2;

import java.util.HashMap;
import java.util.Map;

public class EncontrarModa {
    public int[] encontrarModa(int[] A, int i, int j){
        // Caso base: si el vector tiene un solo elemento, se devuelve ese elemento y su frecuencia
        if (i == j) {
            return new int[]{A[i]};
        }

        // Caso recursivo: se divide el vector en dos mitades y se llama al algoritmo sobre cada una
        int m = (i + j) / 2;
        int[] modaIzquierda = encontrarModa(A, i, m);
        int[] modaDerecha = encontrarModa(A, m + 1, j);

        // Combinar las soluciones de las dos mitades
        Map<Integer, Integer> frecuencias = new HashMap<>();

        // Agregar frecuencias de la primera mitad al diccionario
        for (int elemento : modaIzquierda) {
            frecuencias.put(elemento, frecuencias.getOrDefault(elemento, 0) + 1);
        }

        // Actualizar frecuencias de la segunda mitad en el diccionario
        for (int elemento : modaDerecha) {
            frecuencias.put(elemento, frecuencias.getOrDefault(elemento, 0) + 1);
        }

        // Encontrar el máximo valor de frecuencia en el diccionario
        int maxFrecuencia = 0;
        for (int frecuencia : frecuencias.values()) {
            maxFrecuencia = Math.max(maxFrecuencia, frecuencia);
        }

        // Crear una lista para almacenar la moda del vector completo
        int finalMaxFrecuencia = maxFrecuencia;
        int[] moda = frecuencias.entrySet().stream()
                .filter(entry -> entry.getValue() == finalMaxFrecuencia)
                .mapToInt(Map.Entry::getKey)
                .toArray();

        return moda;
    }
}
