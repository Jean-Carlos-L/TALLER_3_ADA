import org.ada.Pregunta2.Intento2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestPregunta22 {
    @Test
    public void testEncontrarModa() {
        //Ahora necesito probarlo con 2 numeros de moda

        //[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2}
        int[] A = {3, 5,7,6, 1, 1,3,4,10,12};
        int n = A.length;
        int[] modaResultado = Intento2.encontrarModa(A, 0, n - 1);
        int[] modaEsperada = {1,3};
        System.out.println("Moda: " + Arrays.toString(modaResultado));
        assertArrayEquals(modaEsperada, modaResultado);
    }
}
