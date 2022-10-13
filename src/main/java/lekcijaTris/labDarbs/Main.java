package lekcijaTris.labDarbs;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Programmas sākums");
        printCard();
        printNewLine();
        printCard();
        printCardAdvanced("Rolfs", "Vendiņš", "Rīga", 99);

        // var vārdu, uzvārdu utt definēt arī atsevišķi, ne uzreiz rakstot iekšā izsauktās metodes parametros

        String vards = "Anna";
        String uzvards = "Panna";
        String pilseta = "Mazirbe";
        int vecums = 15;
        printCardAdvanced(vards, uzvards, pilseta, vecums);

        System.out.println("Programmas beigas");
        int rectangleArea = calculateRectangleArea(3,7);
        System.out.println("Taisnstūra laukums ir " + rectangleArea);
        System.out.println("Taisnstūra laukums ir " + calculateRectangleArea(3,7));

        //Masīvi
        int[] monthlyCosts = {100, 90, 45, 33, 12, 899, 5};
        String[] productList = {"piens", "maize", "kefīrs", "olas"};

        System.out.println(productList[0]); //piens
        System.out.println(productList[1]); //maize
        System.out.println(productList[2]); //kefīrs

        //cits pieraksta veids
        int[] months = new int[12];
        months[0] = 1;

        String[] cars = {"Volvo", "BMV", "Nissan"};
        System.out.println("Masīva garums ir:" + cars.length);

        cars[1] = "Audi";

        String[]studentuSaraksts = new String[23];
        studentuSaraksts[0] = "Jānis Bērziņs";
        studentuSaraksts[1] = "Juris Kreilis";

        System.out.println( studentuSaraksts[0]);
        System.out.println( studentuSaraksts[1]);
        System.out.println( studentuSaraksts[2]);
        whileCikls();
    }
    public static int calculateRectangleArea(int plat, int gar){
        return plat * gar;
    }
    public static void printNewLine(){
        System.out.println("\n");
    }
    public static void printCard(){
        System.out.println("@@@@@@@@@@@@@@@@@@@");
        System.out.println("Guna Vendiņa");
        System.out.println("Rīga");
        System.out.println("$$$$$$$$$$$$$$$$$$$$");
    }
    public static void printCardAdvanced(String name, String surname, String city, int age) {
        System.out.println("@@@@@@@@@@@@@@@@@@@");
        System.out.println(name + " " + surname);
        System.out.println(city);
        System.out.println("Vecums: " + age);
        System.out.println("$$$$$$$$$$$$$$$$$$$$");

    }
    //Cikli
    public static void whileCikls(){
        int x = 5;
        while (x > 0){
            System.out.println("X nav nulle, x = " + x);
            x=x-1;
        }
        int i = 10;
        while(i<30){
            System.out.println("I ir " + i);
            i++; //tas pats, kas i = i +1;
        }

        String[] cars = {"Volvo", "BMV", "Nissan", "Mercedess"};

        int z = 0;
        while (z < 4){
            System.out.print(cars[z]);
            z = z + 1;
        }
        // izdrukā visu mēnešu izdevumus
        int[] monthlyCosts = {100, 90, 45, 33, 12, 899, 5};
        int k = 0;
        while(k < monthlyCosts.length){
            System.out.println(monthlyCosts[k]);
            k++;
        }
        //Saskaita ievadītos pozitīvos skaitļus, kad ievada 0 vai negatīvu, izprintē pozitīvo skaitļu summu
        Scanner ievade = new Scanner(System.in);
        System.out.println("Ievadi skaitli...");
        int number = ievade.nextInt();
        int summa = 0;
        while (number > 0) {
            summa = summa + number;
            System.out.println("Ievadi skaitli...");
            number = ievade.nextInt();
        }
        System.out.println("summa ir:" + summa);

        //
        String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};
        int m = 0;
        while(m < kartis.length){
            System.out.println(kartis[m]);
            m++;
        }
//        //Igora variants
//        public static void playCards(){
//
//            String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kreiča dūzis"};
//            for (int i = 0; i< kartis.length; i++)
//                System.out.println(kartis[i] + " ");
    //}

        // Do..while
        int q = 0;
        do {
            System.out.println("TEST TEST TEST");
            q++;
        } while (q < 5);

//        //Paroles ievade un pārbaude
//        Scanner scanner = new Scanner(System.in);
//        String parole = "SuperSecretPassword123";
//        String ievaditaParole;
//        do {
//            System.out.println("Ievadi paroli");
//            ievaditaParole = scanner.next();
//            System.out.println("Pārbaudām paroli");
//        } while (!ievaditaParole.equals(parole));
//
//        System.out.println("Pareiza parole");

    // For
        String[] kartis2 = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};

        for (int j = 0; j < kartis2.length; j++) {
            System.out.println(kartis2[j]);
        }

        for (int v = 0; v <= 20; v = v + 2) {
            System.out.println(v);
        }
    // For each -

        long[] telefonaNumuri = {11111111111L,222222222222L,333333333333333L,44444444444444L,555555L};
        for (long numurs :telefonaNumuri) {
            System.out.println(numurs);
        }
    // Uzdevums par pircēju un māju numuriem
        int count = 0;
        for (int j = 1; j <= 50; j++) {
            if (!(j % 3 == 0 || j % 5 == 0)) {
                count++;
            }
        }
        System.out.println(count);

        char[] vards = {'G','u','n','a'};
        for (char burts: vards){
            System.out.print(burts);
        }


    }

}
