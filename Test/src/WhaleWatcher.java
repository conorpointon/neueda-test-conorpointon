import java.util.ArrayList;
import java.util.Collections;

public class WhaleWatcher {
	private ArrayList<Whale> whales;
	
	WhaleWatcher() {
		//Create list to store whales
		whales = new ArrayList<>();
	}
	
	void setWhales() {
		//add new whales to list
		whales.add(new Whale("Right", "Atlantic", 2001, 21, 16));
		whales.add(new Whale("Blue", "Pacific", 2001, 23, 16));
		whales.add(new Whale("Sperm", "Atlantic", 1900, 20, 40));
		whales.add(new Whale("Humpback", "Antarctic", 919, 13, 13));
	}
	
	void getWhaleInfo() {
		for(Whale whale : whales) {
			System.out.println(whale.toString());
		}
	}
	
	void getAtlanticWhales() {
		for(Whale whale : whales) {
			if(whale.getMainOcean().equals("Atlantic")) {
				System.out.println(whale.getName() + " Whale");
			}
		}
	}
	
	void getFastestWhales() {
		ArrayList<Integer> speeds = new ArrayList<>();
		
		for(Whale whale : whales) {
			speeds.add(whale.getMaxSpeed());
		}
		
		Collections.sort(speeds);
		
		for(Whale whale : whales) {
			if(whale.getMaxSpeed() == speeds.get(speeds.size() - 1)) {
				System.out.println(whale.getName() + " Whale");
			}
		}
	}
	
	void getAverageWhaleLength() {
		int average = 0;
		int whaleCount;
		
		whaleCount = whales.size();
		
		for(Whale whale : whales) {
			average += whale.getLength();
		}
		
		average /= whaleCount;
		System.out.println("The average whale length over " + whaleCount + " whale types is: " + average + "m");
	}
	
	void getHeaviestWhales() {
		ArrayList<Integer> weights = new ArrayList<>();
		
		for(Whale whale : whales) {
			weights.add(whale.getWeight());
		}
		
		Collections.sort(weights);
		
		for(Whale whale : whales) {
			if(whale.getWeight() == weights.get(weights.size() - 1)) {
				System.out.println(whale.getName() + " Whale");
			}
		}
	}
}
