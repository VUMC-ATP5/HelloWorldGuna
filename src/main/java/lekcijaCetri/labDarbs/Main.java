package lekcijaCetri.labDarbs;

public class Main {
    public static void main(String[] args) {
        String vards = "Guna";
        House majaViens = new House(2, 30, 2, "Viestura prospekts 100, Rīga",3.2,true,10000);


//        House majaDivi = new House();
//        majaDivi.adrese = "Brīvības bulvāris 1, Rīga";
//        majaDivi.durvjuSkaits = 2;
//        majaDivi.loguSkaits = 120;
//        majaDivi.stavuDaudzums = 7;
//        majaDivi.griestuAugstums = 3.5;
//        majaDivi.vaiPrivatipasums = false;

//        System.out.println(majaViens.adrese);
//        System.out.println(majaDivi.adrese);
//
//        House[] majas = {majaViens, majaDivi};
//        for (House maja : majas) {
//            System.out.println("\n");
//            System.out.println(maja.adrese);
//            System.out.println(maja.durvjuSkaits);
//            System.out.println(maja.loguSkaits);
//            System.out.println(maja.stavuDaudzums);
//            System.out.println(maja.griestuAugstums);
//            System.out.println(maja.vaiPrivatipasums);
//        }
//        majaViens.printHouse();

        Bycicle mansVelo = new Bycicle();
        mansVelo.printAtrums();

        Bycicle mansVelo2 = new Bycicle();
        mansVelo2.atrums = 30;
        mansVelo2.printAtrums();

        Bycicle velo3 = new Bycicle();
        velo3.printAtrums();
        velo3.paatrinajums();
        velo3.paatrinajums();
        velo3.paatrinajums();
        velo3.paatrinajums();

        velo3.printAtrums();

        System.out.println("Uz ceļa izskrien kaķis");

        velo3.bremzesana();
        velo3.bremzesana();
        velo3.bremzesana();
        velo3.bremzesana();
        velo3.bremzesana();
        velo3.bremzesana();

        velo3.printAtrums();
        Bycicle veloX = new Bycicle("ZZK", 28, 50);

        Fish zivs1 = new Fish();
        zivs1.suga = "Līdaka";
        zivs1.garums = 81;
        zivs1.vecumsGados = 7;
        zivs1.kurMiit = "Alūksnes ezers";
        zivs1.svarsGramos = 12000;
        zivs1.cikReizesNokerta = 1;
        zivs1.vaiIrDziva = true;
        zivs1.vaiIrIzsalkusi = false;

        zivs1.printZivsApraksts();
        zivs1.pabaroZivi();

        Circle rinkis1 = new Circle(5);

        System.out.println(rinkis1.rekinaRinkaLaukumu());
        System.out.println(rinkis1.rekinaRinkaLinijasGarumu());

        Circle rinkis2 = new Circle(12);

        System.out.println(rinkis2.rekinaRinkaLaukumu());
        System.out.println(rinkis2.rekinaRinkaLinijasGarumu());
    }
}
