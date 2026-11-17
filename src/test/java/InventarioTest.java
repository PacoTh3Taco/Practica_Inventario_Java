import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTest {

    @Test
    void calcularRestaAsignada() {
        int resultado = Inventario.calcularSubtotal(96, 38);
        assertEquals(58, resultado);
    }
}
