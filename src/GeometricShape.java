/**
 *         An abstract class that creates GeometricShape objects.
 *         @author bbabai00
 */
public abstract class GeometricShape implements Comparable<GeometricShape>, ASCIIDrawable {
	private boolean filled;
	
	/**
	 * constructor for making GeometricShapes.
	 * @author bbabai00
	 */
	public GeometricShape(boolean fill) {
		if(fill == true || fill == false) {
			this.filled = fill;
		} else {
			// creates a default filled GeometricShape
			// in case of a wrong input
			this.filled = true;
		}
	}
	
	/**
	 * default constructor for making GeometricShapes.
	 * creates a filled in shape.
	 * @author bbabai00
	 */
	public GeometricShape() {
			this(true);
	}
	
	/**
	 * A setter for GeometricShape being filled or not
	 * @param fill: a boolean containing the filled value
	 * @author bbabai00
	 */
	public void setFill(boolean fill) {
		if(fill == true || fill == false) {
			this.filled = fill;
		} 
	}
	
	/**
	 * A getter for GeometricShape being filled or not
	 * @return true or false
	 * @author bbabai00
	 */
	public boolean getFill() {
		return this.filled; 
	}
	
	/**
	 * the basic toString function for the GeometricShape Class
	 * @author bbabai00
	 */
	public String toString() {
		String result = "******* GeometricShape Summary *******";
		result += "\nFilled: " + this.getFill();
		return result + "\n";
	}
	
	/**
	 * An abstract function that gets the area of the shape
	 * @author bbabai00
	 */
	public abstract int getArea();
	
	/**
	 * An abstract function that gets the perimeter of the shape
	 * @author bbabai00
	 */
	public abstract int getPerimeter();
	
	/**
	 * A function that compares two GeometricShapes by their areas.
	 * @return an integer value (1 or 0 or -1) based on the comparison
	 * @author bbabai00
	 */
	public int compareTo(GeometricShape other) {
		if(this.getArea() == other.getArea()) {
			return 0;
		} else if(this.getArea() > other.getArea()) {
			return 1;
		} else {
			return -1;
		}
	}
}