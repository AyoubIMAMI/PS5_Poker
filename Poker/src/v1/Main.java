package v1;

import v1.game_class.Card;
import v1.game_class.Hand;

import v1.game_engine.Controller;
import v1.game_engine.HandComparator;

import java.util.ArrayList;


//main class
public class Main {

	public static void main(String[] args) {
		Controller c = new Controller();
		c.launchGame();
		c.startGame();
	}
}
