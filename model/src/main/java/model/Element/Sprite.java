package model.Element;

import java.awt.Image;

public class Sprite {

	private Image image;
	private String imageName;
	private char consoleImage;
	private boolean imageLoaded;

	/**
	 *
	 * @param character
	 */
	public Sprite(char character) {
		// TODO - implement Sprite.Sprite
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param character
	 * @param imageName
	 */
	public Sprite(char character, String imageName) {
		// TODO - implement Sprite.Sprite
		throw new UnsupportedOperationException();
	}

	public char getConsoleImage() {
		return this.consoleImage;
	}

	public Image getImage() {
		return this.image;
	}

	public String getImageName() {
		return this.imageName;
	}

	public boolean isImageLoaded() {
		return this.imageLoaded;
	}

	public void loadImage() {
		// TODO - implement Sprite.loadImage
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param consoleImage
	 */
	private void setConsoleImage(char consoleImage) {
		this.consoleImage = consoleImage;
	}

	/**
	 *
	 * @param image
	 */
	private void setImage(Image image) {
		this.image = image;
	}

	/**
	 *
	 * @param isImageLoaded
	 */
	public void setImageLoaded(boolean isImageLoaded) {
		this.imageLoaded = isImageLoaded;
	}

	private String setImageName() {
		// TODO - implement Sprite.setImageName
		throw new UnsupportedOperationException();
	}

}