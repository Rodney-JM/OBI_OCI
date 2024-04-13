import java.util.Scanner;

public class estoque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tipos = scan.nextInt();
        int tamanhos = scan.nextInt();

        int[][] estoqueLoja = new int[tipos][tamanhos];

        for (int i = 0; i < tipos; i++) {
            for(int j = 0; j< tamanhos; j++){
                estoqueLoja[i][j] = scan.nextInt();
            }
        }

        int total = 0;
        int p = scan.nextInt();

        for (int i = 0; i < p; i++) {
            int tipo = scan.nextInt() - 1;
            int tamanho = scan.nextInt() - 1;

            if (estoqueLoja[tipo][tamanho]> 0){
                estoqueLoja[tipo][tamanho] -= 1;
                total++;
            }
        }

        System.out.println(total);
    }
}
