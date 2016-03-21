package Classes;

/**
 * Created by Rob on 3/21/16.
 */
public class House2 extends Households {

    String pet = "Sir Richard Branson";

    @Override
    public int gainIncome() {
        return 500000;
    }

    @Override
    public double payTaxes() {
        return super.payTaxes();
    }

    @Override
    public void feedPet() {
        System.out.println("Feed "+pet);
    }

    @Override
    public void groomPet() {
        System.out.println("Give "+pet+" a rocking hairstyle.");
    }

    @Override
    public void playWithPet() {
        System.out.println("Practice ninja skills with "+pet);
    }

}
