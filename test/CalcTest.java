package test;

public class CalcTest {

    private calc calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new calc();
    }

    @Test
    public void testSumar() {
        assertEquals(5, calculadora.suma(2, 3));
        assertEquals(0, calculadora.suma(-2, 2));
        assertEquals(-5, calculadora.suma(-2, -3));
    }

    private void assertEquals(int i, int suma) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testRestar() {
        assertEquals(1, calculadora.resta(3, 2));
        assertEquals(-4, calculadora.resta(-2, 2));
        assertEquals(1, calculadora.resta(-2, -3));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicacion(2, 3));
        assertEquals(-4, calculadora.multiplicacion(-2, 2));
        assertEquals(6, calculadora.multiplicacion(-2, -3));
    }
}
