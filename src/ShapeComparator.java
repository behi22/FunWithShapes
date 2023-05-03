import java.util.Comparator;

/**
 *         A Comparator that compares GeometricShape objects by perimeter and sorts them in descending order.
 *         @author bbabai00
 */
public class ShapeComparator implements Comparator<GeometricShape> {
	/**
	 * A function that compares two GeometricShapes by their perimeters.
	 * @return an integer value (1 or 0 or -1) based on the comparison
	 * @author bbabai00
	 */
	public int compare(GeometricShape g1, GeometricShape g2) {
		if(g1.getPerimeter() == g2.getPerimeter())
			return 0;
		else if(g1.getPerimeter() < g2.getPerimeter())
			return 1;
		else
			return -1;
	}
}