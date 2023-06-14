import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      String formaPagamento;
      double total = 0, opcaokg;
      int opcao;

      System.out.println("Escolha um tipo de carne respectivo ao um número:");
        System.out.println(" 1 -File Duplo");
        System.out.println(" 2 - Alcatra");
        System.out.println(" 3 - Picanha");
       opcao = scanner.nextInt();

        System.out.println("Quantos KG deseja levar?");
        opcaokg = scanner.nextDouble();

        System.out.println("Qual opção de pagamento:");
        System.out.println("C para  Cartão Tabajara");
        System.out.println("O para Outro Pagamento");
        formaPagamento = scanner.next();

        double desconto = 0;

        if (opcao == 1)
            if (opcaokg <=5){
                total = opcaokg * 4.90;

            }
         else {
             total = opcaokg * 5.80;

            }

        if (opcao == 2)
          if ( opcaokg <=5){
              total = opcaokg * 5.90;
          }
        else {
              total = opcaokg * 6.80;

          }
        if (opcao == 3)
         if (opcaokg <=5){
             total = opcaokg * 6.90;
         }
        else {
             total = opcaokg * 7.80;

         }

         if (formaPagamento.equalsIgnoreCase("C")){
             desconto = total * 0.05;
         }

         double pagamento = total - desconto;

        System.out.println("Cupom Fiscal:");
        System.out.println("Tipo de carne: " + obterDescricaoCarne(opcao));
        System.out.println("Quantidade: " + opcaokg + " Kg");
        System.out.println("Preço total: R$" + total);
        System.out.println("Tipo de pagamento: " + obterDescricaoPagamento(formaPagamento));
        System.out.println("Valor do desconto: R$" + desconto);
        System.out.println("Valor a pagar: R$" + pagamento);


    }

    public static String obterDescricaoCarne(int opcao) {
        String descricao;

        switch (opcao) {
            case 1:
                descricao = "File Duplo";
                break;
            case 2:
                descricao = "Alcatra";
                break;
            case 3:
                descricao = "Picanha";
                break;
            default:
                descricao = "Desconhecido";
                break;
        }

        return descricao;
    }

    public static String obterDescricaoPagamento(String formaPagamento) {
        if (formaPagamento.equalsIgnoreCase("C")) {
            return "Cartão Tabajara";
        } else {
            return "Outros";
        }
    }
}
