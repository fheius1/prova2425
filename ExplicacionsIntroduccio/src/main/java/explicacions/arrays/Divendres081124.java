package explicacions.arrays;

import java.util.Scanner;

public class Divendres081124 {
    public static void main(String[] args) {

        //Declarem array amb dos dimensions
        int [][] matriu;
        Scanner ent = new Scanner(System.in);

        matriu = new int[2][3]; //instanciar matriu

        //recorrer una matriu, fan falta dos fors in dins de l'altre. En cas de ser de mes dimensions , faran falta mes fors
        for (int i = 0; i < matriu.length; i++) { // este for diu lo numero de files de la matriu , no los valors de dins
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = ent.nextInt();
            }
        }


        //mostrar contingut de la matriu
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.printf("%5d",matriu[i][j]);
            }
        }

        System.out.println();

    }
}


class MatriuAmorfa {
    public static void main(String[] args) {

        int [][] matriu =new int [5][];

        matriu[0]= new int[4];  // instanciar primera fila amb 4 caselles ( o en el cas de la matriu columnes en lloc de caselles)
        matriu[1]= new int[0];  // fila amb 1 casella
        matriu[2]= new int[3];  // fila amb 3 caselles
        matriu[3]= new int[2];  // fila amb 2 caselles
        matriu[4]= new int[1];  // fila amb 1 casella

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.printf("%d",matriu[i][j]);
            }
            System.out.println();
        }

    }
}



