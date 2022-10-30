package lekcijaCetri.majasdarbs.classHomework;

public class Triangle {
    public int malaA;
    public int malaB;
    public int malaC;
    double p;
    public double laukums;


    public Triangle() {
        System.out.println("Tiek veidots jauns trijstūris");
    }

    public double TriangleL(int malaA, int malaB, int malaC) {
        this.malaA = malaA;
        this.malaB = malaB;
        this.malaC = malaC;
        this.p = (malaA + malaB + malaC) / 2;
        this.laukums = Math.sqrt(p * (p - malaA) * (p - malaB) * (p - malaC));
        return laukums;
    }
    public boolean vaiIrTrijsturis() {
        System.out.println("Vai trijstūris ar šādiem malu garumiem ir  iespējams: ");
        return malaA < (malaB + malaC) && malaB < (malaA + malaC) && malaC < (malaA + malaB);
    }

    public boolean vaiIrVienadmalu() {
        System.out.println("Vai trijstūris ar malu garumiem: " + malaA + ", " + malaB + " un " + malaC + " ir vienādmalu: ");
        return malaA == malaB && malaB == malaC;
    }

    public boolean vaiIrVienadsanu() {
        System.out.println("Vai trijstūris ar malu garumiem: " + malaA + ", " + malaB + " un " + malaC + " ir vienādsānu: ");
        return malaA == malaB || malaB == malaC || malaA == malaC;
    }
}
