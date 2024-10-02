import java.util.Scanner;

public class Cadastro_de_Avaliacoes_de_Filmes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filme = 0;
        int n = 1;
        int i = 0;
        int notaBoa = 0;
        int notaRuim = 0;

        System.out.println("Bem vindo ao Programa de Cadastro de Avaliações de Filmes 😎!");
        System.out.println("Quanto filmes deseja avaliar?");
        filme = sc.nextInt();

        Double[] notasFilmes = new Double[filme];

        while (i < filme) {
            System.out.println("Que nota deseja dar ao filme " + n + " entre 0 à 10?");
            notasFilmes[i] = sc.nextDouble();
            if (notasFilmes[i] < 0 || notasFilmes[i] > 10) {
                System.out.println("Nota inválida!");
            } else {
                n++;
                i++;
            }
        }

        i = 0;

        while (i < filme) {
            if (notasFilmes[i] >= 6) {
                notaBoa++;
            } else {
                notaRuim++;
            }
            i++;
        }


        System.out.println("Há " + notaBoa + " filme(s) avaliados como bons");
        System.out.println("Há " + notaRuim + " filme(s) avaliados como ruins");
    }
}