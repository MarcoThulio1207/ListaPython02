import java.util.Scanner;
public class Exercicio12 {

         public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double valorHora, salarioBruto, salarioLiquido;
        int horaTrabalhada;

        System.out.println("Informe o valor da hora trabalhada:");
        System.out.print("R$" ); valorHora = scanner.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês:");
        horaTrabalhada = scanner.nextInt();
        salarioBruto = valorHora * horaTrabalhada;
         double sindicato = salarioBruto * 0.03;
         double fgts = salarioBruto * 0.11;
         double ir = 0;
         salarioLiquido = salarioBruto - sindicato - ir;

         if(salarioBruto <=900){
             ir = 0;
             System.out.println("Insento do IR");
             System.out.println("Salário Bruto: R$" +salarioBruto);
             System.out.println("Desconto Sindicato: R$" +sindicato);
             System.out.println("Saldo FGTS: RS" +fgts);
             System.out.println("Salário Liquido: R$" +salarioLiquido);
         }
         else if (salarioBruto <=1500){
             ir = salarioBruto * 0.05;
             System.out.println("Salário Bruto: R$" +salarioBruto);
             System.out.println("Desconto IR: R$" +ir);
             System.out.println("Desconto Sindicato: R$" +sindicato);
             System.out.println("Saldo FGTS: RS" +fgts);
             System.out.println("Salário Liquido: R$" +salarioLiquido);
         }
         else if (salarioBruto <=2500){
             ir = salarioBruto * 0.10;
             System.out.println("Salário Bruto: R$" +salarioBruto);
             System.out.println("Desconto IR: R$" +ir);
             System.out.println("Desconto Sindicato: R$" +sindicato);
             System.out.println("Saldo FGTS: RS" +fgts);
             System.out.println("Salário Liquido: R$" +salarioLiquido);
         }
         else if (salarioBruto >2500){
             ir = salarioBruto * 0.20;
             System.out.println("Salário Bruto: R$" +salarioBruto);
             System.out.println("Desconto IR: R$" +ir);
             System.out.println("Desconto Sindicato: R$" +sindicato);
             System.out.println("Saldo FGTS: RS" +fgts);
             System.out.println("Salário Liquido: R$" +salarioLiquido);
         }



        scanner.close();

    }
}
