/**
 *         A child class of the Rectangle Class.
 *         @author bbabai00
 */
public class Square extends Rectangle {
	/**
	 * constructor for making Squares.
	 * @author bbabai00
	 */
	public Square(int sideLength, boolean fill) {
		super(sideLength, sideLength, fill);
	}
	
	/**
	 * default constructor for making Squares.
	 * makes a filled Square with sideLength 1
	 * @author bbabai00
	 */
	public Square() {
		this(1, true);
	}
	
	/**
	 * A setter for width
	 * @param sideLength: new sideLength
	 * @author bbabai00
	 */
	public void setWidth(int sideLength) {
		super.setWidth(sideLength);
		super.setHeight(sideLength);
	}
	
	/**
	 * A setter for height
	 * @param sideLength: new sideLength
	 * @author bbabai00
	 */
	public void setHeight(int sideLength) {
		super.setWidth(sideLength);
		super.setHeight(sideLength);
	}
	
	/**
	 * the basic toString function for the Square Class
	 * @author bbabai00
	 */
	public String toString() {
		String result = "******* Square Summary *******";
		result += "\nFilled: " + this.getFill();
		result += "\nSide Length: " + this.getHeight();
		result += "\nArea: " + this.getArea();
		result += "\nPerimeter: " + this.getPerimeter();
		return result + "\n";
	}
}