package object;

public class Animal {
    String  type ;
    boolean IsMammal;
    boolean IsCarnivore;
    int age;
    String  habitat;

    public void eat(){
        System.out.println(type + " is can eat 10 pound per second");
    }
    public void sleep(){
        System.out.println(IsCarnivore + " can sleep without food 9 month");
    }
    public void play(){
        System.out.println(IsMammal + " can use their brain better than people");

    }

}
