import java.util.Random;

public class longestRun {
	
	public static final int TOSSES = 20; 
	public static void main(String args[]) {
		Random rand = new Random();
		int[] dieValues = new int[TOSSES];
		for(int i = 0; i < TOSSES; i++) {
			dieValues[i] = rand.nextInt(6) + 1;
		}
		
		int maxRun = 0;
		int currentRun = 1;
		int maxRunFromIndex = 0;
		for(int i = 1; i < TOSSES; i++) {
			if(dieValues[i] == dieValues[i - 1]) {
				currentRun = currentRun + 1;
			}
			else {
				currentRun = 1;
			}
			if(currentRun > maxRun) {
				maxRun = currentRun;
				maxRunFromIndex = i - 1;
			}
		}
		
		boolean bracketStart = false;
		for(int i = 0; i < TOSSES - 1; i++) {
			if(i == maxRunFromIndex && maxRun != 1) {
				System.out.print("( ");
				bracketStart = true;
			}
			System.out.print(dieValues[i] + " ");
			if(dieValues[i] != dieValues[i + 1] && bracketStart == true) {
				System.out.print(") ");
				bracketStart = false;
			}
		}
		System.out.print(dieValues[TOSSES - 1] + " ");
		if(bracketStart == true) {
			System.out.print(") ");
		}
	}

}
