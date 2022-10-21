package lekcijaCetri.labDarbs;

public class Circle {
    double r;
    double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    public double rekinaRinkaLaukumu(){
        return PI * r * r;
    }
    public double rekinaRinkaLinijasGarumu(){
        return 2 * PI * r;
    }
}
