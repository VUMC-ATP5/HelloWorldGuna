package lekcijaCetri.labDarbs;

public class Fish {
    String suga;
    double garums;
    int svarsGramos;
    double vecumsGados;
    char dzimums;
    String kurMiit;
    int cikReizesNokerta;
    boolean vaiIrDziva = true;
    boolean vaiIrIzsalkusi = true;


    public void printZivsApraksts() {
        System.out.println("Fish{" +
                "suga='" + suga + '\'' +
                ", garums=" + garums +
                ", svarsGramos=" + svarsGramos +
                ", vecumsGados=" + vecumsGados +
                ", dzimums=" + dzimums +
                ", kurMiit='" + kurMiit + '\'' +
                ", cikReizesNokerta=" + cikReizesNokerta +
                ", vaiIrDziva=" + vaiIrDziva +
                ", vaiIrIzsalkusi=" + vaiIrIzsalkusi +
                '}');
    }
 //
 // PABAROT KAĶI
 // public void barotKaki(Fish zivs) {
 //        if (zivs.species.equals("Renģe")) {
 //            System.out.println("Fū, neēdīšu");
 //        } else if (zivs.species.equals("Lasis")) {
 //            vaiIzsalcis = false;
 //        }
    public void pabaroZivi(){
       if (vaiIrDziva = true) {
           if (vaiIrIzsalkusi = true) {
               svarsGramos = svarsGramos + 11;
               System.out.println("Zivs ēd, zivs svars pieaug līdz " + svarsGramos + " gramiem");
           } else {
               System.out.println( "Zivs nav izsalkusi, barot lieki");
           }
        } else {
           System.out.println(" Zivs ir beigta, neēdīs");
       }
    }
}
