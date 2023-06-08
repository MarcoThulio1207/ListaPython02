import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      char M,V,N,resposta;
      System.out.println("Qual turno você estuda? Escreva  M se for Matutino, V se for Vespertino ou N se for Noturno. ");
      resposta = scanner.nextLine().charAt(0);

      if (resposta == 'M' || resposta =='m'){
          System.out.println("Bom dia!!");
      }
      else if (resposta == 'V' || resposta == 'v') {
          System.out.println("Boa tarde!");
      }
      else if (resposta == 'N' || resposta == 'n'){
          System.out.println("Boa noite!");
      }
      else if (resposta != 'M' && resposta != 'm' && resposta != 'V' && resposta != 'v' && resposta != 'N' && resposta != 'n'){
          System.out.println("Valor Inválido");
      }
      scanner.close();
    }
}
