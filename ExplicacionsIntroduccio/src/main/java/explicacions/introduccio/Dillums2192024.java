package explicacions.introduccio;

import java.util.Scanner;

public class Dillums2192024 {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int comptador = 0;
        System.out.println("Fica una frase (Fi per acabar)");
        do {
            String frase = ent.nextLine().toUpperCase();
            if (frase.length() == 0) continue;
            if (frase.equalsIgnoreCase("FI")) break;
            if (frase.isBlank() || frase.charAt(0)!='A') continue; // Important en l'ordre , ja que ficant les condicions al reves donaria una excepcio i petaria
            comptador++;
        } while (true);

        System.out.println("Disparem perfavor, acaba amb lo meu sufriment");
    }
}
