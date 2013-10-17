import org.omg.CORBA.OMGVMCID;

public class Tuple implements Comparable {

	private int key;

	private Comparable value;

	public Tuple(int key, Comparable value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public Comparable getValue() {
		return value;
	}

	@Override
	public int compareTo(Object o) {
		Tuple tuple = (Tuple) o;
		if (key > tuple.getKey()) {
			return 1;
		} else if (key < tuple.getKey()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public String toString() {
		
		return "Key, Value: "+key+"\t "+value;
	}
}