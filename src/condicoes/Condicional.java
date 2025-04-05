package condicoes;

import java.util.Scanner;

public class Condicional {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        String continuar;

        do {
            System.out.println("Calculadora de média");
            System.out.println();

            System.out.println("Digite a nota do primeiro bimestre: ");
            double primeiro = scanner.nextDouble();

            System.out.println("Digite a nota do segundo bimestre: ");
            double segundo = scanner.nextDouble();

            System.out.println("Digite a nota do terceito bimestre: ");
            double terceiro = scanner.nextDouble();

            System.out.println("Digite a nota do quarto bimestre: ");
            double quarto = scanner.nextDouble();

            double resultado;

            resultado = (primeiro + segundo + terceiro + quarto) / 4;

            System.out.println(resultado);

            if (resultado >= 7) {
                System.out.println("Aprovado!");
            } else if (resultado >= 5) {
                System.out.println("Recuperação!");
            } else {
                System.out.println("Reprovado");
            }

            System.out.println("\n Deseja calcular outra média? (sim/não)");
            scanner.nextLine();
            continuar = scanner.nextLine().toLowerCase();

        } while (continuar.equals("sim"));

        System.out.println("Programa encerrando!");
        scanner.close();


    }
}
