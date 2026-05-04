package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Arrays;

public class DiscountApplierTest {

    @Test
    void testAplicarDescuentoHome() {
        // 1. Crear el Mock del DAO
        ProductDao daoMock = Mockito.mock(ProductDao.class);

        // 2. Definir el producto de prueba (Usando String "HOME")
        Product p = new Product("Silla", 100.0, "HOME");
        
        // 3. Programar el comportamiento del Mock
        Mockito.when(daoMock.all()).thenReturn(Arrays.asList(p));

        // 4. Ejecutar la lógicaD
        DiscountApplier applier = new DiscountApplier(daoMock);
        applier.setNewPrices();

        // 5. Verificar: 100.0 - 10% = 90.0
        Assertions.assertEquals(90.0, p.getPrice(), 0.001);
    }
}