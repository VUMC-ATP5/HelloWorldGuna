package lekcijaCetri.labDarbs;

import java.util.Date;

public class Bycicle {
    String zimols;
    int ramjaIzmers;
    int atrums = 0;
    Date izgatavosanasDatums;

    //Konstruktors (bez argumentu konstruktors)
    Bycicle(){
        izgatavosanasDatums = new Date();
        System.out.println("Izgatavots jauns velosipēds: " + izgatavosanasDatums);
    }

    //Parametrizēts konstruktors

    Bycicle(String zimols, int ramjaIzmers, int atrums){
        izgatavosanasDatums = new Date();
        this.zimols = zimols;
        this.ramjaIzmers = ramjaIzmers;
        this.atrums = atrums;
    }

    public void printAtrums(){
        System.out.println(atrums);
    }

    public void paatrinajums(){
        System.out.println("Velo paātrinās");
        atrums = atrums + 5;
    }

    public void bremzesana(){
        if (atrums >= 5) {
        System.out.println("Velo bremzē, ātrums samazinās līdz " + atrums);
        atrums = atrums - 5;
    } else {
            System.out.println("Beidz bremzēt, tu jau stāvi!");
        }
    }
}
