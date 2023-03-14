package object;

public class Car {

    String model;
    int year;
    String price ;
    String color;


    public void drive(){
        System.out.println(model + " is the best one");
    }
    public void stop(){
        System.out.println("From" + year + " ended to create ");
    }
    public  void  playMusic(){
        System.out.println("His car turns to" + color + "color when he change music"  );
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model = "BMW";
        car1.year = 2023;
        car1.price = "billion";




    }


}

