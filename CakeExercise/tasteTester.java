package CakeExercise;

public class tasteTester{
    public static void main(String[] args) {
        superCake superCake = new superCake("");
        superCake.setFlavor("Vanilla");
        birthdayCake birthdayCake = new birthdayCake("", 5);
        birthdayCake.setFlavor("Strawberry");

        superCake.setPrice(15.99);
        birthdayCake.setPrice(30.99);

        System.out.println("superCake Flavor: " + superCake.getFlavor());
        System.out.println("superCake Price: $" + superCake.getPrice());

        System.out.println("birthdayCake flavor: " + birthdayCake.getFlavor());
        System.out.println("birthdayCake Price: $" + birthdayCake.getPrice());
    }

}
