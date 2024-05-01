package neps;
import java.util.Scanner;

public class CampoMinado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] campo = new int[N];
        for (int i = 0; i < N; i++) {
            campo[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int minas = campo[i];
            if (i > 0) {
                minas += campo[i - 1];
            }
            if (i < N - 1) {
                minas += campo[i + 1];
            }
            System.out.println(minas);
        }
    }
}

