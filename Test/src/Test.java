
public class Test {

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
