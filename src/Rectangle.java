/**
 *         A child class of the GeometricShape Class.
 *         @author bbabai00
 */
public class Rectangle extends GeometricShape {
	private int width, height;
	
	/**
	 * constructor for making Rectangles.
	 * @author bbabai00
	 */
	public Rectangle(int w, int h, boolean fill) {
		super(fill);
		if(w > 0 && h > 0) {
			this.width = w;
			this.height = h;
		} else {
			// if the inputed values are wrong 
			// a default Rectangle will be made
			this.width = 1;
			this.height = 1;
		}
	}
	
	/**
	 * default constructor for making Rectangles.
	 * makes a filled rectangle with width and height 1
	 * @author bbabai00
	 */
	public Rectangle() {
		this(1, 1, true);
	}
	
	/**
	 * A setter for height
	 * @param h: new height
	 * @author bbabai00
	 */
	public void setHeight(int h) {
		if(h > 0) {
			this.height = h;
		} 
	}
	
	/**
	 * A getter for height
	 * @return height
	 * @author bbabai00
	 */
	public int getHeight() {
		return this.height; 
	}
	
	/**
	 * A setter for width
	 * @param w: new width
	 * @author bbabai00
	 */
	public void setWidth(int w) {
		if(w > 0) {
			this.width = w;
		} 
	}
	
	/**
	 * A getter for width
	 * @return width
	 * @author bbabai00
	 */
	public int getWidth() {
		return this.width; 
	}
	
	/**
	 * A function that gets the area of the shape
	 * @return int: area
	 * @author bbabai00
	 */
	public int getArea() {
		return getWidth() * getHeight();
	}
	
	/**
	 * A function that gets the perimeter of the shape
	 * @return int: perimeter
	 * @author bbabai00
	 */
	public int getPerimeter() {
		return 2 * (getWidth() + getHeight());
	}
	
	/**
	 * the basic toString function for the Rectangle Class
	 * @author bbabai00
	 */
	public String toString() {
		String result = "******* Rectangle Summary *******";
		result += "\nFilled: " + this.getFill();
		result += "\nHeight: " + this.getHeight();
		result += "\nWidth: " + this.getWidth();
		result += "\nArea: " + this.getArea();
		result += "\nPerimeter: " + this.getPerimeter();
		return result + "\n";
	}
	
	/**
	 * A function that draws the rectangle as a string
	 * @author bbabai00
	 */
	public String drawAsASCII() {
		String output = "";
		if(this.getFill()) {
			for(int i = 0; i < this.getHeight(); i++) {
				for(int j = 0; j < this.getWidth(); j++) {
					output += "#";
				}
				output += "\n";
			}
		} else {
			for(int i = 0; i < this.getHeight(); i++) {
				for(int j = 0; j < this.getWidth(); j++) {
					if(i == 0 || i == this.getHeight()-1 || j == 0 || j == this.getWidth()-1) {
						output += "#";
					} else {
						output += " ";
					}
				}
				output += "\n";
			}
		}
		return output;
	}
}