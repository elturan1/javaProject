package ifelse;


public class PracticeOrOperator {
    public static void main(String[] args) {

        String menu = "pizza lagman tea bread cake coffee water";

        if (menu.contains("pizza") && menu.contains("soda")){
            System.out.println("order pizza and soda");
        }
         if (menu.contains("tea") && menu.contains("coke")){
             System.out.println("dessert");
         }
         if (menu.contains("lagman") && menu.contains("tea")) {
             System.out.println("lagman and tea, asian is here");
         }
         if (menu.contains("coffee") || menu.contains("smoothie")){
             System.out.println("breakfast time");
         }
         if (menu.contains("pizza") || menu.contains("pasta")){
             System.out.println("italian day");
         }
         if (menu.contains("tea") && menu.contains("coffee") && menu.contains("water") && menu.contains("soda")){
             System.out.println("order only drinks");
         }













    }
}
