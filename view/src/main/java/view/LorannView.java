package view;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.*;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import showboard.BoardFrame;
import controller.Order;
import model.ILevel;
import model.ILorannModel;
import model.IModel;


public class LorannView implements ILorannView {

	private static int levelView = 69;
	private static int squareSize = 69;
	
	
	private IModel model;
	private ILorannModel LorannModel;
	private ILevel level;
	private BoardFrame boardFrame;
	

		
	

	/**
	 *
	 * @param keyCode
	 */
/*	public static Order keyCodeToUserOrder(int keyCode) {
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
			order = order.MAGIC;
			break;
		default:
			order = order.NOP;
			break;
		}
		return order;
	}
*/
	private Rectangle closeWindow;
	private int view;
	//private IMobile myLorann;

	//private IOrderPerformer orderPerformer;

	/**
	 *
	 * @param level
	 * @param myLorann
	 
	/*
	public LorannView(ILevel level, IMobile myLorann) throws IOException {
		this.setView(levelView);
		this.setLevel(level);
		this.setMyLorann(myLorann);
		this.getMyLorann().getSprite().loadImage();
		this.setCloseView(new Rectangle(0, this.getMyLorann().getY(), this.getLevel().getWidth(), levelView));
		SwingUtilities.invokeLater(this);
	}*/

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

	/*private IOrderPerformer getOrderPerformer() {
		return this.orderPerformer;
	}*/
	
	

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
		boardFrame.setDimension(new Dimension(LorannModel.getLevel().getWidth(), LorannModel.getLevel().getHeight()));
		boardFrame.setDisplayFrame(this.closeWindow);
		boardFrame.setSize(this.closeWindow.width * squareSize, this.closeWindow.height * squareSize);
		boardFrame.setHeightLooped(true);
		boardFrame.addKeyListener(this);
		boardFrame.setFocusable(true);
		boardFrame.setFocusTraversalKeysEnabled(false);

		for (int x = 0; x < LorannModel.getLevel().getWidth(); x++) {
			for (int y = 0; y < LorannModel.getLevel().getHeight(); y++) {
				boardFrame.addSquare(this.level.getOnTheLevelXY(x, y), x, y);
			}
		}
		boardFrame.addPawn(LorannModel.getMyLorann());

		LorannModel.getLevel().getObservable().addObserver(boardFrame.getObserver());
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


}