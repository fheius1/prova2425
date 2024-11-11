package org.example;

import java.util.Scanner;

public class ProblemesJoel {

    public static void main(String[] args) {
        //Lectura de dades
        Scanner ent = new Scanner(System.in);

        //Declaracio variables
        String nombre = ent.nextLine();

        System.out.println("Hola " + nombre);
    }
}


class PaTomaca {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        String ingredient1 = ent.next();
        String ingredient2 = ent.next();

        System.out.println(ingredient1 + " amb " + ingredient2);
    }
}


class Elbarretdehogwarts {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String resposta;
        resposta = ent.nextLine();
        if (resposta.equals("Coratge")) {
            System.out.println("Gryffindor");
        } else if (resposta.equals("Coneixement")) {
            System.out.println("Ravenclaw");
        } else if (resposta.equals("Ambicio")) {
            System.out.println("Slytherin");
        } else System.out.println("Hufflepuff");
    }
}


class AnyDeTraspass {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int any = ent.nextInt();

        if (any % 4 == 0 && any % 100 != 0 || any % 400 == 0) System.out.println("SI");
        else System.out.println("NO");

        System.out.println(any % 4 == 0 && any % 100 != 0 || any % 400 == 0 ? "SI" : "NO");
    }
}


class DiesCorrectes {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int dia = ent.nextInt();

        if (dia >= 1 && dia < 366) System.out.println("Correcte per un any no bixest!");
        else if (dia == 366) System.out.println("Correcte per un any bixest!");
        else System.out.println("Incorrecte!");

    }

}


class DiesCorrectesAmpliat {
    public static void main(String[] args) {


        // Ampliacio: programa que demana un numero de dia de l'any i un numero d'any i mostra per pantalla,
        //Correcte: si el dia esta entre 1 i 365 i l'any no es bixest, o si el es 366 i l'any es bixest
        //Incorrecte: en qualsevol altre cas

        Scanner ent = new Scanner(System.in);
        int dia = ent.nextInt();
        int any = ent.nextInt();


        if (dia > 366) System.out.println("Incorrecte per qualsevol any");
        else {
            if (dia == 366 && (any % 4 == 0 && any % 100 != 0 || any % 400 == 0))
                System.out.println("Correcte per un any bixest!");
            else if (dia == 366 && (any % 4 == 0 && any % 100 != 0 || any % 400 == 0)) {

            }
        }
        if (dia >= 1 && dia < 366) System.out.println("Correcte i any qualsevol");

        //Fer lo mateix amb un operador ternari
//        System.out.println( dia>=1 && dia<366 ? "Correcte per un any no bixest!":
//                dia == 366 ? "Correcte per un any bixest!" : "Incorrecte"
//        );
    }

}

class BulletiNotes {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        switch (n) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspes");
                break;
            case 5:
            case 6:
                System.out.println("Aprovat");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Excelent");
                break;
        }
        scanner.close();
    }
}


class Parelles {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num1 = ent.nextInt();
        int num2 = ent.nextInt();
        int num3 = ent.nextInt();


//        if (num1 == num2  || num2 == num3 || num1 == num3) System.out.println("SI");
//        else System.out.println("NO");

        // Amb operador ternari

        System.out.println(num1 == num2 || num2 == num3 || num1 == num3 ? "SI" : "NO");

    }
}

class ParellesTrios {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        // Llegir los numeros
        int num1 = ent.nextInt();
        int num2 = ent.nextInt();
        int num3 = ent.nextInt();

        // Verificar si hi ha un comodí (0) i reemplaçar-lo pels altres números per comparar
        if (num1 == 0) num1 = (num2 != 0) ? num2 : num3;
        if (num2 == 0) num2 = (num1 != 0) ? num1 : num3;
        if (num3 == 0) num3 = (num1 != 0) ? num1 : num2;

        // Verificar si són iguals
        if (num1 == num2 && num2 == num3) {
            System.out.println("TRIO");
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("PARELLA");
        } else {
            System.out.println("RES");
        }

        // VERSIO AMB OPERADOR TERNARI

        // Reemplaçar els 0 (comodí) per un altre nombre dels daus per poder comparar
        num1 = (num1 == 0) ? (num2 != 0 ? num2 : num3) : num1;
        num2 = (num2 == 0) ? (num1 != 0 ? num1 : num3) : num2;
        num3 = (num3 == 0) ? (num1 != 0 ? num1 : num2) : num3;

        // Usar operador ternari per determinar el resultat
        String resultado = (num1 == num2 && num2 == num3) ? "TRIO" :
                (num1 == num2 || num1 == num3 || num2 == num3) ? "PARELLA" :
                        "RES";

        System.out.println(resultado);
        ent.close();

//        Versio Santi
//
//        int num1 = ent.nextInt();
//        int num2 = ent.nextInt();
//        int num3 = ent.nextInt();
//
//        if (num1 == num2 && num2 == num3) {
//            System.out.println("TRIO");
//        } else if (num1 == 0 || num2 == 0 || num3 == 0) {
//            if (num1 == num2 || num1 == num3 || num2 == num3)
//                System.out.println("TRIO");
//            else System.out.println("PARELLA");
//        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
//            System.out.println("PARELLA");
//        } else System.out.println("RES");


    }
}


class AireNoBucle {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int angle = ent.nextInt();
        System.out.println(angle%180 == 0 ? "OK" : "BRONCA");

    }
}

class Interval {

    public static void main(String[] args) {


        Scanner ent = new Scanner(System.in);

        int num1 = ent.nextInt();
        int num2 = ent.nextInt();

        while (num2 <= num1) {

            while (num2 <= num1){
                System.out.println(num1);
                num1 = num1 - 1;
            }


        }
        if (num2 > num1) System.out.println("El segon numero no es mes petit que el primer");


    }
}



class IntervarNumeros {


    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int num1, num2;
        num1 = ent.nextInt();
        num2 = ent.nextInt();

        int num3 = num1;


        if (num1 < num2) {
            System.out.println("El segon numero no es mes petit que el primer");
        } else if (num1 == num2) {
            System.out.println(num3);
        } else while (num1 >= num2) {

            System.out.println(num1);
            num1 = num1 - 1;
        }
    }
}


class PlatansBananes {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int platans = 0, bananes = 0;

        while (true) {
            String linea = ent.nextLine();
            if (linea.equals("0")) {
                break;
            }
            for (char letra : linea.toCharArray()) {
                if (letra == 'P') {
                    platans=platans+1;
                } else if (letra == 'B') {
                    bananes=bananes+1;
                }
            }
        }
        if (platans > bananes) {
            System.out.println("M'agraden els platans");
        } else if (bananes > platans) {
            System.out.println("M'agraden les bananes");
        } else {
            System.out.println("No puc distingir entre un platan i una banana");
        }
    }
}


class CebraBeattles{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int files = ent.nextInt();
        int columnes = ent.nextInt();


    }
}



class Exlamacio {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

    }
}


class SumaSegons{

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int hores = ent.nextInt();
        int minuts = ent.nextInt();
        int segons = ent.nextInt();



//        segons += 1 if segons == 60: segons = 0 minuts += 1 if minuts == 60: minuts = 0 hores += 1
    }
}


class CalcularDivisors {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();


        while (casos-- > 0){
            int num1 = ent.nextInt();
            int divisor = 1;
            while (divisor<=num1){
                if (num1  % divisor == 0) System.out.printf("%d ", divisor);
                divisor++;
            }
            System.out.println();
        }
    }
}


class Lalafel {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {
            String[] paraules = ent.skip("[\r\n]*").nextLine().split(", ");
            int necesari = ent.nextInt();

            int comptLalafel = 0;
            int telaranyesPlenes = 0;

            for (int i = 0; i < paraules.length; i++) {
                switch (paraules[i].toLowerCase()) {
                    case "Lalafel":
                        comptLalafel++;
                        break;
                    case "telaranya":
                        if (necesari > 0 && comptLalafel >= necesari) {
                            telaranyesPlenes++;
                            comptLalafel -= necesari;
                        }
                        break;
                    case "aranya":
                        comptLalafel = telaranyesPlenes = 0;
                        break;
                }
            }
            //System.out.println("Hay "+telaranyesPlenes+" telaranyas llenas.");
            System.out.format("Hay %d telaranyas llenas. %n", telaranyesPlenes);
        }
    }
}



class BasketMania {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();
        int puntsL = 0;
        int puntsV = 0;

        while (numCasos-->0) {  
            int numCistella = ent.nextInt();

            while (numCistella-->0){
                String cistella = ent.next();
                String equip = cistella;
                int punts = Integer.parseInt(cistella);

                if (equip.equals("L")) {
                    puntsL = ++punts;
                } else {
                    puntsV = ++punts;
                }

                char guanyador;
                if (puntsL > puntsV) {
                    guanyador = 'L';
                } else if (puntsL < puntsV) {
                    guanyador = 'V';
                } else {
                    guanyador = 'E';
                }
            }

            System.out.printf("%d ");

        }
    }
}



class BolasLobas {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();

        while (casos-- > 0) {

            String paraula=ent.next();
            int num1 = ent.nextInt();
            int num2 = ent.nextInt();

            String paraulaNova= new String();

            for (int i = 0; i < paraula.length(); i++) {
                if (i == num1){
                    System.out.print(paraula.charAt(num2));
                }else if (i == num2){
                    System.out.print(paraula.charAt(num1));
                } else System.out.println(paraula.charAt(i));
            }
            System.out.println();

        }

        //Versio alternativa amb format i mes eficient
        while (casos-- > 0) {
            String text = ent.skip("[\r\n]*").nextLine();
            int num1 = ent.nextInt();
            int num2 = ent.nextInt();

            for (int i = 0; i < text.length(); i++) {
                if (i != num1 && i != num2) System.out.printf("%c ", text.charAt(i));
                else if (i == num1) System.out.printf("%c ", text.charAt(num2));
                else System.out.printf("%c ", text.charAt(num2));
            }
            System.out.println();
        }


    }
}


class CalculadoraString {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int numCasos = Integer.parseInt(ent.nextLine());


        while (numCasos-- > 0) {
            String operacio = ent.nextLine();
            String[] parts = operacio.split(" ");


            int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[2]);

            switch (parts[1]) {
                case "+":
                    System.out.println(num1 + num2);
                case "-" :
                    System.out.println(num1 - num2);
                case "*" :
                    System.out.println(num1 * num2);
                case "/" :
                    System.out.println(num1 / num2);

            }

        }

    }
}

class Exercici13Cadenes {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String text;
        int ini=0;

        do {
            System.out.println("Escriu una frase que no estigui buida");
            text = ent.nextLine().trim();
            if (text.isBlank()) {
                System.out.println("No pot ser buida");
                continue;
            }
            break;
        }while (true);{
            do {
                int fi=text.indexOf(' ',ini);
                if (fi!=-1) //hem trobat espai en blanc
                    System.out.println(text.substring(ini,fi));
                else {
                    System.out.println(text.substring(ini));
                    break;
                }
                ini = fi+1;
            }while (true);

        }
    }
}


class EscriuArray4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCaselles;
        int[] array;
        int sumant;

        //Llegir numero de caselles
        numCaselles = ent.nextInt();
        array = new int[numCaselles];

        //Omplir l'array amb valors
        for (int i = 0; i < array.length; i++) {

        }

        //Llegir el valor de la suma
        sumant= ent.nextInt();

        //Recorre array sumant lo valor nou
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ",array[i]+sumant);

        }
    }
}


class Macarrisme {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int quantValors=ent.nextInt();

        for (int i = 0; i < quantValors; i++) {
            //Per a mostrar el % s'ha de ficar dos vegades seguides
            System.out.printf("%.1f%% ", ent.nextDouble()*100);
        }
        System.out.println();
    }
}




class ComptarArrays {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while (numCasos-- > 0) {

            int k = ent.nextInt();
            int [] verctor = new int[k];

            for (int i = 0; i < verctor.length; i++) {
                verctor[i] = ent.nextInt();
            }

            int buscat=ent.nextInt();
            int comptador=0;

            for (int i = 0; i < verctor.length; i++) {
                if (verctor[i] == buscat) comptador++;  //versio alternativa: comptador +- if (verctor[i] == buscat ? 1 : 0)
            }
            System.out.println(comptador);
        }
    }
}




class EscriuMatriu1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numerof = scan.nextInt();
        int numeroc = scan.nextInt();
        int[][] matriu = new int[numerof][numeroc];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = scan.nextInt();
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
        int numeroi = scan.nextInt();
        int numeroj = scan.nextInt();

        System.out.printf("%d%n",matriu[numeroi][numeroj]);
    }
}

//            // Extrae los números y el operador
//            int num1 = Integer.parseInt(parts[0]);
//            String operador = parts[1];
//            int num2 = Integer.parseInt(parts[2]);
//
//            // Realiza la operación según el operador y muestra el resultado
//            switch (operador) {
//                case "+":
//                    System.out.println(num1 + num2);
//                    break;
//                case "-":
//                    System.out.println(num1 - num2);
//                    break;
//                case "*":
//                    System.out.println(num1 * num2);
//                    break;
//                case "/":
//                    System.out.println(num1 / num2);
//                    break;
//                default:
//                    System.out.println("Operador no válido");
//            }
//        }
//    }
//}

//clase maximMatriu amb min value:
//while (casos-- > 0){
//
//int numerof = ent.nextInt();
//int numeroc = ent.nextInt();
//        int maxim= Integer.MIN_VALUE, imax =0, jmax=0;
//int[][] matriu = new int[numerof][numeroc];
//            for (int i = 0; i < matriu.length; i++) {
//        for (int j = 0; j < matriu[i].length; j++) {
//matriu [i] [j] = ent.nextInt();
//                    if (matriu [i][j]>= maxim) {
//maxim = matriu[i][j];
//imax = i;
//jmax=j;
//                    }
//                            }
//                            }
//
//                            System.out.printf("%d %d %n", imax+1, jmax+1);
//        }
//
//                }

class MaximMatriu {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int casos = ent.nextInt();

        while (casos-- > 0) {

            int numerof = ent.nextInt();
            int numeroc = ent.nextInt();
            int imax = 0, jmax = 0;
            int[][] matriu = new int[numerof][numeroc];

            matriu[0][0] = ent.nextInt();
            int maxim = matriu[0][0];

            for (int i = 0; i < numerof; i++) {
                for (int j = (i == 0 ? 1 : 0); j < numeroc; j++) {
                    matriu[i][j] = ent.nextInt();
                    if (matriu[i][j] > maxim) {
                        maxim = matriu[i][j];
                        imax = i;
                        jmax = j;
                    }
                }
            }
            System.out.printf("%d %d %n", imax + 1, jmax + 1);
        }
    }
}

class MaximMatriuCorregit {
    public static void main(String[] args) {

        //Versio amb matriu:
//        Scanner ent = new Scanner(System.in);
//
//        int casos = ent.nextInt();
//
//        while (casos-- > 0) {
//            int files = ent.nextInt();
//            int columnes = ent.nextInt();
//            int [][] valors = new int[files][columnes];
//            int maxim=0, fMax=1, cMax=1;
//
//            for (int i = 0; i < valors.length; i++) {
//                for (int j = 0; j < valors[i].length; j++) {
//                    valors[i][j] = ent.nextInt();
//                    if (i == 0 && j == 0) {
//                        maxim = valors[0][0];
//                    } else {
//                        if (valors[i][j] > maxim) {
//                            maxim = valors[i][j];
//                            fMax = i+1;
//                            cMax=j+1;
//                        }
//                    }
//                }
//            }
//
//            System.out.printf("%d %d %n", fMax , cMax);
//        }



        //Versio sense matriu
//        Scanner ent = new Scanner(System.in);
//
//        int casos = ent.nextInt();
//
//        while (casos-- > 0) {
//            int files = ent.nextInt();
//            int columnes = ent.nextInt();
//            int maxim=0, fMax=1, cMax=1;
//
//            for (int i = 0; i < files; i++) {
//                for (int j = 0; j < columnes; j++) {
//                    int valor = ent.nextInt();
//                    if (i == 0 && j == 0) {
//                        maxim = valor;
//                    } else {
//                        if (valor > maxim) {
//                            maxim = valor;
//                            fMax = i+1;
//                            cMax=j+1;
//                        }
//                    }
//                }
//            }
//
//            System.out.printf("%d %d %n", fMax , cMax);
//        }




        //Versio amb un sol for
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();

        while (casos-- > 0) {
            int files = ent.nextInt();
            int columnes = ent.nextInt();
            int maxim=0, fMax=1, cMax=1;

            for (int i = 0; i < files*columnes; i++) {
                    int valor = ent.nextInt();
                    if (i == 0) {
                        maxim = valor;
                    } else {
                        if (valor > maxim) {
                            maxim = valor;
                            fMax = (i/columnes)+1;
                            cMax=(i%columnes)+1;
                        }
                    }
            }

            System.out.printf("%d %d %n", fMax , cMax);
        }
    }
}




class IndexOfMatriu{
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int casos = ent.nextInt();

        while (casos-- > 0) {
            int files = ent.nextInt();
            int columnes = ent.nextInt();
            int [] matriu = new int[files*columnes];
            int buscat, fMax=-1, cMax=-1;

            for (int i = 0; i < files*columnes; i++) {
                matriu[i] = ent.nextInt();
            }
            buscat= ent.nextInt();
            for (int i = 0; i < files*columnes; i++) {
                if (matriu[i]==buscat){
                    fMax = (i/columnes);
                    cMax=(i%columnes);
                }
            }
            System.out.printf("%d %d %n", fMax , cMax);
        }


    }
}
