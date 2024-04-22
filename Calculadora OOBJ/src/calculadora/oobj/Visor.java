package calculadora.oobj;

import java.util.Scanner;

public class Visor {

    public Integer getOperacao(Scanner scanner) {
        System.out.println("Digite a operacao");
        int operacao = scanner.nextInt();
        return operacao;
    }

    public Integer getValor1(Scanner scanner) {
        System.out.println("Digite o primeiro valor");
        int valor1 = scanner.nextInt();
        return valor1;
    }

    public Integer getValor2(Scanner scanner) {
        System.out.println("Digite o segundo valor");
        int valor2 = scanner.nextInt();
        return valor2;
    }
    
    public void mostraResultado(Integer resultado){
        System.out.println("o resultado é " + resultado);
    }
}
