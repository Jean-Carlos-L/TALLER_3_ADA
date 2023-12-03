import org.ada.Pregunta3.CompaAlgoritmos;
import org.ada.commons.GenerarArreglos;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestPregunta3 {

    CompaAlgoritmos compaAlgoritmos = new CompaAlgoritmos();
    int [] valoresPrueba = {10,10,10,50,50,50,100,100,100,500,500,500, 1000,1000,1000,2000,2000,2000,5000,5000,5000,10000,10000,10000};
    @Test
    public void testQuickSort(){
        for (int n: valoresPrueba) {
            int[] A = GenerarArreglos.generarArreglo(n);
            int[] B = A.clone();
            long inicio = System.currentTimeMillis();
            Arrays.sort(B);
            compaAlgoritmos.quicksort(A, 0, n - 1);
            assertArrayEquals(A, B);
            long fin = System.currentTimeMillis();
            double tiempo = (fin - inicio) / 1000.0;
            System.out.printf("El tiempo de ejecucion en QuickSort para n = %d fue de %.6f segundos%n", n, tiempo);
        }
    }
    @Test
    public void testInsertSort(){
        for (int n: valoresPrueba) {
            int[] A = GenerarArreglos.generarArreglo(n);
            int[] B = A.clone();
            long inicio = System.currentTimeMillis();
            Arrays.sort(B);
            compaAlgoritmos.insertionSort(A,  n );
            assertArrayEquals(A, B);
            long fin = System.currentTimeMillis();
            double tiempo = (fin - inicio) / 1000.0;
            System.out.printf("El tiempo de ejecucion en InsertSort para n = %d fue de %.6f segundos%n", n, tiempo);
        }
    }
    @Test
    public void testMergeSort(){
for (int n: valoresPrueba) {
            int[] A = GenerarArreglos.generarArreglo(n);
            int[] B = A.clone();
            long inicio = System.currentTimeMillis();
            Arrays.sort(B);
            compaAlgoritmos.mergeSort(A, 0, n - 1);
            assertArrayEquals(A, B);
            long fin = System.currentTimeMillis();
            double tiempo = (fin - inicio) / 1000.0;
            System.out.printf("El tiempo de ejecucion en MergeSort para n = %d fue de %.6f segundos%n", n, tiempo);
        }

    }

}
