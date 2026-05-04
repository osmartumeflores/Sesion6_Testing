package tudelft.sum;

import org.junit.jupiter.api.Assertions; 
import org.junit.jupiter.api.Test;       
import java.util.Arrays;                 
import java.util.List;                   
public class TwoNumbersSumTest {

    @Test
    void testSumaConAcarreoFinal() {
        TwoNumbersSum calculator = new TwoNumbersSum();
        List<Integer> n1 = Arrays.asList(9, 9);
        List<Integer> n2 = Arrays.asList(1);

        // 99 + 1 debería ser 100 -> [1, 0, 0]
        List<Integer> esperado = Arrays.asList(1, 0, 0);
        List<Integer> resultado = calculator.add(n1, n2);

        Assertions.assertEquals(esperado, resultado);
    }
}