package object;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.type = "lion";
        animal1.IsMammal = true;
        animal1.IsCarnivore = false;
        animal1.age = 10;
        animal1.habitat = "Africa";


        Animal animal2 = new Animal();
        animal2.type = "Zebra";
        animal2.IsMammal = true;
        animal2.IsCarnivore = false;
        animal2.age = animal1.age;
        animal2.habitat = animal1.habitat;












    }
}
