import java.util.Random;

public class Oppgave4aMerge {

	public static void main(String[] args) {
		
		Comparable[] flArray;
		flArray = new Comparable[100000];
		Random random = new Random();

		for (int i = 0; i < flArray.length; i++) {
			flArray[i] = random.nextFloat();
		}
		long startTime = System.currentTimeMillis();
		Merge.sort(flArray);
			
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		
		
		
		
	}
}