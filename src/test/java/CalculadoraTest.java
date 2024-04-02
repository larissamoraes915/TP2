import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        // Arrange
        Calculadora calculadora = new Calculadora();
        int a = 3;
        int b = 5;
        int esperado = 8;

        // Act
        int resultado = calculadora.somar(a, b);

        // Assert
        assertEquals(esperado, resultado);
    }
}