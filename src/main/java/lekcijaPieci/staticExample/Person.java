package lekcijaPieci.staticExample;

public class Person {
    public static int count = 1;
    public int id;
    public String name;

    public Person(String name) {
        this.name = name;
        id = count;
        count++;
    }
    public void printName(){
        System.out.println("Cilvēka vārds ir " + name);
        System.out.println("Darbinieka numurs ir " + id);
    }
}
