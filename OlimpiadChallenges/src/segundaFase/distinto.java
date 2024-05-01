package segundaFase;

import java.util.Scanner;

public class distinto{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int numeroLinhas = in.nextInt();

        int[] listaRaios = new int[numeroLinhas];

        for(int i = 0; i<numeroLinhas;i++){
            listaRaios[i] = in.nextInt();
        }

        int resp = 0;

        for(int i = 0; i<listaRaios.length - 1;i++){
            for (int j = 0; j<listaRaios.length - 1;j++){
                if (listaRaios[i]!=listaRaios[j]){
                    resp++;
                }
            }
        }

        System.out.println(resp);
    }
}