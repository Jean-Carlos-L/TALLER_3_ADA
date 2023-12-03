import org.ada.Pregunta1.StoogeSort;
import org.ada.commons.GenerarArreglos;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestPregunta1 {
    @Test
    // Se genera un arreglo aleatorio de tamaño n
    public void testStoogeSort(){
        StoogeSort stoogeSort = new StoogeSort();

        for (int n : new int[]{10, 100, 1000,10000}) {
            // Se genera un arreglo aleatorio de tamaño n
            int[] A = GenerarArreglos.generarArreglo(n);
            int[] B= A.clone();
            // Se mide el tiempo inicial
            long inicio = System.currentTimeMillis();

            // Se aplica el algoritmo de ordenamiento
            stoogeSort.stoogeSort(A, 0, n - 1);
            Arrays.sort(B);
            assertArrayEquals(A,B);

            // Se mide el tiempo final
            long fin = System.currentTimeMillis();

            // Se calcula el tiempo transcurrido
            double tiempo = (fin - inicio) / 1000.0; // Convertir a segundos

            // Se imprime el resultado
            System.out.printf("El tiempo de ejecucion para n = %d fue de %.6f segundos%n", n, tiempo);
        }
    }

}
