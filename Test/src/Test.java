

//
//This is a program that demonstrates OOP programming in Java
//It also demonstrates many other features of Java such as inheritance, access control, types,
//data structures etc, in order to output information via the WhaleWatcher class.

public class Test {

	//main method creates whale watcher object that calls multiple methods
	public static void main(String[] args) {
		WhaleWatcher whaleWatcher = new WhaleWatcher();
		
		whaleWatcher.setWhales();
		
		System.out.println("Whale information: ");
		whaleWatcher.getWhaleInfo();
		
		System.out.println("Atlantic Whales: ");
		whaleWatcher.getAtlanticWhales();
		
		System.out.println("\nFastest Whales: ");
		whaleWatcher.getFastestWhales();
		
		System.out.println("\nAverage Whale Length: ");
		whaleWatcher.getAverageWhaleLength();
		
		System.out.println("\nHeaviest Whales: ");
		whaleWatcher.getHeaviestWhales();
	}

}
