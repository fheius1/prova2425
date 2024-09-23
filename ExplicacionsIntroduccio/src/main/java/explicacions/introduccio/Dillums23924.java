package explicacions.introduccio;

public class Dillums23924 {

    public static void main(String[] args) {

        //Declaracio variables

        int a,b,c,d,e;

        a = 3;
        b = 6;
        c = 9;
        d = 12;

        e = a + (b * c / 2) + d - 1 +4;

        // e = a + (b * (c / 2)) + d - 1 +4; en este cas se fa primer c /2

        System.out.println(e);

        int q = a / b;

        System.out.println(a);
        int r = a % b;

        a = b * q +r;
        System.out.println(a);




        // Forcar que la divisio es faigi amb numeros reals i no enters ( VERSIO ELEGANT DE FER-HO )

        double qReal = (double) a / b;

        System.out.println(a + " Dividit entre " + b + " val " + qReal);

        // Forcar que la divisio es faigi amb numeros reals i no enters ( VERSIO NO TAN ELEGANT DE FER-HO )

        qReal = a * 1.0 / b;

        //qReal = (a + 0.0) / b; Tambe es pot amb una suma en numeros reals

        System.out.println(a + " Dividit entre " + b + " val " + qReal);

    }

}

class Booleans1 {

    public static void main(String[] args) {

        boolean esA, esB, esC;

        esA = true;
        esB = false;
        esC = esA = esB = false;

        boolean res = esA || !esB && esC;

        System.out.println(res);
    }

}


class Booleans2 {
    public static void main(String[] args) {

        int a = 0;
        int b = 5;

        boolean resultat = a == 0 && a > b || a * 2 % 7 ==0;

        System.out.println(resultat);
    }
}


class TiposCoincidents {
    public static void main(String[] args) {

        String cadena = " Hola cadena";

        cadena = "text davant " +  cadena + "text darrere";

        System.out.println(cadena);

    }

}

class ExercicisPrecedenciaOperadors1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        // Sense parèntesis
        int resultat1 = a + b * c;
        System.out.println("Resultat sense parèntesis: " + resultat1);

        // Amb parèntesis
        int resultat2 = (a + b) * c;
        System.out.println("Resultat amb parèntesis: " + resultat2);



        // Pregunta : Quina diferència hi ha entre el resultat amb i sense parèntesis? Explica per què es produeix aquesta diferència.
        // Resposta sense los parentesis se fa primer la multiplicacio , mentres que amb los parentesis la suma te prioritat

    }

}


class ExercicisPrecedenciaOperadors2 {
    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;
        boolean z = true;

        // Sense parèntesis
        boolean resultat1 = x || y && z;
        System.out.println("Resultat sense parèntesis: " + resultat1);

        // Amb parèntesis
        boolean resultat2 = (x || y) && z;
        System.out.println("Resultat amb parèntesis: " + resultat2);


        // Pregunta : Què canvia en els resultats en cada cas? Com afecten els operadors lògics OR (||) i AND (&&) segons la precedència?
        // En el cas sense los parentesis primer se fa la I logica , que dona false, i despres es fa la O logica , que dona true com a resultat.
        // En el cas amb los parentesis primer se fa la O logica que dona com a resultat true , despres es fa la I logica que dona coma resultat true.
    }
}



class ExercicisPrecedenciaOperadors3 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 15;

        // Sense parèntesis
        boolean resultat1 = a + b > c && c > b;
        System.out.println("Resultat sense parèntesis: " + resultat1);

        // Amb parèntesis
        boolean resultat2 = (a + b > c) && (c > b);
        System.out.println("Resultat amb parèntesis: " + resultat2);

        // Pregunta: Com influeixen els parèntesis en l'ordre de les operacions i el resultat final?
    }
}
