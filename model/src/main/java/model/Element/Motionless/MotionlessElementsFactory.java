package model.Element.Motionless;

public class MotionlessElementsFactory {

	private final static Key key = new Key();
	private final static ClosedDoor closedDoor = new ClosedDoor();
	private final static OpenedDoor openedDoor = new OpenedDoor();
	private final static Corner corner = new Corner();
	private final static VerticalWall verticalWall = new VerticalWall();
	private final static HorizontalWall horizontalWall = new HorizontalWall();
	private final static Treasure treasure = new Treasure();
	private final static Blank blank = new Blank();

	private static MotionlessElement[] motionlessElements = { key, closedDoor, openedDoor, corner, verticalWall,
			horizontalWall, treasure, };

	public MotionlessElement createBlank() {
		return blank;
	}

	public MotionlessElement createClosedDoor() {
		return closedDoor;
	}

	public MotionlessElement createCorner() {
		return corner;
	}

	public MotionlessElement createHorizontalWall() {
		return horizontalWall;
	}

	public MotionlessElement createKey() {
		return key;
	}

	public MotionlessElement createOpenedDoor() {
		return openedDoor;
	}

	public MotionlessElement createTreasure() {
		return treasure;
	}

	public MotionlessElement createVerticalWall() {
		return verticalWall;
	}

	/**
	 *
	 * @param fileSymbol
	 */
	public MotionlessElement getFromFileSymbol(char fileSymbol) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
				return motionlessElement;
			}
		}
		return blank;
	}

}