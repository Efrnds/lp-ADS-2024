package calculadora.oobj;

import java.util.Scanner;

public class Teclado {

    private Visor visor = new Visor();
    private ProcessarCalculo calculo;

    public void iniciaCalculadora() {
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        // chamar o visor e pedir a operacao
        operacao = visor.getOperacao(scanner);
        // 1 = adicao, 2 = subtracao, 3 = divisao, 4 = multiplicacao
        calculo = new ProcessarCalculo();
        int valor1 = 0;
        int valor2 = 0;
        int resultadoVisor = 0;
        switch (operacao) {
            case 1:
                // pedir os valores para adicao
                valor1 = visor.getValor1(scanner);
                valor2 = visor.getValor2(scanner);
                resultadoVisor = calculo.adicao(valor1, valor2);
                visor.mostraResultado(resultadoVisor);
                break;
            case 2:
                // pedir os valores para subtracao
                valor1 = visor.getValor1(scanner);
                valor2 = visor.getValor2(scanner);
                resultadoVisor = calculo.subtracao(valor1, valor2);
                visor.mostraResultado(resultadoVisor);
                break;
            case 3:
                // pedir os valores para multiplicacao
                valor1 = visor.getValor1(scanner);
                valor2 = visor.getValor2(scanner);
                resultadoVisor = calculo.multiplicacao(valor1, valor2);
                visor.mostraResultado(resultadoVisor);
                break;
            case 4:
                // pedir os valores para divisao
                valor1 = visor.getValor1(scanner);
                valor2 = visor.getValor2(scanner);
                resultadoVisor = calculo.divisao(valor1, valor2);
                visor.mostraResultado(resultadoVisor);
                break;
        }
    }
}
