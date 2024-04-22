package javaapplication1;

import java.util.Scanner;

public class Caderno {

    public void exercicioDois() {
        String[][] tabelaPalavras = {
            {"linha1col1", "linha1col2"},
            {"linha2col1", "linha2col2"},
            {"linha3col1", "linha3col2"}
        };
        System.out.println("tamanho de linhas: " + tabelaPalavras.length);
        for (int x = 0; x < tabelaPalavras.length; x++) {
            System.out.println("tamanho de colunas: " + tabelaPalavras[x].length);
            for (int i = 0; i < tabelaPalavras[x].length; i++) {
                System.out.println(tabelaPalavras[x][i]);
            }
        }

    }

    public void exercicioTres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita seu nome");
        String nome = scanner.nextLine();
        System.out.println("Seu nome é: " + nome);
        
        System.out.println("Digite um primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.println("Digite um segundo valor: ");
        int valor2 = scanner.nextInt();
        //int soma = valor1 + valor2;
        System.out.println("A soma do valor 1 e valor 2 é = " + (valor1+valor2));
    }
    
    public void exercicioQuatro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.println("Digite um segundo valor: ");
        int valor2 = scanner.nextInt();
        if (valor1 == 0 || valor2 == 0) {
            System.out.println("ERRO FATAL VOCÊ DIVIDIU POR ZERO USUÁRIO BURRO, filadaputa");
        } else {
            int soma = valor1 / valor2;
            System.out.println("A divisão dos valores 1 e 2 é = " + soma);
        }
       
    }
    public void exercicioCinco() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.println("Digite um segundo valor: ");
        double valor2 = scanner.nextDouble();
        if (valor1 == 0 || valor2 == 0) {
            System.out.println("ERRO FATAL VOCÊ DIVIDIU POR ZERO USUÁRIO BURRO, filadaputa");
        } else {
            double soma = valor1 / valor2;
            System.out.println("A divisão dos valores 1 e 2 é = " + soma);
        }
       
    }

}
