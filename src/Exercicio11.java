import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario, novoSalario;
        double aumento1 = 0,aumento2 = 0,aumento3 = 0,aumento4 = 0;

        System.out.println("Insira seu salário:");
        System.out.println("R$"); salario = scanner.nextDouble();

        if (salario <= 280 ){
             aumento1 = salario * 0.20;
             novoSalario = salario + aumento1;
            System.out.println("O salário antes do reajuste é de: R$ " +salario);
            System.out.println("O percentual de aumento foi de 20%");
            System.out.println("O valor do aumento é de: R$ " +aumento1);
            System.out.println("O Novo salário é de: R$ " +novoSalario);
        }
        else if (salario >= 280 && salario <=700){
             aumento2 = salario * 0.15;
             novoSalario = salario + aumento2;
            System.out.println("O salário antes do reajuste é de: R$ " +salario);
            System.out.println("O percentual de aumento foi de 15%");
            System.out.println("O valor do aumento é de: R$ " +aumento2);
            System.out.println("O Novo salário é de: R$ " +novoSalario);
        }
        else if (salario >=700 && salario <= 1500 ){
             aumento3 = salario * 0.10;
             novoSalario = salario + aumento3;
            System.out.println("O salário antes do reajuste é de: R$ " +salario);
            System.out.println("O percentual de aumento foi de 10%");
            System.out.println("O valor do aumento é de: R$ " +aumento3);
            System.out.println("O Novo salário é de: R$ " +novoSalario);
        }
        else if (salario > 1500){
             aumento4 = salario * 0.5;
             novoSalario = salario + aumento4;
            System.out.println("O salário antes do reajuste é de: R$ " +salario);
            System.out.println("O percentual de aumento foi de 5%");
            System.out.println("O valor do aumento é de: R$ " +aumento4);
            System.out.println("O Novo salário é de: R$ " +novoSalario);
        }
        scanner.close();

    }
}
