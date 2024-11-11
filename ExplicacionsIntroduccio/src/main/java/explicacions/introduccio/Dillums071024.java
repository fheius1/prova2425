package explicacions.introduccio;

import java.util.Scanner;

public class Dillums071024 {
    public static void main(String[] args) {

        int numero = 15;

        while (numero  < 25) {
            numero++;
            System.out.println(numero);
        }
    }



    class While2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int control = 0;

            while (control != 24) {
                System.out.println("Adivina numero");
                control = sc.nextInt();
            }
        }
    }





    class ElonBucle {

        public static void main(String[] args) {

            Scanner ent= new Scanner(System.in);

            int num1= ent.nextInt();

            while (num1 >= 0){
                System.out.println(num1);
                num1= num1 -1;
            }
        }
    }
}
