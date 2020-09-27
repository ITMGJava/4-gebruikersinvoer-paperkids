import java.util.Scanner;

public class GebruikersInvoer2 {

    public static void main(String[] args) {

        // opdracht woordlengte

        System.out.println("Voer woord in:");
        Scanner invoer = new Scanner(System.in);
        String woord = invoer.nextLine();

        System.out.println(woord.length());

        // opdracht tafel

       System.out.println(( "voer een getal in:"));
        int getal = invoer.nextInt();

        System.out.println("de tafel van " + getal);
        int uitkomst2 = getal * 2;
        int uitkomst3 = getal * 3;
        int uitkomst4 = getal * 4;
        int uitkomst5 = getal * 5;
        int uitkomst6 = getal * 6;
        int uitkomst7 = getal * 7;
        int uitkomst8 = getal * 8;
        int uitkomst9 = getal * 9;
        int uitkomst10 = getal * 10;

        System.out.println("1 x "  + getal + " = " + getal);
        System.out.println("2 x "  + getal + " = " + uitkomst2 );
        System.out.println("3 x "  + getal + " = " + uitkomst3 );
        System.out.println("4 x "  + getal + " = " + uitkomst4 );
        System.out.println("5 x "  + getal + " = " + uitkomst5 );
        System.out.println("6 x "  + getal + " = " + uitkomst6 );
        System.out.println("7 x "  + getal + " = " + uitkomst7 );
        System.out.println("8 x "  + getal + " = " + uitkomst8 );
        System.out.println("9 x "  + getal + " = " + uitkomst9 );
        System.out.println("10 x "  + getal + " = " + uitkomst10 );
    }
}
