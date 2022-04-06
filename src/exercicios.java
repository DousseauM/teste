import java.util.Random;
import java.util.Scanner;

public class exercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] teste = new int[3][3];
        System.out.println("Entre com três valores");
        teste[0][0] = scanner.nextInt();
        teste[0][1] = scanner.nextInt();
        teste[0][2] = scanner.nextInt();

        System.out.println("Entre com três valores");
        teste[1][0] = scanner.nextInt();
        teste[1][1] = scanner.nextInt();
        teste[1][2] = scanner.nextInt();

        System.out.println("Entre com três valores");
        teste[2][0] = scanner.nextInt();
        teste[2][1] = scanner.nextInt();
        teste[2][2] = scanner.nextInt();


        int par = 0;
        int impar = 0;
        for (int i = 0; i < teste.length; i++) {
            for (int j = 0; j < teste.length; j++)
                if (teste[i][j] % 2 == 0) {
                    par++;
                } else impar++;
        }

        for (int i = 0; i < teste.length; i++) {
            for (int j = 0; j < teste.length; j++){
                System.out.print(teste[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("O número de pares é " + par);
        System.out.println("O número de ímpares é " + impar);

}}
