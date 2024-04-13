package sobrecarga;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = false;
        Operacao operacao = new Operacao();

        do {
            System.out.println("Digite a operação:");
            System.out.println("1- Adição de dois valores inteiros");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            System.out.println("5- Exponenciação");
            System.out.println("6- Fatorial");
            System.out.println("7- Adição de três valores");
            System.out.println("8- Adição de dois valores textos");

            int tipo = scanner.nextInt();

            System.out.println("Digite o valor 1:");
            int valor1 = scanner.nextInt();
            int valor2 = 0;

            if (tipo != 6) {
                System.out.println("Digite o valor 2:");
                valor2 = scanner.nextInt();
            }

            switch (tipo) {

                case 1:
                    System.out.println("Adição de 2 valores inteiros: " + operacao.soma(valor1, valor2));
                    break;

                case 2:
                    operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico2(valor2);
                    System.out.println("Subtração = " + operacao.subtracao());
                    break;

                case 3:
                    operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico2(valor2);
                    System.out.println("Multiplicação = " + operacao.multiplicacao());
                    break;

                case 4:
                    operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico2(valor2);
                    System.out.println("Divisão = " + operacao.divisao());
                    break;

                case 5:
                    operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico2(valor2);
                    System.out.println("Exponenciação :" + operacao.exponenciacao()); 
                    break;

                case 6:
                    operacao.setNumeroGenerico1(valor1);
                    System.out.println("Fatorial = " + operacao.getFatorial());
                    break;

                case 7:
                    System.out.println("Adição de 3 valores = " + operacao.soma(valor1, valor2, 78));
                    break;

                case 8:
                    System.out.println("Adição de 2 valores textos = " + operacao.soma(Integer.toString(valor1), Integer.toString(valor2)));
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

            System.out.println("Quer fazer outro cálculo? (Digite 1 para sim, 0 para não)");
            int escolha = scanner.nextInt();
            continuar = (escolha == 1);

        } while (continuar);
        
     // Estrutura de repetição para iniciar um novo cálculo usando " do / while " ; 
        
        System.out.println("Obrigado pela Preferência. Fechando a calculadora.");
        scanner.close();
    }
}

