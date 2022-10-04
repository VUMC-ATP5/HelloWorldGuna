package lekcijaDivi.labDarbs;

import java.util.Scanner;

public class labDarbsDivi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("2. laboratorijas darbs");

  System.out.println("Kā tevi sauc?");
        String name = scanner.nextLine();
        System.out.println("Labdien, " + name + "! Esi sveicināts/a manā programmā!");

        int vecums;
       System.out.println("Ievadi cilvēka vecumu");
        vecums = scanner.nextInt();

        if(vecums>=18) {
            System.out.println("Cilvēks drīkst balsot");}

// salīdzināšanas izteiksmes
            int x = 3;
            int y = 2;
            //Lielāks šis būs patiess
            System.out.println(x > y);
            //Mazāks šis būs false
            System.out.println(x < y);

            y = 1;
            System.out.println(x > y);
            //!!!Salīdzināšanas izteiksmēs nevar salīdzināt divus String, String pārabuda šādi:
            String luksaforaGaisma = "green";
            System.out.println(luksaforaGaisma.equals("green"));
            System.out.println(luksaforaGaisma.equals("red"));

            //Nav vienāds ar
            System.out.println(x != y);
            System.out.println(!luksaforaGaisma.equals("red"));

            int age = 18;
            boolean hasVoted = false;
            System.out.println("Pārbaudi cilvēka vecumu");
            if (age >= 18 && hasVoted == false) {
                System.out.println("Drīkst balsot!");
            } else {
                System.out.println("Nedrīkst balsot!");
            }
            //jau vienreiz ir nobalsojis
            hasVoted = true;
            if (age >= 18 && hasVoted == false) {
                System.out.println("Drīkst balsot!");
            } else {
                System.out.println("Jau ir nobalsots, otrreiz nedrīkst!");
            }
            System.out.println("Tālākas darbības");

            //Patstāvīgais darbs

            int skaitlis = -5;
            if (skaitlis < 0) {
                System.out.println("NEGATĪVS");
            }

            int i = 17;
            if (i == 10) {
                System.out.println("Skaitlis ir 10");
            } else if (i == 15) {
                System.out.println("Skaitlis ir 15");
            } else if (i == 20) {
                System.out.println("Skaitlis ir 20");
            } else {
                System.out.println("Skaitlis nav nedz 10, nedz 15, nedz 20.");
            }

            // Luksofors

            String luksofors = "red";
            if (luksofors.equals("green")) {
                System.out.println("Ej!");
            } else if (luksofors.equals("yellow")) {
                System.out.println("Gatavojies!");
            } else if (luksofors.equals("red")) {
                System.out.println("Stāvi!");
            } else {
                System.out.println("Luksofors nav kārtībā, skaties ceļa zīmes!");
            }
            int number = 3;
            if (number % 2 == 0) {
                System.out.println(number + " ir pāra skaitlis.");
            } else {
                System.out.println(number + " ir nepāra skaitlis.");
            }

            int monthNumber = 4;
            switch (monthNumber) {
                case 1:
                    System.out.println("Janvāris");
                    break;
                case 2:
                    System.out.println("Februāris");
                    break;
                case 3:
                    System.out.println("Marts");
                    break;
                case 4:
                    System.out.println("Aprīlis");
                    break;
                //turpina līdz 12 - decembris
                default:
                    System.out.println("Mēneša ar šādu kārtas numuru nav!");
            }

            String animal = "dog";
            String result;
            switch (animal) {
                case "dog":
                case "cat":
                    result = "domestic animal";
                    break;
                case "tiger":
                    result = "wild animal";
                    break;
                default:
                    result = "unnown";
            }
            System.out.println(result);

            System.out.println("Ievadi jebkuru veselu skaitli!");
            int skaitlisIevaditais = scanner.nextInt();

            if (skaitlisIevaditais > 0 ) {
                System.out.println("Skaitlis " + skaitlisIevaditais + " ir pozitīvs skaitlis.");
            } else if (skaitlisIevaditais == 0 ) {
                System.out.println("Skaitlis" + skaitlisIevaditais + " nav nedz pozitīvs, nedz negatīvs skaitlis.");
            } else {
                System.out.println("Skaitlis " + skaitlisIevaditais + " ir negatīvs skaitlis.");
            }
                
            }
        }



