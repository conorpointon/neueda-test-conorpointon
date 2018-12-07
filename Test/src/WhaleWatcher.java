import java.util.ArrayList;
import java.util.Collections;

public class WhaleWatcher {
	private ArrayList<Whale> whales;
	
	WhaleWatcher() {
		//Create list to store whales
		whales = new ArrayList<>();
	}
	
	//method adds new Whale objects to class property whales list
	void setWhales() {
		whales.add(new Whale("Right", "Atlantic", 2001, 21, 16));
		whales.add(new Whale("Blue", "Pacific", 2001, 23, 16));
		whales.add(new Whale("Sperm", "Atlantic", 1900, 20, 40));
		whales.add(new Whale("Humpback", "Antarctic", 919, 13, 13));
	}
	
	//method loops over whales list and calls each Whale objects toString method
	void getWhaleInfo() {
		for(Whale whale : whales) {
			System.out.println(whale.toString());
		}
	}
	
	//method loops over whales list to output name of all Atlantic whales
	void getAtlanticWhales() {
		for(Whale whale : whales) {
			
			//checks if the current indexed whale is Atlantic based
			if(whale.getMainOcean().equals("Atlantic")) {
				System.out.println(whale.getName() + " Whale");
			}
		}
	}
	
	//method loops over whales list to output name of fastest whales
	void getFastestWhales() {
		//new list to store whale speeds
		ArrayList<Integer> speeds = new ArrayList<>();
		
		//add all whale speeds to list
		for(Whale whale : whales) {
			speeds.add(whale.getMaxSpeed());
		}
		
		//sort list from slowest to fastest
		//default sort is Asc
		Collections.sort(speeds);
		
		for(Whale whale : whales) {
			//check if current indexed whales speed is equal to the highest speed in sorted list
			//this is done by getting the length of the list and decrementing this values by 1
			//as lists are zero based
			if(whale.getMaxSpeed() == speeds.get(speeds.size() - 1)) {
				System.out.println(whale.getName() + " Whale");
			}
		}
	}
	
	//method calculates the average length of all Whale objects in whales list
	void getAverageWhaleLength() {
		int average = 0;
		int whaleCount;
		
		//get total number of whales
		whaleCount = whales.size();
		
		//get total length of all whales
		for(Whale whale : whales) {
			average += whale.getLength();
		}
		
		//calculates the average and output
		average /= whaleCount;
		System.out.println("The average whale length over " + whaleCount + " whale types is: " + average + "m");
	}
	
	//method calculates the heaviest whales
	void getHeaviestWhales() {
		//create new list for weights
		ArrayList<Integer> weights = new ArrayList<>();
		
		//add all whale object weights to list
		for(Whale whale : whales) {
			weights.add(whale.getWeight());
		}
		
		//sort list from lightest to heaviest
		Collections.sort(weights);
		
		for(Whale whale : whales) {
			//check if current indexed whale is equal to heaviest value in list
			if(whale.getWeight() == weights.get(weights.size() - 1)) {
				System.out.println(whale.getName() + " Whale");
			}
		}
	}
}
