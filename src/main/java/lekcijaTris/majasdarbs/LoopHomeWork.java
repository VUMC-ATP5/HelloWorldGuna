package lekcijaTris.majasdarbs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

    sumNumbers();

    factorial(9);

    cikli();

    fillEvenNumbers();
    
    }

        public static void sumNumbers(){
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.print("Programma pieņem veselus skaitļus un sasummē to vērtības, līdz vērtību summa pārsniedz 100. ");
        while (sum <= 100) {
            System.out.println("Ievadi skaitli: ");
        while (true)
            try {
                number = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Tas nav vesels skaitlis, ievadi VESELU skaitli: ");
            }
                sum = sum + number;
        }
        System.out.println("Gatavs");
    }
        public static void fillEvenNumbers(){
        int [] evenNumbers = new int [100];
        for (int v = 0; v < evenNumbers.length; v = v+1) {
            evenNumbers[v] = v*2;
            System.out.print(evenNumbers[v] + " ; ");
        }
    }
    public static long factorial(int n) {

        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println("Skaitļa " + n + " faktoriāls ir " + fact);
        return fact;

    }

    public static void cikli() {

        int[] vecumi = {43,43,17,14,6,2,2};
        int q=0;
        System.out.println("\nMūsu ģimenes locekļu vecumi gados ir: ");
        do {
            System.out.print(vecumi[q] + ";");
            q++;
        } while (q < vecumi.length);

        String[] draugi = {"Anna Panna", "Stīvs Gulbis", "Kārlis Kālis", "Dita Bite"};
        System.out.println("\n \nDraugu kompānija: ");
        int m = 0;
        while(m < draugi.length){
            System.out.println(draugi[m]);
            m++;
        }

        char[] vards = {'S','n','i','e','g','p','u','l','k','s','t','e','n','ī','t','e'};
        System.out.println("\nVārds no burtiem: ");
        for (char burts: vards){

            System.out.print(burts);
        }
        System.out.println();
    }
}

