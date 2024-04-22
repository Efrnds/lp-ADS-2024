package calculadora.oobj;

public class ProcessarCalculo {

    public Integer adicao(int valor1, int valor2) {
        int resultado = valor1 + valor2;
        return resultado;
    }

    public Integer subtracao(int valor1, int valor2) {
        return valor1 - valor2;
    }

    public Integer multiplicacao(int valor1, int valor2) {
        return valor1 * valor2;
    }

    public Integer divisao(int valor1, int valor2) {
        return valor1 / valor2;
    }
}