package explicacions.introduccio;


import java.util.Scanner;

public class Divendres20924 {

    public static void main(String[] args) {

        // una cadena ( o String )
        System.out.println("Divendres 20924");

        // num. enter ( short , byte, int, long )
        System.out.println(20924);

        //num amb decimal o real ( float, double)
        System.out.println(21.89);

        // booleans
        System.out.println(true);

        // una sola lletra (char)
        System.out.println('u');

        System.out.println(0x0027);

    }


}



class Variables{
    public static void main(String[] args) {

        //declaracio de variables
        int numero;
        double sou;
        boolean casat;

        sou = 12000/12;
        System.out.println(sou);
    }

}


class Tercera {
    public static void main(String[] args) {

        //Lectura de dades
        Scanner ent = new Scanner(System.in);

        //Declaracio variables
        int edat;

        System.out.println("Quants anys tens: ");
        edat = ent.nextInt();
        System.out.println("Tens "+edat+" anys");

        //Edat l'any que ve
        System.out.println("En 15 anys tindras "+(edat+15)+" anys");



    }

}



