package lekcijaTris.majasdarbs;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

    sumNumbers();

    factorial(7);

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
        for (int v = 0; v <= evenNumbers.length; v = v+1) {
            evenNumbers[v] = v*2;
            System.out.print(evenNumbers[v] + " ; ");
        }
    }
    public static long factorial(int n) {

//
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println("Skaitļa " + n + " faktoriāls ir " + fact);
        return fact;
        
    }
}

