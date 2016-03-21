package Main;

import Classes.House1;
import Classes.House2;
import Classes.Households;

public class Driver {

	public static void main(String[] args) {
		//Create households and add to list or array

		Households[] households = new Households[2];

		households[0] = new House1();
		households[1] = new House2();

		//iterate through list or array and perform required actions
		for (int i = 0; i < households.length; i++){
			households[i].gainIncome();
			households[i].payTaxes();
			households[i].feedPet();
			households[i].groomPet();
			households[i].playWithPet();
		}
	}

}
