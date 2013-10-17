import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Oppgave3a {

	@SuppressWarnings("unchecked")
	static Comparable[] sorterFrekvens(Comparable[] input) {
		Merge.sort(input);
		int counter = 0;

		ArrayList<Tuple> myData = new ArrayList<Tuple>();

		while (counter < input.length) {

			int howmany = 0;
			while ((counter + howmany + 1 < input.length)
					&& (input[counter + howmany].compareTo(input[counter
							+ howmany + 1])) == 0) {
				howmany++;
			}

			myData.add(new Tuple(howmany + 1, input[counter + howmany]));
			counter += howmany + 1;
		}

		Tuple[] returnable = new Tuple[myData.size()];

		for (int i = 0; i < myData.size(); i++) {
			returnable[i] = myData.get(i);
		}

		for (int i = 0; i < returnable.length; i++) {
			System.out.printf("Value, Key: %d\t %d\n",
			returnable[i].getValue(), returnable[i].getKey());
		}
		int countThis = 0;
		for (int i = input.length -1, j = 0; (i >= 0) && j<returnable.length; j++) {
			while (++countThis < returnable[j].getKey()) {
				input[i--] = returnable[j].getValue();
			}
			countThis = 0;
		}
		return input;
	}

	public static void main(String[] args) {
		Integer[] stuff = {3,4,1,8,5,3,5,5};
		
		Comparable[] somethingsomethingdarkside = sorterFrekvens(stuff);
		
		
		for (int i = 0; i < somethingsomethingdarkside.length; i++) {
			System.out.printf("%s \n", somethingsomethingdarkside[i].toString());
		}
	}
}