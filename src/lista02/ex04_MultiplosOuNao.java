package lista02;


import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
// "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção:
// os números devem poder ser digitados em ordem crescente ou decrescente.
public class ex04_MultiplosOuNao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Informe 2 números inteiros:");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println();
        if (a % b == 0 || b % a == 0){
            System.out.println(a + " e " + b + " são múltiplos entre si");
        }
        else{
            System.out.println(a + " e " + b + " não são múltiplos entre si");
        }

        sc.close();
    }
}
