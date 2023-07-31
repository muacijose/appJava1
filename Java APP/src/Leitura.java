import javax.swing.*;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite seu filme favorito");
        String filme = leitura.nextLine();


        System.out.println("digite o nao de lançamento");
        int anoLancamento = leitura.nextInt();


        System.out.println("Diga sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println("O nom do filme é : " + filme);
        System.out.println("Data de Lnacamento : " + anoLancamento);
        System.out.println("A avaliacao do filme foi: " + avaliacao);

    }
}
