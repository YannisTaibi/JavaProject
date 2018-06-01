package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import placeholders.ILevel;
import placeholders.IMobile;
import placeholders.IOrderPerformer;
import showboard.BoardFrame;

public class LorannView implements ILorannView {

	private static int levelView = 69;
	private static int squareSize = 69;

	/**
	 *
	 * @param keyCode
	 */
	public static Order keyCodeToUserOrder(int keyCode) {
		Order order;
		switch (keyCode) {
		case KeyEvent.VK_RIGHT:
			order = order.RIGHT;
			break;
		case KeyEvent.VK_LEFT:
			order = order.LEFT;
			break;
		case KeyEvent.VK_UP:
			order = order.UP;
			break;
		case KeyEvent.VK_DOWN:
			order = order.DOWN;
			break;
		case KeyEvent.VK_SPACE:
			order = order.CASTSPELL;
			break;
		default:
			order = order.NOP;
			break;
		}
		return order;
	}

	private Rectangle closeWindow;
	private int view;
	private ILevel level;
	private IMobile myLorann;

	private IOrderPerformer orderPerformer;

	/**
	 *
	 * @param level
	 * @param myLorann
	 */
	public LorannView(ILevel level, IMobile myLorann) throws IOException {
		this.setView(levelView);
		this.setLevel(road);
		this.setMyLorann(myLorann);
		this.getMyLorann().getSprite().loadImage();
		this.setCloseView(new Rectangle(0, this.getMyLorann().getY(), this.getLevel().getWidth(), levelView));
		SwingUtilities.invokeLater(this);
	}

	/**
	 *
	 * @param message
	 */
	@Override
	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	@Override
	public void followMyLorann() {
		this.getCloseView().y = this.getMyLorann().getY() - 1;

	}

	private Rectangle getCloseWindow() {
		return this.closeWindow;
	}

	public ILevel getLevel() {
		return this.level;
	}

	private IOrderPerformer getOrderPerformer() {
		return this.orderPerformer;
	}

	/**
	 *
	 * @param keyEvent
	 */
	public void keyPressed(KeyEvent keyEvent) {
		try {
			this.getOrderPerformer().orderPerform(keyCodeToUserOrder(keyEvent.getKeyCode()));
		} catch (final IOException exception) {
			exception.printStackTrace();
		}
	}

	/**
	 *
	 * @param keyEvent
	 */
	public void keyReleased(KeyEvent keyEvent) {

	}

	/**
	 *
	 * @param keyEvent
	 */
	public void keyTyped(KeyEvent keyEvent) {

	}

	public void run() {
		final BoardFrame boardFrame = new BoardFrame("Close view");
		boardFrame.setDimension(new Dimension(this.getLevel().getWidth(), this.getLevel().getHeight()));
		boardFrame.setDisplayFrame(this.closeView);
		boardFrame.setSize(this.closeView.width * squareSize, this.closeView.height * squareSize);
		boardFrame.setHeightLooped(true);
		boardFrame.addKeyListener(this);
		boardFrame.setFocusable(true);
		boardFrame.setFocusTraversalKeysEnabled(false);

		for (int x = 0; x < this.getLevel().getWidth(); x++) {
			for (int y = 0; y < this.getLevel().getHeight(); y++) {
				boardFrame.addSquare(this.level.getOnTheLevelXY(x, y), x, y);
			}
		}
		boardFrame.addPawn(this.getMyLorann());

		this.getLevel().getObservable().addObserver(boardFrame.getObserver());
		this.followMyLorann();

		boardFrame.setVisible(true);
	}

	/**
	 *
	 * @param window
	 */
	private void setCloseWindow(Rectangle closewindow) {
		this.closeWindow = closewindow;
	}

	/**
	 *
	 * @param orderPerformer
	 */
	public void setOrderPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}

	/**
	 *
	 * @param view
	 */
	private void setView(int view) {
		this.view = view;
	}

	/**
	 *
	 * @param xStart
	 * @param yStart
	 */
	public void show(int xStart, int yStart) {
		int y = yStart % this.getLevel().getHeight();
		for (int view = 0; view < this.getView(); view++) {
			for (int x = 0; x < this.getLevel().getWidth(); x++) {
				if ((x == this.getMyLorann().getX()) && (y == yStart)) {
					System.out.print(this.getMyLorann().getSprite().getConsoleImage());
				} else {
					System.out.print(this.getLevel().getOnTheLevelXY(x, y).getSprite().getConsoleImage());
				}
			}
			y = (y + 1) % this.getLevel().getHeight();
			System.out.print("\n");
		}
	}

}