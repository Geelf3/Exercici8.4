
public class UsingComparator extends Cotxe implements Comparable<Object> {
	
	// Create the comparator method.
	@Override
	public int compareTo(Object obj) {
		// we want to compare the displacement.
		Cotxe that = (Cotxe) obj;
		int cilindrada1 = this.getCilindrada();
		int cilindrada2 = that.getCilindrada();
		// Compare both displacements
		if (cilindrada1 > cilindrada2)
			return 1;
		if (cilindrada1 < cilindrada2)
			return -1;
		return 0;
	}
}
