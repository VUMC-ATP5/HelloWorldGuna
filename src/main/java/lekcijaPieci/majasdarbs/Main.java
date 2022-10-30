package lekcijaPieci.majasdarbs;

public class Main {
    public static void main(String[] args) {
        Cilindrs termoss = new Cilindrs() {
            @Override
            public void setRadius(double radius) {
                super.setRadius(radius);
            }

            @Override
            public void setAugstums(double augstums) {
                super.setAugstums(augstums);
            }

            @Override
            public double aprekinaCilindraTilpumu() {
                return super.aprekinaCilindraTilpumu();
            }

            @Override
            public double aprekinaCilindraVirsmasLaukumu() {
                return super.aprekinaCilindraVirsmasLaukumu();
            }
        };
        System.out.println("Termosa rādiuss ir " + termoss.getRadius() + " bet augstums ir " + termoss.getAugstums());

        System.out.println("Termosa tilpums ir " + termoss.aprekinaCilindraTilpumu());

        System.out.println("Termosa virsmas laukums ir " + termoss.aprekinaCilindraVirsmasLaukumu());

        Cilindrs muca = new Cilindrs(45,125.8);

        System.out.println("Mucas rādiuss ir " + muca.getRadius() + " bet augstums ir " + muca.getAugstums());

        System.out.println("Mucas tilpums ir " + muca.aprekinaCilindraTilpumu());

        System.out.println("Mucas virsmas laukums ir " + muca.aprekinaCilindraVirsmasLaukumu());
        }}








