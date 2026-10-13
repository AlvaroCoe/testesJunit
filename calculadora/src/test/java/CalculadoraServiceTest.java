import org.example.CalculadoraService;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraServiceTest {

    // CP01: Teste de soma com números positivos
    @Test
    public void cp01_somarComValoresPositivos() {
        CalculadoraService calc = new CalculadoraService();
        double resultado = calc.somar(10, 5);
        assertEquals(15.0, resultado, 0.0001);
    }

    @Test
    public void somarValores(){
        CalculadoraService calcular = new CalculadoraService();
        double resposta = calcular.somar(10,5);
        assertEquals(15.0,resposta,0.0001);
    }
    // CP02: Teste de soma com número negativo
    @Test
    public void cp02_somarComNumeroNegativo() {
        CalculadoraService calc = new CalculadoraService();
        double resultado = calc.somar(10, -5);
        assertEquals(5.0, resultado, 0.0001);
    }

    // CP03: Teste de subtração com resultado negativo
    @Test
    public void cp03_subtrairComResultadoNegativo() {
        CalculadoraService calc = new CalculadoraService();
        double resultado = calc.subtrair(2, 5);
        assertEquals(-3.0, resultado, 0.0001);
    }

    // CP04: Teste de multiplicação por zero
    @Test
    public void cp04_multiplicarPorZero() {
        CalculadoraService calc = new CalculadoraService();
        double resultado = calc.multiplicar(10, 0);
        assertEquals(0.0, resultado, 0.0001);
    }

    // CP05: Teste de divisão resultando em valor decimal
    @Test
    public void cp05_dividirResultandoEmDecimal() {
        CalculadoraService calc = new CalculadoraService();
        double resultado = calc.dividir(5, 2);
        assertEquals(2.5, resultado, 0.0001);
    }

    // CP06: Teste de divisão por zero (deve lançar exceção)
    @Test(expected = IllegalArgumentException.class)
    public void cp06_dividirPorZeroDeveLancarExcecao() {
        CalculadoraService calc = new CalculadoraService();
        calc.dividir(10, 0);
    }
}