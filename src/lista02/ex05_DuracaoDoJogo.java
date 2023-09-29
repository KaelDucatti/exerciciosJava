package lista02;

import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
// sabendo que o mesmo pode começar em
// um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
public class ex05_DuracaoDoJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaIncial, horaFinal, duracao;

        System.out.print("Hora inicial: ");
        horaIncial = sc.nextInt();
        System.out.print("Hora final: ");
        horaFinal = sc.nextInt();

        if (horaIncial >= horaFinal){
            duracao = 24 - (horaIncial - horaFinal);
        }
        else{
            duracao = (horaFinal - horaIncial);
        }

        System.out.println();
        System.out.println("Duração do jogo: " + duracao + "h");

        sc.close();
    }
}
