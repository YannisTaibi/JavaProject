package model.Element.Mobile;

import model.Element.Element;
import model.Element.Permeability;
import model.Element.Sprite;

public class Spell extends Mobile {

	private static final Sprite sprite = new Sprite('[', "spell.jpg");

	Spell() {
		super(sprite, null, Permeability.PENETRABLE);
	}

	public void killHostileOnContact() {
		// TODO - implement Spell.killHostileOnContact
		throw new UnsupportedOperationException();
	}

	public boolean testNextPosition() {
		// TODO - implement Spell.testNextPosition
		throw new UnsupportedOperationException();
	}

	public Element testPosition() {
		// TODO - implement Spell.testPosition
		throw new UnsupportedOperationException();
	}

}