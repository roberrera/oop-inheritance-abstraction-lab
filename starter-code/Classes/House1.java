package Classes;

/**
 * Created by Rob on 3/21/16.
 */
public class House1 extends Households {

    String pet = "Spike the dog";

    @Override
    public int gainIncome() {
        return 1000000;
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
        System.out.println("Play cops and robbers with "+pet);
    }
}
