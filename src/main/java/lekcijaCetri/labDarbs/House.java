package lekcijaCetri.labDarbs;

public class House {
    int stavuDaudzums;
    int loguSkaits;
    int durvjuSkaits;
    String adrese;
    double griestuAugstums;
    boolean vaiPrivatipasums;

    double kadastralaVertiba;

    public House(int stavuDaudzums, int loguSkaits, int durvjuSkaits, String adrese, double griestuAugstums, boolean vaiPrivatipasums, double kadastralaVertiba) {
        this.stavuDaudzums = stavuDaudzums;
        this.loguSkaits = loguSkaits;
        this.durvjuSkaits = durvjuSkaits;
        this.adrese = adrese;
        this.griestuAugstums = griestuAugstums;
        this.vaiPrivatipasums = vaiPrivatipasums;
        this.kadastralaVertiba = kadastralaVertiba;
    }

    public void printHouse() {
        System.out.println( "House{" +
                "stavuDaudzums=" + stavuDaudzums +
                ", loguSkaits=" + loguSkaits +
                ", durvjuSkaits=" + durvjuSkaits +
                ", adrese='" + adrese + '\'' +
                ", griestuAugstums=" + griestuAugstums +
                ", vaiPrivatipasums=" + vaiPrivatipasums +
                ", kadastralaVertiba=" + kadastralaVertiba +
                '}');
    }
}
