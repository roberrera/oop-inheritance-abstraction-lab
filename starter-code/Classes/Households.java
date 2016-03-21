package Classes;

/**
 * Created by Rob on 3/21/16.
 */
public abstract class Households implements Pets {
    public abstract int gainIncome();

    public double payTaxes(){
        double taxesPaid = gainIncome() * .2;
        return taxesPaid;
    }
}
