package v1.gameClass;

public class Card implements Comparable<Card>{
	private int value;
	
	public Card(int v) {
		this.value = v;
	}

	public int getValue() {
		return value;
	}
	
	public String toString(){
		return String.valueOf(this.value);
		}

	@Override
	public int compareTo(Card card) {
	 //trions les cartes selon leur valeurs dans l'ordre croissant
	 //retourne un entier n�gative, z�ro ou positive si l'age 
	 //de cet employ� est moins que, �gale � ou sup�rieur � l'objet compar� avec card
	       return (this.value - card.value);
	}
}

