import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     double numero1,numero2;
     double operacao;
     double resultado = 0;


     System.out.println("Insira um primeiro numero:");
     numero1 = scanner.nextDouble();

     System.out.println("Insira um segundo numero:");
     numero2 = scanner.nextDouble();

     System.out.println("Escolha a operação que deseja fazer:");
        System.out.println("1 = Soma");
        System.out.println("2 = Subtração");
        System.out.println("3 = Multiplicação");
        System.out.println("4 = Divisão");
        operacao = scanner.nextInt();

    if (operacao == 1 ) {
        resultado = numero1 + numero2;
        System.out.println("A soma é " +resultado);
    }
    else if (operacao == 2) {
        resultado = numero1 - numero2;
        System.out.println("A subtração é " +resultado);

    } else if (operacao == 3){
        resultado = numero1 * numero2;
        System.out.println("A multiplicação é " +resultado);

    } else if (operacao == 4) {
        resultado = numero1 / numero2;
        System.out.println("A divisão é " +resultado );
    }
      else {
          System.out.println("Opção inválida");
    }
      if ( resultado %2 ==0){
          System.out.println(resultado+ " é Par");
      }
        else {
          System.out.println(resultado+ " é Impar");
      }
      if (resultado > 0){
          System.out.println(resultado+ " é Positivo.");
      }
      else {
          System.out.println(resultado+ " é Negativo");
      }

      double numerointeiro = Math.round(resultado);

      if (resultado == numerointeiro){
          System.out.println(resultado+ " é Interio");
      }
      else {
          System.out.println(resultado+ " é Decimal");
      }
      scanner.close();
    }
}
