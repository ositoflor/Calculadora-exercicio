package calculadora.app;

import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int option = 0;
        double value1;
        double value2;
        double result;

        while (option != 5) {
            switch (option) {
                case 1:
                    System.out.println("Adição");
                    System.out.println("Digite o primeiro valor");
                    value1 = scn.nextDouble();
                    System.out.println("Digite o segundo valor");
                    value2 = scn.nextDouble();
                    result = value1 + value2;
                    System.out.println("O resultado é: " + result);
                    break;
                case 2:
                    System.out.println("Subtração");
                    System.out.println("Digite o primeiro valor");
                    value1 = scn.nextDouble();
                    System.out.println("Digite o segundo valor");
                    value2 = scn.nextDouble();
                    result = value1 - value2;
                    System.out.println("O resultado é: " + result);
                    break;
                case 3:
                    System.out.println("Multiplicação");
                    System.out.println("Digite o primeiro valor");
                    value1 = scn.nextDouble();
                    System.out.println("Digite o segundo valor");
                    value2 = scn.nextDouble();
                    result = value1 * value2;
                    System.out.println("O resultado é: " + result);
                    break;
                case 4:
                    System.out.println("Divisão");
                    System.out.println("Digite o primeiro valor");
                    value1 = scn.nextDouble();
                    System.out.println("Digite o segundo valor");
                    value2 = scn.nextDouble();
                    result = value1 / value2;
                    System.out.println("O resultado é: " + result);
                    break;
                case 5:
                    break;
            }
            System.out.println("Caluladora");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção:");
            option = scn.nextInt();
        }
    }
}
