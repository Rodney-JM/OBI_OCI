import java.util.Arrays;
import java.util.Scanner;

public class IdadeDeCamila {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[3];

        // Lendo as idades
        for (int i = 0; i < 3; i++) {
            idades[i] = scan.nextInt();
        }

        // Ordenando as idades em ordem crescente
        Arrays.sort(idades);

        // A idade do meio é a segunda idade após a ordenação
        int idadeCamila = idades[1];

        System.out.println(idadeCamila);
    }
}
