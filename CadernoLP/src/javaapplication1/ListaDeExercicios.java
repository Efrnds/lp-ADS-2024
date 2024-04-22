package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaDeExercicios {

    Scanner scanner = new Scanner(System.in);

    public void ExercicioUm() {
        System.out.println("Insira um número para verificar se ele é positivo ou negativo: ");
        double myNum = scanner.nextDouble();

        if (myNum >= 0) {
            System.out.println("Este numero eh positivo :)");
        } else {
            System.out.println("Este numero eh negativo :(");
        }
    }

    public void ExercicioDois() {
        System.out.println("==============CALCULADORA==============");
        System.out.println("Faca um calculo: ");
        System.out.println("Insira o numero um: ");
        double num1 = scanner.nextDouble();
        System.out.println("Insira o operador: ");
        String operacao = scanner.next();
        System.out.println("Insira o numero dois: ");
        double num2 = scanner.nextDouble();
        double calculo;
        if ("*".equals(operacao) || "x".equals(operacao) || "X".equals(operacao)) {
            calculo = num1 * num2;
            System.out.printf("A multiplicacao dos numeros eh igual a: %-3s2 \n", calculo);
        } else if ("/".equals(operacao)) {
            calculo = num1 / num2;
            System.out.printf("A divisao dos numeros eh igual a: %-3s2 \n", calculo);
        } else if ("+".equals(operacao)) {
            calculo = num1 + num2;
            System.out.printf("A adicao dos numeros eh igual a: %-3s2 \n", calculo);
        } else if ("-".equals(operacao)) {
            calculo = num1 - num2;
            System.out.printf("A subtracao dos numeros eh igual a: %-3s2 \n", calculo);
        }
    }

    public void ExercicioTres() {
        System.out.println("Insira um número para ver a sua tabuada: ");
        double userNum = scanner.nextDouble();
        for (int i = 1; i <= 10; i++) {
            double calc = userNum * i;
            System.out.printf("%s \n", calc);
        }
    }

    public void ExercicioQuatro() {
        System.out.println("Programa de contagem regressiva, insira um numero inicial para comecar a contagem regressiva a partir dele:");
        int userNum = scanner.nextInt();
        if (userNum > 0) {
            for (int i = userNum; i >= 0; i--) {
                System.out.printf("%s ", i);
            }
        } else {
            for (int i = userNum; i <= 0; i++) {
                System.out.printf("%s ", i);
            }
        }
    }

    public void ExercicioCinco() {
        System.out.println("Insira um número");
        int userNum;
        userNum = scanner.nextInt();
        for (int i = 1; i <= userNum; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void ExercicioSeis() {
        System.out.println("Insira um número para descobrir se é primo ou não: ");
        boolean check = true;
        int userNum = scanner.nextInt();
        for (int i = 2; i <= Math.sqrt(userNum); i++) {
            if (userNum % i == 0) {
                check = false;
            }
        }

        if (check == true) {
            System.out.println("Eh um numero primo. " + userNum);
        } else {
            System.out.println("Este numero nao e primo. " + userNum);
        }
    }

    public void ExercicioSete() {
        System.out.println("Calculadora de media");
        System.out.println("Insira quantas notas serao calculados: ");
        int quantia = scanner.nextInt();
        double notas = 0, media = 0;
        for (int i = 1; i <= quantia; i++) {
            System.out.printf("Insira a nota %-10s", i);
            notas = scanner.nextDouble();
            media += notas;
        }
        media = media / quantia;
        System.out.println("A media de notas eh igual a: " + media);
    }

    public void ExercicioOito() {
        System.out.println("Insira uma lista de numeros para identificar qual o maior numero da lista, para sair digite 's'");
        List<Integer> counter = new ArrayList<Integer>();
        String userInput = "";
        do {
            userInput = scanner.nextLine().toLowerCase();
            if (!userInput.equals("s")) {
                int valor = Integer.parseInt(userInput);
                counter.add(valor);
                System.out.println(counter);
            } else {
                int i = counter.size();
                Collections.sort(counter);
                System.out.println(counter.get(i - 1));
                break;
            }
        } while (true);

    }
}
