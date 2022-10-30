package lekcijaPieci.majasdarbs;

public class Cilindrs {
    private double radius = 12;
    private double augstums = 23.3;
    private double pi = 3.14;

    public void setRadius (double radius) {
        this.radius = radius;
    }
    public void setAugstums (double augstums) {
        this.augstums = augstums;
    }

    public double getRadius() {
        return radius;
    }

    public double getAugstums() {
        return augstums;
    }

    public double aprekinaCilindraTilpumu(){
        return pi * radius * radius * augstums;
    }

    public double aprekinaCilindraVirsmasLaukumu(){
        return 2 * pi * radius * radius + 2 * pi * radius * augstums;
    }

    public Cilindrs(){

    }

    public Cilindrs(double radius, double augstums) {
        this.radius = radius;
        this.augstums = augstums;
    }
}
