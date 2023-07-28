package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n-------- MENU DE EXERCÍCIOS --------");
            System.out.println("\nSelecione qual exercício você deseja verificar!");
            System.out.println("1 - Qual o maior número?");
            System.out.println("2 - É positivo ou negativo?");
            System.out.println("3 - É consoante ou vogal?");
            System.out.println("4 - Passei de ano?");
            System.out.println("5 - Ordene minha lista");
            System.out.println("6 - Calcule o fatorial");
            System.out.println("7 - Consumo médio do automóvel");
            System.out.println("0 - Sair");
            System.out.print("Escolha a opção desejada: ");
            opcao = entradaDoUsuario.nextInt();

            switch (opcao) {
                case 1:
                    exercicio1();
                    break;
                case 2:
                    exercicio2();
                    break;
                case 3:
                    exercicio3();
                    break;
                case 4:
                    exercicio4();
                    break;
                case 5:
                    exercicio5();
                    break;
                case 6:
                    exercicio6();
                    break;
                case 7:
                    exercicio7();
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente.");
            }
        } while (opcao != 0);
    }

    public static void exercicio1() {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.print("\nExercício 1: Me informe dois números inteiros e eu te direi qual o maior. ");

        int valor1, valor2;

        do {
            try {
                System.out.print("\nDigite o primeiro número: ");
                valor1 = entradaDoUsuario.nextInt();

                System.out.print("Digite o segundo número: ");
                valor2 = entradaDoUsuario.nextInt();

                break;
            } catch (InputMismatchException e) {
                entradaDoUsuario.nextLine();
                System.out.println("Valor inválido! Digite apenas números inteiros.");
            }
        } while (true);

        if (valor1 > valor2) {
            System.out.println("O maior número é " + valor1);
        } else if (valor2 > valor1) {
            System.out.println("O maior número é " + valor2);
        } else {
            System.out.println("Os valores informados são iguais!");
        }
    }

    public static void exercicio2() {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.print("\nExercício 2: Me informe um número e eu te direi se ele é positivo ou negativo. ");
        int numero;


        do {
            try {
                System.out.print("\nDigite um número inteiro: ");
                numero = entradaDoUsuario.nextInt();
                break;
            } catch (InputMismatchException e) {
                entradaDoUsuario.nextLine();
                System.out.println("Valor inválido! Digite apenas números inteiros.");
            }
        } while (true);

        if (numero >= 0) {
            System.out.println("O número é um valor positivo.");
        } else {
            System.out.println("O número é um valor negativo.");
        }
    }

    public static void exercicio3() {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.print("\nExercício 3: Me informe uma letra e eu te direi se ela é uma vogal ou uma consoante. ");

        System.out.print("\nDigite uma letra: ");
        String letra = entradaDoUsuario.next().toLowerCase();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("Essa letra é uma vogal!");
        } else {
            System.out.println("Essa letra é uma consoante!");
        }
    }

    public static void exercicio4() {
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.print("\nExercício 4: Me informe uma nota e eu te direi se você foi aprovado na escola! ");

        System.out.print("\nDigite a nota: ");
        int nota = entradaDoUsuario.nextInt();

        if (nota >= 6 && nota < 8) {
            System.out.println("Que pena! Você está de recuperação.");
        } else if (nota >= 8) {
            System.out.println("Parabéns, você foi aprovado!");
        } else if (nota < 6) {
            System.out.println("Infelizmente você foi reprovado =(");
        } else {
            System.out.println("Ocorreu um erro. Tente novamente!");
        }
    }

    public static void exercicio5() {
        Scanner entradaDoUsuario = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();

        System.out.print("\nExercício 5: Me informe vários números para que eu possa ordená-los de maneira decrescente");

        System.out.print("\nDigite a quantidade de números da lista: ");
        int quantNum = entradaDoUsuario.nextInt();

        System.out.println("Agora digite os números (inteiros) da lista:");

        for (int i = 0; i < quantNum; i++) {
            int numero = entradaDoUsuario.nextInt();
            listaNumeros.add(numero);
        }

        Collections.sort(listaNumeros, Collections.reverseOrder());
        System.out.println("Lista ordenada em ordem decrescente:");
        for (int numero : listaNumeros) {
            System.out.print(numero + " ");
        }
    }

    public static void exercicio6() {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.print("\nExercício 6: Descubra o fatorial de qualquer número! ");

        int numero;
        String continuar;

        do {
            System.out.print("\nDigite um número inteiro positivo menor que 13: ");
            numero = entradaDoUsuario.nextInt();

            if (numero < 0) {
                System.out.println("Atenção! Você digitou um número negativo.");
            } else if (numero > 13) {
                System.out.println("Atenção! Você digitou um número maior que 13.");
            } else {
                int fatorial = 1;

                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                }
                System.out.println(numero + "! = " + fatorial);
            }

            System.out.print("Deseja calcular o fatorial de outro número? (S/N): ");
            continuar = entradaDoUsuario.next();
        } while (continuar.equalsIgnoreCase("S"));
    }

    public static void exercicio7() {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("\nExercício 7: Cálculo de consumo médio do automóvel.");

        System.out.print("\nInforme a distância total percorrida em KM: ");
        int distanciaPercorrida = entradaDoUsuario.nextInt();

        System.out.print("Informe o total de combustível consumido em litros: ");
        double combustivelConsumido = entradaDoUsuario.nextDouble();

        double consumoMedio = distanciaPercorrida / combustivelConsumido;

        System.out.printf("O consumo médio foi %.3f km/l%n", consumoMedio);
    }
}
