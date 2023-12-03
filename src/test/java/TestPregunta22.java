import org.ada.Pregunta2.Intento2;
import org.ada.Pregunta2.ModaJava;
import org.ada.commons.GenerarArreglos;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPregunta22 {
    @Test
    public void testEncontrarModa() {

        Intento2 intento2 = new Intento2();
        ModaJava modaJava = new ModaJava();
        for (int n : new int[]{10, 100, 1000, 10000}) {

            int[] A = GenerarArreglos.generarArreglo(n);
            List<Integer> numeros = new ArrayList<>(Arrays.asList(Arrays.stream(A).boxed().toArray(Integer[]::new)));

            var modaDivideYVenceras = intento2.encontrarModa(numeros);
            var modaJavaList = modaJava.encontrarModas(A);

            assertTrue(modaDivideYVenceras.containsAll(modaJavaList));
        }
    }
}
