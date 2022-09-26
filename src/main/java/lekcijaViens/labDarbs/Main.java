package lekcijaViens.labDarbs;

public class Main {
    public static void main(String[] args) {
        // int - integer - satur veselu skaitli
        // nosaukumu sāk ar mazo burtu, vārdus raksta kopā, katru nākamo vārdu sāk ar lielo burtu
        int age = 43;
        System.out.println(age);
        System.out.println("Mans vecums ir: " + age);

        int shoeSize = 41;
        int weight = 62;
        int height = 172;
        int workExperience = 21;
            // maksimālā int vērtība
        int maxInt = 2147483647;
        int minInt = -2147483648;
            // byte pieņem no -128 līdz 127
        byte temperature = -35;
            //short pieņem no -
        // long pieņem no ... līdz ..., ievadot skaitli beigās jāpieraksta L

        System.out.println("Mans augums ir: " + height + " cm.");
        System.out.println("Mans svars ir: " + weight + " kg.");
        System.out.println("Mans kurpju izmērs ir: " + shoeSize);
        System.out.println("Mans darba stāžs ir: " + workExperience);

        String catName1 = "Mikka";
        String catName2 = "Grejs";
        System.out.println("Manus kaķus sauc " + catName1 + " un " + catName2 + ".");
 //peldošais punkts float (beigās jāraksta F) un double
        float shoeSizePrecise = 40.5F;
        System.out.println("Precīzs apavu izmērs ir: " + shoeSizePrecise);
        double weightPrecise = 61.3;
        //Šodien ir sestdiena, lielveikals ir atvērts
        boolean isSupermarketOpen = true;
        // bet skola ir slēgta
        boolean isSchoolOpen = false;

        System.out.println("Sestdienās veikali ir vaļā " + isSupermarketOpen + ", bet vai skolas ir vaļā " + isSchoolOpen);

        String catType = "Šķirnes";
       // ar char definē vienu simbolu, liek vienpēdiņās
        char currency = '$';
        char sex = 'M';

        // mainīgie bez vērtības
        int a = 5;
        int b = 10;
        int summa;
        summa = a + b;


        System.out.println(summa);

        summa = a + a;

        System.out.println(summa);

        int x = 10;
        int y = -45;

        int result = x + y;
        System.out.println("Rezultāts ir " + result);

        result = x - y;
        System.out.println(result);
        result = x * y;
        // ja rezultāts nav vesels skaitlis, bet definēts bija kā int, tad parāda tikai veselo daļu
        result = x / y;
        System.out.println(result);

        // ja skaitļus dalot nepieciešams izvadīt atlikumu, tad dalīšanas zīmes vietā raksta %
        result = 13 % 2;
        System.out.println(result);
    }
}
