package game_class.rules_class;

import java.util.ArrayList;

import game_class.Card;

/**
 * A Quinte Flush is composed of 5 cards respecting the rules of Quinte and Flush.
 *
 * @author LE BIHAN L�o
 * @author IMAMI Ayoub
 * @author KARRAKCHOU Mourad
 */
public class QuinteFlush extends Combo {

    /**
     * Creates a Quinte Flush.
     * @param quinteFlush List of 5 cards respecting the rules of Quinte and Flush.
     */
    public QuinteFlush(ArrayList<Card> quinteFlush) {
        this.name = "Quinte Flush";
        this.priorityValue = 8;
        this.cardOfCombo = quinteFlush;
        this.comboValue = quinteFlush.get(quinteFlush.size()-2).getValue();
        this.type = 4; //pas utile
        this.comboColor = quinteFlush.get(0).getColor();
    }


    @Override
	public boolean equals(Object o) {
    	QuinteFlush other = (QuinteFlush) o;
		if(this.comboColor == other.getComboColor()) {
			Quinte currentQuinte = new Quinte(cardOfCombo);
			Quinte otherQuinte = new Quinte(other.getCardOfCombo());
			return currentQuinte.equals(otherQuinte);

		}
		return false;		
	}
}