package lekcijaCetri.majasdarbs;

import lekcijaCetri.majasdarbs.classHomework.Triangle;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Triangle trs1 = new Triangle();
        trs1.malaA = 7;
        trs1.malaB = 9;
        trs1.malaC = 10;

        System.out.println(trs1.vaiIrTrijsturis());
        System.out.println(trs1.vaiIrVienadmalu());
        System.out.println(trs1.vaiIrVienadsanu());

        Triangle trs2 = new Triangle();
        trs2.TriangleL(8,9,9);
        System.out.println(trs2.vaiIrTrijsturis());
        System.out.println(trs2.vaiIrVienadmalu());
        System.out.println(trs2.vaiIrVienadsanu());
        System.out.println("Trijstūra laukums ir: " + trs2.laukums);


    }
}
