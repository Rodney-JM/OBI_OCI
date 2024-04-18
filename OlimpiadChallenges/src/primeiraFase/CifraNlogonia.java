package primeiraFase;

import java.util.Scanner;

public class CifraNlogonia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(descobrirCifra(input));
        scan.close();
    }

    public static String descobrirCifra(String palavra){
        StringBuilder cifra = new StringBuilder();
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        String vogais = "aeiou";

        for (char c: palavra.toCharArray()){
            if (isConsoante(c)){
                cifra.append(c);
                cifra.append(getVogalMaisProxima(c));
                cifra.append(getProximaConsoante(c, alfabeto));
            }else{
                cifra.append(c);
            }
        }

        return cifra.toString();
    }

    public static boolean isConsoante(char c){
        String consoantes = "bcdfghjklmnpqrstvwxyz";
        return consoantes.indexOf(c) != -1;
    }

    public static char getVogalMaisProxima(char c){
        String vogais = "aeiou";
        int index = vogais.indexOf(c);
        if (index == -1){
            int anterior = 0;
            int proxima = 0;
            for (int i=0; i<vogais.length(); i++){
                if (vogais.charAt(i)< c){
                    anterior = vogais.charAt(i);
                }else{
                    proxima = vogais.charAt(i);
                    break;
                }
            }
            return (c - anterior)<= (proxima-c)? (char)anterior: (char)proxima;
        }else{
            return c;
        }
    }

    public static char getProximaConsoante(char c, String alfabeto){
        int index = alfabeto.indexOf(c);
        if(index== alfabeto.length() - 1){
            return c;
        }else{
            return alfabeto.charAt(index+1);
        }
    }
}
