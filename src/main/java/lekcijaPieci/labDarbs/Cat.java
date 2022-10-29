package lekcijaPieci.labDarbs;

public class Cat extends Animal {
//    public Cat(int age, boolean canClimbTrees) {
//        super(age, canClimbTrees);
//    }

    public void makeSound(){
        System.out.println("MIAU MIAU MIAU");
    }
    public void sharpenClaws(){
        System.out.println("I am sharpening my claws");
    }
    public void printClimbing(){
        System.out.println("Can a cat climb trees? " + canClimbTrees);
    }
}
