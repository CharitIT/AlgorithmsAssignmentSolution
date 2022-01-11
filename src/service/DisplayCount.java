package service;

public class DisplayCount {
	
	// Methods to display the No. of companies for which stock rose
	public void displayRise(boolean[] rise){
		int total = 0;
		for (int i=0;i<rise.length;i++){
			// Calculate the companies for which stocks rose
			if(rise[i]==true)
				total++;
		}
		// Print output
		System.out.println("Total no of companies whose stock price rose today : "+ total);
	}

	// Method to display the No. of companies for which stock declined
	public void displayDecline(boolean[] rise){
		int total = 0;
		for (int i=0;i<rise.length;i++){
			// Calculate the companies for which stocks declined
			if(rise[i]==false)
				total++;
		}
		// Print output
		System.out.println("Total no of companies whose stock price declined today : "+ total);
	}

}