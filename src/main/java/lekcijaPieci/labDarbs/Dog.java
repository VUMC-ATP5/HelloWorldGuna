package lekcijaPieci.labDarbs;

public class Dog extends Animal{
    public void makeSound(){
        System.out.println("VAU VAU VAU");
    }
    public void growl(){
        System.out.println("RRRRRRRRRRRRRRRRRRRRRRRRRR");

    }

    public Dog(int age) {
        super.age = age;
    }
}
