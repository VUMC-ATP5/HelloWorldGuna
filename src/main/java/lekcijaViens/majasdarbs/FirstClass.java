package lekcijaViens.majasdarbs;

public class FirstClass {
    public static void main(String[] args) {

        /*    1. Jums ir nepieciešams izveidot  jaunu Java klasi ar nosaukumu ‘FirstClass.java’ zem homework mapes.
    2. FirstClass.java failā jāizveido ‘main’ metodi
    3. Main metodē vajag nodefinēt mainīgos (ar atbilstošo datatipu) Valstij (brīva izvēle) un izvadīt uz ekrāna:
        1. Nosaukums
        2. Iedzīvotājus skaits
        3. Platība
        4. Galvaspilsēta
        5. Oficiāla valoda
        6. Vai ir ES dalībvalsts
        7. Valūta (viens simbols)
    4. Jāuzraksta dažus teikumus par brīvu tēmu izmantojot konkatenāciju
    5. Jāuzraksta pa trīs piemēriem uz katru aritmētisko operatoru.
    */

    String country;
    long population;
    int areaKm2;
    String capital1;
    String capital2;
    String officialLanguage1;
    String officialLanguage2;
    boolean isEUCountry;
    char currency1;
    char currency2;

            country = "Eswatini";
            population = 1160164L;
            areaKm2 = 17364;
            capital1 = "Mbabane";
            capital2 = "Lobamba";
            officialLanguage1 = "sisvati";
            officialLanguage2 = "angļu";
            isEUCountry = false;
            currency1 = 'S';
            currency2 = 'Z';

        System.out.println("1. Valsts nosaukums:" + country);
        System.out.println("2. Iedzīvotāju skaits: " + population);
        System.out.println("3. Platība kvardātkilometros: " + areaKm2);
        System.out.println("4. Galvaspilsētas: " + capital1 + " un " + capital2);
        System.out.println("5. Oficiālās valodas: " + officialLanguage1 + " un " + officialLanguage2);
        System.out.println("Vai ir ES dalībvalsts: " + isEUCountry);
        System.out.println("Valūtas: " + currency1 + ", " + currency2);


    //4.uzdevuma izpilde

    String continent;
    String borderingCountry1;
    String borderingCountry2;
    short numberOfWives;
    short numberOfChildren;

        continent = "Afrika";
        borderingCountry1 = "South Africa";
        borderingCountry2 = "Mozambique";
        numberOfWives = 15;
        numberOfChildren = 36;

        System.out.println("     " + country + ", officially the Kingdom of Eswatini and formerly named Swaziland is a landlocked country in " +continent +".\nIt is bordered by " + borderingCountry1 + " and " + borderingCountry2 + ".\nAt no more than 200 kilometres north to south and 130 kilometres east to west,\nEswatini is one of the smallest countries in " + continent + ".");
        System.out.println("     The king of " + country + " is Mswati III. He was crowned on 25 April 1986 at the age of 18, \nthus becoming the youngest ruling monarch in the world at that time. \nTogether with his mother he rules the country as an absolute monarch. \nMswati III is known for his practice of polygamy and currently has " + numberOfWives + " wives and " + numberOfChildren + " children.");

    //5.uzdevuma izpilde (nav gluži pa 3 piemēriem no katras darbības, bet princips skaidrs)

     int length = 10;
     int width = 8;
     double radius = 7.7;
     double pi = 3.14;
     double distance = 100.7;
     double time = 0.8;
     int x = 17;
     int y = 5;

        int perimeter=2*(length+ width);
        int areaOfRectangle = length* width;
        double circleLineLength= 2*pi*radius;
        double circleArea = pi*radius*radius;
        double speed = distance / time;
        double sum = x+y;
        double residual = x-y;
        double multipl = x*y;
        double div = x/y;
        double modulo = x%y;

        System.out.println("\nJa taisnstūra garums ir " + length + "m un platums ir " + width + "m, \ntad taisnstūra perimetrs ir " + perimeter + "m, bet laukums ir " + areaOfRectangle + "m.");
        System.out.println("\nJa riņķa līnijas rādiuss ir " + radius + "cm, \ntad riņķa līnijas garums ir " + circleLineLength + "cm, bet riņķa laukums ir " + circleArea + "cm2.");
        System.out.println("\nJa ķermenis " + distance + "km veic " + time + " stundās, \ntad tā kustības ātrums ir " + speed + "km/h.");
        System.out.println("\nSkaitļu " + x + " un " + y + " summa ir " + sum + ",\nstarpība ir " + residual + ",\nreizinājums ir " + multipl + ",\ndalījums ir " + div + ",\nbet dalijuma atlikums (modulo) ir " + modulo + ".");
    }
}
