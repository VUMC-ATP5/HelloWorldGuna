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

    5. Jāuzraksta pa trīs piemēriem uz katru aritmētisko operatoru.*/

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

    }
}
