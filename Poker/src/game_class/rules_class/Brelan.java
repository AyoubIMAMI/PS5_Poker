package game_class.rules_class;

import java.util.ArrayList;

import game_class.Card;

/**
 * A Brelan is composed of 3 cards having the same value.
 *
 * @author LE BIHAN L�o
 * @author IMAMI Ayoub
 * @author KARRAKCHOU Mourad
 */
public class Brelan extends Combo {

	/**
	 * Creates a Brelan.
	 * @param brelan List of 3 cards having the same value.
	 */
	public Brelan(ArrayList<Card> brelan) {
		this.name = "Brelan";
		this.priorityValue = 3;
		this.cardOfCombo = brelan;
		this.comboValue = brelan.get(0).getValue();
		this.type = 1;
	}


	@Override
	public boolean equals(Object o) {
		Brelan otherBrelan = (Brelan) o;
		if (this.comboValue == otherBrelan.getComboValue()) return true;
		return false;
	}
}
