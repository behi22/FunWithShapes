import java.util.Arrays;

/**
 *          A tester class that tests the other classes.
 *         @author bbabai00
 */
public class FunWithShapes {
	/**
	 *         our main function that starts testing stuff!
	 *         @author bbabai00
	 */
	public static void main(String[] args) {
		// An Array of GeometricShapes
		GeometricShape[] arr1 = {new Square(3, false), new Square(5, true), new Rectangle(7, 4, false), new Rectangle(4, 5, true), new Square(1, true)};
		System.out.println("Created an array of GeometricShapes: ");
		for(int i = 1; i <= arr1.length; i++) {
			System.out.println(i + ". " + arr1[i-1]);
		}
		
		// Comparison
		int res;
		// 1 & 2
		System.out.println("Comparing shapes 1 & 2 by their areas: ");
		res = arr1[0].compareTo(arr1[1]);
		switch(res) {
		case 1:System.out.println("Shape 1 is bigger."); break;
		case 0:System.out.println("Shapes 1 & 2 have the same area."); break;
		case -1:System.out.println("Shape 2 is bigger."); break;
		}
		// 3 & 4
		System.out.println("Comparing shapes 3 & 4 by their areas: ");
		res = arr1[2].compareTo(arr1[3]);
		switch(res) {
		case 1:System.out.println("Shape 3 is bigger."); break;
		case 0:System.out.println("Shapes 3 & 4 have the same area."); break;
		case -1:System.out.println("Shape 4 is bigger."); break;
		}
		// 4 & 5
		System.out.println("Comparing shapes 4 & 5 by their areas: ");
		res = arr1[3].compareTo(arr1[4]);
		switch(res) {
		case 1:System.out.println("Shape 4 is bigger."); break;
		case 0:System.out.println("Shapes 4 & 5 have the same area."); break;
		case -1:System.out.println("Shape 5 is bigger."); break;
		}
		
		// Sorting 1
		System.out.println("Sorting our array of GeometricShapes ascendingly by area: ");
		Arrays.sort(arr1);
		for(int i = 1; i <= arr1.length; i++) {
			System.out.println(i + ". " + arr1[i-1]);
		}
		
		// Sorting 2
		System.out.println("Sorting our array of GeometricShapes in descending order by perimeter: ");
		Arrays.sort(arr1, new ShapeComparator());
		for(int i = 1; i <= arr1.length; i++) {
			System.out.println(i + ". " + arr1[i-1]);
		}
		
		// An Array of ASCIIDrawables
		ASCIIDrawable[] arr2 = {new Square(3, false), new Square(5, true), new Rectangle(7, 4, false), new Marquee("Old Joe's Place"), new Rectangle(3, 3, false), new Square(4, true), new Marquee("This is my own private domicile!")};
		System.out.println("Created an array of ASCIIDrawables: ");
		for(int i = 1; i <= arr2.length; i++) {
			System.out.println(i + ". " + arr2[i-1]);
		}
		
		// Drawing
		System.out.println("Drawing the shapes of ASCIIDrawables array ...");
		for(int i = 0; i < arr2.length; i++) {
			System.out.println((i+1) + ".");
			System.out.println(arr2[i].drawAsASCII());
		}
		System.out.println("Drawing the shapes of GeometricShapes array ...");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println((i+1) + ".");
			System.out.println(arr1[i].drawAsASCII());
		}
		
		// Testing other stuff
		System.out.println("Looking for errors: ");
		Rectangle err1 = new Rectangle(-5, 0, true);
		System.out.println(err1);
		err1.setWidth(-3);
		err1.setHeight(-9);
		System.out.println(err1);
		
		Square err2 = new Square(-2, true);
		System.out.println(err2);
		err2.setWidth(3);
		err2.setHeight(4);
		System.out.println(err2);
		
		Marquee err3 = new Marquee(null);
		System.out.println(err3);
		err3.setMessage(null);
		System.out.println(err3);
	}
}