import java.util.Scanner;

public class toupeira {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int saloes = scan.nextInt();
        int tuneis = scan.nextInt();

        int[][] caminhosTuneis = new int[saloes][tuneis];

        for (int i = 0; i < saloes; i++) {
            for (int j=0; j<tuneis; j++){
                caminhosTuneis[i][j] = scan.nextInt();
            }
        }

        int caminhosPossiveis = 0;
        
    }
}
