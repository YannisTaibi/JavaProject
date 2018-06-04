package model.Element;

import java.awt.Image;

public class Element implements IElement {

	/** The sprite. */
	private Sprite sprite;

	/** The permeability. */
	private Permeability permeability;

	/**
	 *
	 * @param sprite
	 * @param permeability
	 */
	public Element(Sprite sprite, Permeability permeability) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}

	@Override
	public Image getImage() {
		return this.getSprite().getImage();
	}

	@Override
	public Permeability getPermeability() {
		return this.permeability;
	}

	@Override
	public Sprite getSprite() {
		return this.sprite;
	}

	/**
	 *
	 * @param permeability
	 */
	private void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

	/**
	 *
	 * @param sprite
	 */
	protected void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}
}