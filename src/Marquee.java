/**
 *         A class called  Marquee, that represents a sign containing a message.
 *         @author bbabai00
 */
public class Marquee implements ASCIIDrawable {
	private String message;
	
	/**
	 * constructor for making Marquees.
	 * @author bbabai00
	 */
	public Marquee(String msg) {
		if(msg != null) {
			this.message = msg;
		} else {
			this.message = "";
		}
	}
	
	/**
	 * default constructor for making Marquees.
	 * @author bbabai00
	 */
	public Marquee() {
		this("");
	}
	
	/**
	 * A setter for message
	 * @param msg: new message
	 * @author bbabai00
	 */
	public void setMessage(String msg) {
		if(msg != null) {
			this.message = msg;
		} 
	}
	
	/**
	 * A getter for message
	 * @return message
	 * @author bbabai00
	 */
	public String getMessage() {
		return this.message; 
	}
	
	/**
	 * the basic toString function for the Marquee Class
	 * @author bbabai00
	 */
	public String toString() {
		String result = "******* Marquee Summary *******";
		result += "\nMessage: " + this.getMessage();
		return result + "\n";
	}
	
	/**
	 * A function that draws the marquee as a string
	 * @author bbabai00
	 */
	public String drawAsASCII() {
		String output = "";
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < this.getMessage().length()+4; j++) {
				if(i == 0 || i == 4 || j == 0 || j == this.getMessage().length()+3) {
					output += "#";
				} else {
					if(i == 2 && j == 2) {
						output += (this.getMessage() + " #");
						j = this.getMessage().length()+4;
					} else {
						output += " ";
					}
				}

			}
			output += "\n";
		}
		return output;
	}
}