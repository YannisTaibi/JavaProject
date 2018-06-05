package model.Element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

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
		this(character, "noimage.jpg");
	}

	/**
	 *
	 * @param character
	 * @param imageName
	 */
	public Sprite(char character, String imageName) {
		this.setConsoleImage(character);
		this.setImageName(imageName);
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

	public void loadImage() throws IOException {
		this.setImage(ImageIO.read(new File("images/" + this.getImageName())));
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

	private void setImageName(final String imageName) {
		this.imageName = imageName;
	}

}