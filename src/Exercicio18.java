import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
public class Exercicio18 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Insira uma data no formato dd/mm/aaaa:");
       String dataString = scanner.nextLine();

       DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate data = LocalDate.parse(dataString, formato);

       System.out.println("Data válida. A data inserida foi: " +dataString);

       scanner.close();
}
}