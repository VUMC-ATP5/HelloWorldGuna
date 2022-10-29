package lekcijaPieci.labDarbs;


    public class House {
        private int stavuDaudzums;
        private int loguSkaits;
        private int durvjuSkaits;
        private String adrese;
        private double griestuAugstums;
        private boolean vaiPrivatipasums;
        private double kadastralaVertiba;

        public void setKadastralaVertiba(double kadastralaVertiba) {
            this.kadastralaVertiba = kadastralaVertiba;
        }

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


