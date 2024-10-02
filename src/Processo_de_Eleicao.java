import java.util.Scanner;

public class Processo_de_Eleicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao processo de eleição do Melhor Professor do Curso de ADS! 😎");
        System.out.println("Quantas pessoas irão votar?");
        int pessoas = sc.nextInt();

        int votosRodrigo = 0;
        int votosTaffe = 0;
        int votosLucas = 0;
        int votosAlessandro = 0;
        int i = 0;
        String vencedor = "";

        System.out.println("Temos os seguintes canditados/professores na votação:");
        System.out.println("Taffe - 99");
        System.out.println("Rodrigo - 88");
        System.out.println("Lucas - 77");
        System.out.println("Alessandro - 66");

        while (i < pessoas) {
            System.out.println("Digite o número correspondente ao do cadidato/professor para votar:");
            int voto = sc.nextInt();
            if (voto == 99 || voto == 88 || voto == 77 || voto == 66) {
                if (voto == 99) {
                    votosTaffe++;
                } else if (voto == 88) {
                    votosRodrigo++;
                } else if (voto == 77) {
                    votosLucas++;
                } else if (voto == 66) {
                    votosAlessandro++;
                }
                i++;
            } else {
                System.out.println("Número inválido, vote novamente! 😡");
            }
        }


        if (votosRodrigo > votosTaffe && votosRodrigo > votosLucas && votosRodrigo > votosAlessandro) {
            vencedor = "Rodrigo";
        } else if (votosTaffe > votosRodrigo && votosTaffe > votosLucas && votosTaffe > votosAlessandro) {
            vencedor = "Taffe";
        } else if (votosAlessandro > votosTaffe && votosAlessandro > votosRodrigo && votosAlessandro > votosLucas) {
            vencedor = "Alessandro";
        } else if (votosLucas > votosTaffe && votosLucas > votosAlessandro && votosLucas > votosRodrigo) {
            vencedor = "Lucas";
        }


        System.out.println("O Taffe recebeu " + votosTaffe + " voto(s).");
        System.out.println("O Rodrigo recebeu " + votosRodrigo + " voto(s).");
        System.out.println("O Lucas recebeu " + votosLucas + " voto(s).");
        System.out.println("O Alessandro recebeu " + votosAlessandro + " voto(s).");
        if (vencedor.equals("")) {
            System.out.println("Deu empate!");
        } else {
            System.out.println("O vencedor é " + vencedor + "!");
        }
    }
}