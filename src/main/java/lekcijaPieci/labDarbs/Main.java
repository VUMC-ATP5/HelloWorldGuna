package lekcijaPieci.labDarbs;

public class Main {
    public static void main(String[] args) {
        Cat muris =  new Cat();
        Dog reksis = new Dog(7);
        Cow gauja = new Cow();

        muris.age = 3;
        muris.canClimbTrees = true;

        reksis.canClimbTrees = false;

        muris.breathe();
        reksis.breathe();

        muris.makeSound();
        reksis.makeSound();
        gauja.makeSound();

        muris.eat();
        reksis.eat();
        muris.sharpenClaws();
        reksis.growl();

        muris.printClimbing();

    House church = new House (2,30,2,"Doma laukums 1",20.3,false,3000000);

    church.printHouse();
    church.setKadastralaVertiba(12000000);
    church.printHouse();

    Calculator kalkulators = new Calculator();
        System.out.println(kalkulators.add(5,10));
        System.out.println(kalkulators.add(5.0,7.5));
    }
}
