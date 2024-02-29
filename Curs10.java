public class Curs10 {
    public static void main(String[] args) {

        Curs10_animal animal = new Curs10_animal();
        Curs10_Dog labrador = new Curs10_Dog();
        Curs10_cat ragdoll = new Curs10_cat();

        animal.makeSound();
        labrador.makeSound();
        ragdoll.makeSound();

        Curs10_animal catel = new Curs10_Dog();
        Curs10_animal motan = new Curs10_cat();

        catel.makeSound();
        motan.makeSound();
        catel.eSterilizat();
        ((Curs10_cat)motan).print();


    }

}

