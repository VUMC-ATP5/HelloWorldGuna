package lekcijaDivi.majasdarbs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.3.Main metodē vajag uzrakstīt loģiskās izteiksmes un izvadīt true/false rezultātu uz ekrāna. Varat izmantot jebkādu x vērtību katrā piemērā
        // a. vai x ir pozitīvs (iegūt rezultātu true)
        int x = 4;
        System.out.println(x > 0);
        // b. vai x ir negatīvs (iegūt rezultātu false)
        System.out.println(x < 0);
        // c. vai x ir lielāks par 5 un x ir mazāks vai vienāds ar 10 (iegūt rezultātu true)
        x = 8;
        System.out.println(x > 5 && x <= 10);
        //d. vai x NAV mazāks vai vienāds ar 5 un x ir mazāks par 10 (iegūt rezultātu true)
        System.out.println(x > 5 && x < 10);
        //e. vai x ir vienāds ar 0 vai x ir vienāds ar 10 (rezultāts false)
        System.out.println(x == 0 || x == 10);
        //f. vai x * x reizinājums ir lielāks par 10 (rezultātus true)
        System.out.println(x * x > 10);

        //2.Uzrakstīt programmu, kas pieņem Mēneša numuru(vesels skaitlis) un izvada uz ekrāna mēneša nosaukumu ar vārdu. (izmantot switch)
        int monthNumber;
        System.out.print("Ievadi mēneša kārtas skaitli (skaitli no 1-12, bez punkta): ");
        monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("janvāris");
                break;
            case 2:
                System.out.println("februāris");
                break;
            case 3:
                System.out.println("marts");
                break;
            case 4:
                System.out.println("aprīlis");
                break;
            case 5:
                System.out.println("maijs");
                break;
            case 6:
                System.out.println("jūnijs");
                break;
            case 7:
                System.out.println("jūlijs");
                break;
            case 8:
                System.out.println("augusts");
                break;
            case 9:
                System.out.println("septembris");
                break;
            case 10:
                System.out.println("oktobris");
                break;
            case 11:
                System.out.println("novembris");
                break;
            case 12:
                System.out.println("decembris");
                break;
            default:
                System.out.println("Mēneša ar šādu kārtas numuru nav!");
        }
        //3. Uzrakstīt programmu, kas pieņem trīs veselus skaitļus un izvada uz ekrāna, kurš ir lielākais no šiem trīs skaitļiem.
        Scanner kb = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        int numberThree;
        System.out.print("Lielākā no ievadītajiem trīs veseliem skaitļiem noteikšana. Ievadi pirmo skitli: ");
        while (true)
            try {
                numberOne = Integer.parseInt(kb.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Tas nav vesels skaitlis, ievadi VESELU pirmo skaitli: ");
            }


        System.out.print("Ievadi otro skaitli: ");
        while (true)
            try {
                numberTwo = Integer.parseInt(kb.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Tas nav vesels skaitlis, ievadi VESELU otro skaitli: ");
            }

        System.out.print("Ievadi trešo skaitli: ");
        while (true)
            try {
                numberThree = Integer.parseInt(kb.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Tas nav vesels skaitlis, ievadi VESELU trešo skaitli: ");
            }

        int largest;
        int temp;
        temp = numberOne > numberTwo ? numberOne : numberTwo;

        largest = numberThree > temp ? numberThree : temp;

        System.out.println("Lielākais skaitlis ir: " + largest);

        /* 4. Uzrakstīt programmu, kas nolasa krāsu (String) sarkans/dzeltens/zaļš un izvada uz ekrāna
        gājēja darbības pie luksofora. Uzrakstīt arī ko darīt, ja nedeg ne zaļa/dzeltena/sarkana gaisma.*/

        Scanner signal = new Scanner(System.in);

        System.out.print("Ievadi, kāds luksofora signāls deg (red, yellow vai green): ");
        String luksofors = signal.nextLine();
        if (luksofors.equals("green")) {
            System.out.println("Ej!");
        } else if (luksofors.equals("yellow")) {
            System.out.println("Gatavojies!");
        } else if (luksofors.equals("red")) {
            System.out.println("Stāvi!");
        } else {
            System.out.println("Luksofors nav kārtībā, ceļu šķērso kā neregulētā krustojumā!");
        }
    }
}
