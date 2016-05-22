package platformer;

public class Game {
	
	private Window window;

	/**
	 * Main method
	 * 
	 * @param args - Command line arguments
	 */
	public static void main(String ... args) {
		new Game();
	}
	
	public Game() {
		window = new Window();
	}
}
