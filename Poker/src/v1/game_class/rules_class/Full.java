package v1.game_class.rules_class;

import v1.game_class.Card;

import java.util.ArrayList;

public class Full  extends Combo{
    int additionalcombovalue;
    public Full(Combo brelan,Combo paire) {
        this.name = "Full";
        this.priorityValue =6;
        this.cardOfCombo.addAll(brelan.getCardOfCombo());
        this.cardOfCombo.addAll(paire.getCardOfCombo());
        this.comboValue = brelan.getComboValue();
        this.additionalcombovalue=paire.getComboValue();
        this.type=2;
    }

    @Override
    public String toString() {
        return null;
    }
}