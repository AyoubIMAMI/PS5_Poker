package v1.game_class.rules_class;

import v1.game_class.Card;

import java.util.ArrayList;

public class Brelan extends Combo {

    public Brelan(ArrayList<Card> brelan) {
        this.name = "Brelan";
        this.priorityValue = 3;
        this.cardOfCombo=brelan;
        this.comboValue = brelan.get(1).getValue();
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }
}
